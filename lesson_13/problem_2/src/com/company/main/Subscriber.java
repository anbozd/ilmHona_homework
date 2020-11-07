package com.company.main;

public class Subscriber {
    public static int assignedTo=1000;
    private int id;
    private String lastName;
    private String name;
    private String sirName;
    private String addRes;
    private int localTime;

    public Subscriber(String name, String lastName, String sirName, String addRes, int localTime, int id){
        this.name=name;
        this.lastName=lastName;
        this.sirName=sirName;
        this.addRes=addRes;
        this.localTime=localTime;
        this.id=id;
    }

    //Getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSirName(){
        return this.sirName;
    }
    public String getAddRes(){
        return this.addRes;
    }
    public int getLocalTime(){
        return this.localTime;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setSirName(String sirName){
        this.sirName=sirName;
    }
    public void setAddRes(String addRes){
        this.addRes=addRes;
    }
    public void setLocalTime(int localTime){
        this.localTime=localTime;
    }
    public void setId(int id){
        this.id=id;
    }




}
