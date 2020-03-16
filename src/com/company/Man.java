package com.company;

public class Man {
    //реализуем свойство объекта от нашего интерфейса
    public TypesMove typeMoving;
    int weight;
    String name;
    Man(String Name,int Weight,TypesMove move){
        //присваеваем нашему свойству созданную логику
        typeMoving = move;
        name = Name;
        weight = Weight;
    }
    public void Move(){
        //функция, которая будет вызывать нашу логику
        typeMoving.Move(name);
    }
}
