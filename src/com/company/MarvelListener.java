package com.company;


//Любитель комиксов Marvel
public class MarvelListener implements  EventListener {
    String name;
    public MarvelListener(String name){
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Марвел выпустили новый комикс для вас, "+name);
    }
}
