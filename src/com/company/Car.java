package com.company;

public class Car {

        private String volume;
        private String model;

        public Car(String volume,String model) {
            this.volume = volume;
            this.model = model;
        }

        public String getModel() {
            return volume;
        }

        public void setModel(String model) {
            this.volume = model;
        }

        public void printInfo(){
            System.out.println(getClass().getSimpleName() + " " + volume+model);
            System.out.println("_______________________");











}

}



