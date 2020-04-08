package com.company;


//ООП паттерн Наблюдатель
//Есть базовый издатель, в котором есть функции подписки, отписки, оповещения
// и конструктор в котором генерируется hashmap <"ключ оповещения", массив слушателей>
//конкретный издатель в конструкторе которого реализуем конкретные оповещения
//создаем слушателей с подключенным интерфейсом оповещения
//в основном теле программы создаем объекты слушателей и подписываем на оповещения
//теперь при вызове от конкретного издателя оповещения сработает функция оповещения


public class Main {

    public static void main(String[] args) {
	    System.out.println("Observer");
	    //создаем юзеров и издателя
        MarvelListener Vasya = new MarvelListener("Вася");
        DCListener Petya = new DCListener("Петя");
        comics Editor = new comics();

        //подписываем челиков
        Editor.events.subscribe("Marvel", Vasya);
        Editor.events.subscribe("DC", Petya);

        //оповещаем челиков
        Editor.marvel();
        Editor.DC();

        //вася отказывается от подписки
        Editor.events.unsubscribe("Marvel",Vasya);
        //вася не получит оповещение
        Editor.marvel();
    }
}
