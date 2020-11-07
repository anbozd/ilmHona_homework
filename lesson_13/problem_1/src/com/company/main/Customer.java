package com.company.main;

public class Customer {
    private String name;
    private String lastName;
    private String fatherName;
    private String adress;
    private int creditCard;
    private int id;

    public Customer(String name, String lastName, String fatherName, String adress, int creditCard, int id){
        this.name=name;
        this.lastName=lastName;
        this.fatherName=fatherName;
        this.adress=adress;
        this.creditCard=creditCard;
        this.id=id;
    }
    //Getters
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFatherName(){
        return this.fatherName;
    }
    public String getAdress(){
        return this.adress;
    }
    public int getCreditCard(){
        return this.creditCard;
    }
    public int getId(){
        return this.id;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setFatherName(String fatherName){
        this.fatherName=fatherName;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public void setCreditCard(int creditCard){
        this.creditCard=creditCard;
    }
   public void setId(int id){
        this.id=id;
    }


}
