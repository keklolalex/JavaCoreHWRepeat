package ru.itmo.HW.HW6.workOne;

import ru.itmo.HW.HW6.workOne.climber.Climber;
import ru.itmo.HW.HW6.workOne.group.Group;
import ru.itmo.HW.HW6.workOne.mountain.Mountain;

import java.util.Arrays;
import java.util.Random;


public class Application { //main
    public static void main(String[] args) {

        Random rnd = new Random();
        String[] climbers = {"Vova", "Esuf", "Alibek", "Trasher", "Alik", "Sproot", "Kirit", "Hobbit", "Tom", "Groot", "Blood"};
        String[] city = {"Moskvay", "Yaltar", "Pariser", "Trumber", "Mexico", "Bali", "Peterburg", "Vladivostok", "Krasher", "Ottober", "Mayami"};
        String[] mountain = {"Everest", "Kilimandzaro", "Zakvaska"};
        String[] country = {"Rossya", "China", "Marris", "Paris"};
        int[] high = {1000, 3000, 300, 50, 450 };

        Climber[] randomClimber = new Climber[10];
        for (int i = 0; i < randomClimber.length; i++) {
            randomClimber[i] = new Climber(climbers[rnd.nextInt(climbers.length)], city[rnd.nextInt(city.length)]);
        }

        System.out.println(Arrays.toString(randomClimber));

        Mountain mountain01 = new Mountain(mountain[rnd.nextInt(mountain.length)],
                country[rnd.nextInt(country.length)], high[rnd.nextInt(high.length)]);
        Mountain mountain02 = new Mountain(mountain[rnd.nextInt(mountain.length)],
                country[rnd.nextInt(country.length)], high[rnd.nextInt(high.length)]);
        Mountain mountain03 = new Mountain(mountain[rnd.nextInt(mountain.length)],
                country[rnd.nextInt(country.length)], high[rnd.nextInt(high.length)]);



        Group group01 = new Group(3, mountain01);
        Group group02 = new Group(5, mountain02);
        Group group03 = new Group(2, mountain03);

        group01.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group01);
        group01.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group01);
        group01.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group01);
        group02.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group02);
        group02.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group02);
        group02.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group02);
        group02.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group02);
        group02.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group02);
        group03.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group03);
        group03.addClimber(randomClimber[rnd.nextInt(randomClimber.length)]);
        System.out.println(group03);

        System.out.println(group01);
        System.out.println(group02);
        System.out.println(group03);




//        group01.addClimber(climber01);
//        group02.addClimber(climber02);
//        group03.addClimber(climber03);



    }
}
