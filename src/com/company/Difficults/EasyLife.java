package com.company.Difficults;

import com.company.difficulties.*;
import com.company.DifficultLife;
import com.company.Problems;

import java.util.Random;

public class EasyLife implements DifficultLife {

    @Override
    public Problems[] create() {
        Problems[] problems;
        Random random = new Random();
        System.out.println("Вы выбрали легкий жизненный путь");
        int q = random.nextInt(4)+3;
        problems = new Problems[q];
        System.out.println("Количество препятсвий в вашей жизни: "+String.valueOf(q));
        for(int i=0;i<q;i++){
            int j = random.nextInt(4);
            switch (j){
                case 0:
                    problems[i] = new ilness();
                    break;
                case 1:
                    problems[i] = new poverty();
                    break;
                case 2:
                    problems[i] = new unlucky();
                    break;
                case 3:
                    problems[i] = new deception();
                    break;
            }
        }
        return problems;
    }
}
