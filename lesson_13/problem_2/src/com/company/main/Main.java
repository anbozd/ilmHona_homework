package com.company.main;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Subscriber[] subscribers =new Subscriber[4];


        subscribers[0] = new Subscriber("Anboz","Davlatkadamov","Davlatkadam","Khorog",50,1);
        subscribers[1]=new Subscriber("Hamdam","Davlatmamadov","Davlatkadam","Rushon",1050,2);
        subscribers[2]=new Subscriber("Afson","Ramazonova","Karamkhudo","Rushon",900,3);
        subscribers[3]=new Subscriber("Mustaqim","Davlatmamadov","Davlatkadam","Dushanbe",2233,4);

        for(int i=0; i<subscribers.length;i++){
            if(subscribers[i].getLocalTime()>Subscriber.assignedTo){
                System.out.println("Id: "+ subscribers[i].getId() + " Last Name: " + subscribers[i].getLastName() + " Name: "+subscribers[i].getName() + " sirName: " + subscribers[i].getSirName() +
                     " Addres: " +subscribers[i].getAddRes()+   " Local Time: " + subscribers[i].getLocalTime());
            }
        }
    }
}
