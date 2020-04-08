package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Большой класс издателя. В зависимости от приходящего event забирается список из Map и происходит его
//обработка
public class publisher {
    //мап с нашими слушителями
    Map<String, List<EventListener>> listMap = new HashMap<>();

    //создаем издателя и заполняем карту пустыми массивами
    publisher(String... operations){
        for (String operation : operations){
            this.listMap.put(operation, new ArrayList<>());
        }
    }

    //подписка = получаем массив по типу оповещения и добавляем юзера
    public void subscribe(String event, EventListener listener){
        List<EventListener> users = listMap.get(event);
        users.add(listener);
    }

    //отказ от подписки = массив и удаляем юзера
    public void unsubscribe(String event, EventListener listener){
        List<EventListener> users = listMap.get(event);

        users.remove(listener);

    }
    //оповещение = получаем массив юзеров и вызываем у них оповещение
    public void newPost(String event){
        List<EventListener> users = listMap.get(event);
        for (EventListener listener: users){
            listener.update(event);
        }
    }
}
