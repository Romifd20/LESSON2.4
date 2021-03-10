package com.company;

public interface Printable <E extends Car> {
    void print(E car);

   void printIn(E car);

}
