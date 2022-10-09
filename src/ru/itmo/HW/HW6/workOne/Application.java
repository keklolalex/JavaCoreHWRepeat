package ru.itmo.HW.HW6.workOne;

import ru.itmo.HW.HW6.workOne.climber.Climber;
import ru.itmo.HW.HW6.workOne.group.Group;
import ru.itmo.HW.HW6.workOne.mountain.Mountain;

import java.util.Random;


public class Application { //main
    public static void main(String[] args) {

        Random rnd = new Random();
        String[] climbers = {"Vova", "Esuf", "Alibek", "Trasher", "Alik", "Sproot", "Kirit", "Hobbit", "Tom", "Groot", "Blood"};
        String[] city = {"Moskvay", "Yaltar", "Pariser", "Trumber", "Mexico", "Bali", "Peterburg", "Vladivostok", "Krasher", "Ottober", "Mayami"};
        String[] mountain = {"Everest", "Kilimandzaro", "Root"};
        String[] country = {"Rossya", "China", "Marris", "Paris"};
        int[] high = {1000, 3000, 300, 50, 450 };


        Climber climber01 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber02 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber03 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber04 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber05 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber06 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber07 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);
        Climber climber08 = new Climber(climbers[rnd.nextInt(climbers.length-1)], city[rnd.nextInt(city.length-1)]);

        Mountain mountain01 = new Mountain(mountain[rnd.nextInt(mountain.length-1)],
                country[rnd.nextInt(country.length-1)], high[rnd.nextInt(high.length - 1)]);
        Mountain mountain02 = new Mountain(mountain[rnd.nextInt(mountain.length-1)],
                country[rnd.nextInt(country.length-1)], high[rnd.nextInt(high.length - 1)]);

        Group group01 = new Group(3, mountain01);
        Group group02 = new Group(2, mountain02);
        Group group03 = new Group(2, mountain01);

//        group01.addClimber(climber01);
//        group02.addClimber(climber02);
//        group03.addClimber(climber03);

        for (int i = 0; i < group01[0]; i++) {
            mountain[rnd.nextInt(mountain.length-1)]
        }







    }
}
