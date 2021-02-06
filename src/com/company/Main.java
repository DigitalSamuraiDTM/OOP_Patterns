package com.company;

/*
* Адаптер - паттерн, который позволяет получить нужный функционал из глубоких дебрей
* и реализовать его в своем интерфейсе, предварительно адаптируя под нужды
*  */
public class Main {

    public static void main(String[] args) {
	    System.out.println("Adapter");

	    //наш финальный класс, с реализованным функционалом "спрятанного" класса
	    ClassWithAdapter classWithAdapter = new ClassWithAdapter();
	    //при чем данные, которые мы отправляем будут конвертированы в числовое значение путем выполнения
		//сложнейшего алгоритма, что позволяет сделать адаптер
	    classWithAdapter.callFunction("data");

    }
}
