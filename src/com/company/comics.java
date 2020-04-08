package com.company;

//Это конкретный издатель чего-то
//Его хотят слушать слушатели
public class comics{
    public publisher events;

    //создаем издателя с оповещениями на Марвел и дс
    comics(){
        this.events = new publisher("Marvel","DC");
    }

    //оповещаем
    public void marvel(){
        //******
        //Тут может быть логика для оповещения
        //******
        events.newPost("Marvel");
    }

    public void DC(){
        //******
        //Тут может быть логика для оповещения
        //******
        events.newPost("DC");
    }
}
