package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Porshe porshe =new Porshe("4.5","loshadka");
        System.out.println("-------------------------------------");
        Mersedes mersedes = new Mersedes("5.4","Benz50");
        Toyota toyota = new Toyota("2.5","camri 3.5");
        Garage garage = new Garage(new ArrayList());
        porshe.printInfo();
        mersedes.printInfo();
        toyota.printInfo();
        garage.print(porshe);
        garage.printIn(porshe);
        garage.print(mersedes);
        garage.printIn(mersedes);
        garage.print(toyota);
        garage.printIn(toyota);

	
    }
}
