package com.company;

//Шаблон Фабричный метод
//Тот же шаблон стратегия, только с генерацией объектов
//как говорил великий: фабричный метод - стратегия создания объектов

import com.company.Difficults.EasyLife;
import com.company.Difficults.HardLife;
import com.company.Difficults.MiddleLife;
import com.company.Difficults.UnrealLife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    System.out.println("FactoryMethod");
	    System.out.println("Выберите свой путь:\nПростой - 1\nОбычный - 2\nСложный - 3\nНевозможно - 4");
		int diff  = new Scanner(System.in).nextInt();
		//выбираем тип создания объектов
		DifficultLife LifeProblems;
	    switch (diff){
			case 1:
				LifeProblems = new EasyLife();
				break;
			case 2:
				LifeProblems = new MiddleLife();
				break;
			case 3:
				LifeProblems = new HardLife();
				break;
			case 4:
				LifeProblems = new UnrealLife();
				break;
			default:
				System.out.println("Таких путей не бывает");
				return;
		}
		Life YourLife = new Life(LifeProblems);


    }
}
