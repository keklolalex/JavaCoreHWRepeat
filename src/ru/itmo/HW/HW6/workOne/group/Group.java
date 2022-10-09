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

    private final Climber[] groupClimbers;

    private final Mountain mountain;

    public Group(int groupSize, Mountain mountain) {
        this.groupClimbers = new Climber[groupSize];
        this.mountain = mountain;
    }

    public void addClimber (Climber climber){
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
