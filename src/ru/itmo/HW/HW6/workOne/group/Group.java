package ru.itmo.HW.HW6.workOne.group;

import ru.itmo.HW.HW6.workOne.climber.Climber;
import ru.itmo.HW.HW6.workOne.mountain.Mountain;

import java.util.Arrays;

/*
Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
- идёт набор в группу или нет;
- массив альпинистов;
- гора;
- должна быть возможность добавить альпиниста в группу, если набор ещё идёт
 */
public class Group { //группа

    private int index;
    private final Climber[] groupClimbers;

    private final Mountain mountain;

    private int groupSize;

    public int getGroupSize() {
        return groupSize;
    }



    public Group(int groupSize, Mountain mountain) {
        this.groupClimbers = new Climber[setGroupSize(groupSize)];
        this.mountain = mountain;
    }

    public int setGroupSize(int groupSize) {
        if (groupSize >= 10){
            throw new IllegalArgumentException("Группа не безопасна");
        }
        if (groupSize <= 0){
            throw new IllegalArgumentException("Группа не существует");
        }
        return groupSize;
    }
    public void addClimber (Climber climber){

//        if ()
//        groupClimbers[index] = climber;
//        index++;

        int freeSpaceIndex = getFreeSpaceIndex();
        if (freeSpaceIndex == -1){
            System.out.println("Группа заполнена. Альпинист не будет добавлен: " + climber);
            return;
        }
        for (Climber groupClimber : groupClimbers) {
            if (climber == groupClimber){
                System.out.println("Альпинист уже есть в группе. Данный альпиниста: " + climber);
                return;
            }
        }
        groupClimbers[freeSpaceIndex] = climber;
        System.out.println("Альпенист: " + climber + "добавлен в группу для восхождения на гору: " + mountain.getName());

        if (isOpen()){
            System.out.println("Набор открыт");
        }
        else System.out.println("Набор закрыт");
    }

    /**
     *
     * @return возвращает индекс массива если есть свободное место, либо -1 если мест нет
     */
    private int getFreeSpaceIndex (){
        for (int i = 0; i < groupClimbers.length; i++) {
            if (groupClimbers[i] == null){
                return i;
            }
        }
        return -1;
    }

    private boolean isOpen(){
        if(getFreeSpaceIndex() == -1){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupClimbers=" + Arrays.toString(groupClimbers) +
                ", mountain=" + mountain +
                '}';
    }
}
