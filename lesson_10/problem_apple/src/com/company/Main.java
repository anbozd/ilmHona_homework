package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Apple apple_1 = new Apple();
        apple_1.sort = "Вильямс Прайд";
        apple_1.color = "Красное";
        apple_1.clabber="нет";
        Apple apple_2 =new Apple();
        apple_2.sort = "Антоновка";
        apple_2.color="Зелёное";
        apple_2.clabber="Да";
        Apple apple_3 =new Apple();
        apple_3.sort = "Зимний сорт";
        apple_3.color = "Красное";
        apple_3.color="Нет";
        System.out.println("Сорт: "+ apple_1.sort + "; Цвет: " + apple_1.color+ "; Кислое: " + apple_1.clabber);
        System.out.println("Сорт: "+ apple_2.sort + "; Цвет: " + apple_2.color+ "; Кислое: " + apple_2.clabber);
        System.out.println("Сорт: "+ apple_3.sort + "; Цвет: " + apple_3.color+ "; Кислое: " + apple_3.clabber);
    }
}
class Apple{
    String sort;
    String color;
    String clabber;
}