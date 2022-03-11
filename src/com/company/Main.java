package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car,Data> hashMap = new HashMap<>();
        hashMap.put(new Car(1,"02KG 012PT"),new Data(2016,"Lexus",50000,"Black"));
        hashMap.put(new Car(2,"01KG 613BS"),new Data(2016,"Lexus",50000,"Black"));
        hashMap.put(new Car(3,"02KG 6486BA"),new Data(2016,"Lexus",50000,"Black"));
        hashMap.put(new Car(4,"04KG 881 WIN"),new Data(2016,"Lexus",50000,"Black"));
        hashMap.put(new Car(5,"03KG 5678 JD"),new Data(2016,"Lexus",50000,"Black"));

        for(HashMap.Entry elements : hashMap.entrySet()){
            System.out.println(elements.getKey() + " " + elements.getValue());
        }

    }
}
