package com.company;


//Шаблон стратегия. Поведенческий шаблон.
//Реализуем несколько алгоритмов на основе созданного интерфейса
//В основном классе создаем свойство на основе интерфейса
//И по необходимости создаем для него наши алгоритмы
public class Main {

    public static void main(String[] args) {

    System.out.println("Pattern strategy");

    //создаем объекты и к ним создаем нашу логику. Вызываем эту логику
    Man Andrew = new Man("Andrew", 150,new FlyMove());
    Andrew.Move();
    Man Vasya = new Man("Vasya", 30,new RunMove());
    Vasya.Move();
    Man Petya = new Man("Petya", 65, new CarMove());
    Petya.Move();
    Petya.typeMoving = new RunMove();
    Petya.Move();
    //Так тоже можно вызвать, но нужно будет постоянно передавать параметры
    Petya.typeMoving.Move(Petya.name);

    }
}
