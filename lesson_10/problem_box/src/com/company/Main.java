package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box box_1 = new Box();
        box_1.height = 40;
        box_1.width =60;
        box_1.material="Пластик";
        box_1.weight=100;
        Box box_2 = new Box();
        box_2.height=20;
        box_2.width=20;
        box_2.material="Дерево";
        box_2.weight=30;
        System.out.println("Высота: " + box_1.height + "; Ширина " + box_1.width + "; Материал " + box_1.material + "; Вес: " + box_1.weight);
        System.out.println("Высота: " + box_2.height + "; Ширина " + box_2.width + "; Материал " + box_2.material + "; Вес: " + box_2.weight);
    }
}
class Box {
    double height;
    double width;
    String material;
    double weight;
}