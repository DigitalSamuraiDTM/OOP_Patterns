package com.company;

//итоговый класс, функционал которого основан на интерфейса с функционалом спрятанного класса
public class ClassWithAdapter {
    Interface adapter;
    public ClassWithAdapter(){
        adapter = new Adapter();
    }
    public void callFunction(String data){
        //функция недоступна из-за приведения к интерфейсу
        //adapter.OtherFunction();
        adapter.FinalFunction(data);
    }
}
