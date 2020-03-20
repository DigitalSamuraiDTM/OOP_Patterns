package com.company;

import java.util.Random;

public class Life {
    Random random;

    Life(DifficultLife lifeProblems){
        random = new Random();

        //создаем жизненную начинку
        System.out.println("Создаем ваших друзей:");
        for (int i=0;i<random.nextInt(6);i++){
            friends friend = new friends();
        }

        System.out.println("\nСоздаем вашу семью\n");
        parents parents = new parents();


        System.out.println("Создаем трудности, с которыми вы столкнетесь в жизни:");
        //Создаем трудности с помощью фабричного метода.
        Problems[] problems = lifeProblems.create();
    }
}
