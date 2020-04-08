package com.company;


//Любител комиксов DC

public class DCListener implements EventListener {
    String name;
    public DCListener(String name){
        this.name = name;
    }


    @Override
    public void update(String event) {
        System.out.println("DC выпустили новый комикс для вас, "+name);
    }
}
