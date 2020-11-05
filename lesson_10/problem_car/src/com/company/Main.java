package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car_1 = new Car();
        car_1.name ="Range rover";
        car_1.yearOfFoundation = 1970;
        car_1.color ="Белый";
        car_1.type="Внедорожник";
        Car car_2 =new Car();
        car_2.name="Rolls roys";
        car_2.yearOfFoundation=1904;
        car_2.color="Чёрный";
        car_2.type="Комби";
        Car car_3 =new Car();
        car_3.name="HYUNDAI";
        car_3.yearOfFoundation=2020;
        car_3.color ="Crystal White";
        car_3.type="Универсал";
        Car car_4 = new Car();
        car_4.name="HYUNDAI Creta NEW Style";
        car_4.yearOfFoundation=2020;
        car_4.color="Earth Brown";
        car_4.type="Универсал";
        System.out.println("Название:" + car_1.name + "; Год основания: " + car_1.yearOfFoundation + "; Цвет: "+ car_1.color + "; Тип: "+car_1.type);
        System.out.println("Название:" + car_2.name + "; Год основания: " + car_2.yearOfFoundation + "; Цвет: "+ car_2.color + "; Тип: "+car_2.type);
        System.out.println("Название:" + car_3.name + "; Год основания: " + car_3.yearOfFoundation + "; Цвет: "+ car_3.color + "; Тип: "+car_3.type);
        System.out.println("Название:" + car_4.name + "; Год основания: " + car_4.yearOfFoundation + "; Цвет: "+ car_4.color + "; Тип: "+car_4.type);

    }
}
class Car {
    String name;
    int yearOfFoundation;
    String color;
    String type;
}
