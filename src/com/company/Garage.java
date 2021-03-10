package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage <E extends Car> implements Printable {
    private ArrayList<E> avtos;

    public Garage(ArrayList<E> avtos) {
        this.avtos = avtos;

    }

    public ArrayList<E> getAvtos() {
        return avtos;


    }


    @Override
    public void printIn(Car car) {
        avtos.add((E) car);
        System.out.println("--------------------------------------");
        System.out.println(car.getClass().getSimpleName() + " " + car.getModel() +"  В ГАРАЖЕ ");
    }

    @Override
public  void print(Car car){
        if (avtos.contains(car)){
            avtos.remove((E) car);
            System.out.println(car.getClass().getSimpleName() + " " + car.getModel() +"НЕТУ В ГАРАЖЕ" );
            System.out.println("------------------------------------");

        }else {
            System.out.println("МАШИНА ВЫЕХАЛ");

        }

    }
}







