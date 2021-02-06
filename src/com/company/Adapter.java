package com.company;


//Адаптер, который позволит нам получить функционал в нужном нам виде
//где нужный вид это интерфейс с реализованным в нем функционалом из спрятанного класса
public class Adapter extends HiddenClass implements Interface {
    @Override
    public void FinalFunction(String data) {
        System.out.println("Мы можем дополнять или адаптировать функционал");
        int newData = -1;
        if (data.equals("data")){
            newData = 100500;
        } else{
            newData = 500100;
        }
        this.Function(newData);
        System.out.println("Дописывая необходимое в классе адаптера");
    }
    //эта функция, которая не будет доступна, так как мы приведем объект к интерфейсу
    public void OtherFunction(){
        System.out.println("Что я здесь забыл?");
    }
}
