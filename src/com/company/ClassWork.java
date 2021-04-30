package com.company;

public class ClassWork {

    static void toString( Car car){
        System.out.println(
                "name:" + car.name+"\n"+
                        "model:"+ car.model+"\n"+
                        "price:"+ car.price
        );
    }


    public static void main(String[] args) {
        int a = 5;
        Car car = new Car();
        car.name = "matiz";
        car.model = "chevrolet";
        car.price = 5500;

        Car car1 = new Car();
        car1.name = "spark";
        car1.model = "chevrolet";
        car1.price = 6000;
        toString(car);
        toString(car1);

    }
}
