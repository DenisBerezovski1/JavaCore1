package ru.company.jcore.JC1.main;

import ru.company.jcore.JC1.logics.*;
import ru.company.jcore.JC1.views.Conole;
import java.util.ArrayList;
import ru.company.jcore.JC1.decorators.Decorator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> data = Conole.userData();
        double result = Logic.indexCount(data.get(0), data.get(1));
        Decorator.decorate(result);
     }     
}
