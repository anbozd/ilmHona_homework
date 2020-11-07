package com.company.main;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer[] customers =new Customer[4];
        customers[0] = new Customer("Anboz","Davlatkadamov","Davlatkadam","Khorog",4522,1);
        customers[1]=new Customer("Hamdam","Davlatmamadov","Davlatkadam","Rushon",4323,2);
        customers[2]=new Customer("Afson","Ramazonova","Karamkhudo","Rushon",5566,3);
        customers[3]=new Customer("Mustaqim","Davlatmamadov","Davlatkadam","Dushanbe",2233,4);

        for(int i=0; i<customers.length;i++){
            if ((customers[i].getId()) % 2 ==0){
                System.out.println("Name: " + customers[i].getName() + " Last Name: " + customers[i].getLastName() + " Father Name: "+customers[i].getFatherName() +
                        " Addres: " + customers[i].getAdress() + " Credit Car: " + customers[i].getCreditCard() + " ID: " + customers[i].getId());
            }
        }



    }

}
