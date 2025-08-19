package com.example.demo.services;
import com.example.demo.controller.Fan.Fan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FanService {
    ArrayList<Fan> fanArrayList = new ArrayList<>();
   // Fan f1 = new Fan();
     int overAllCount = 0;
     int countOfFansOn = 0;
     public FanService(){
         int i = 1;
         while (i <= 180) {
             //Creating the fan
             Fan f = new Fan();
             //Adding the fan to warehouse(Fan arraylist)
             fanArrayList.add(f);
             i++;
         }
     }
    boolean running;


    public void switchOn(int fanNumber){
        Fan f1 = fanArrayList.get(fanNumber);
        if (false == f1.isSwitchedOn()) {
            System.out.println("Starting the fan");
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("Fan is already running");
        }
    }
    public void switchOff(int fanNumber){
        Fan f1 = fanArrayList.get(fanNumber);

        f1.switchOfTheFan();
        System.out.println("Fan is switched OFF");
        overAllCount++;
        countOfFansOn--;
    }
    public void increase(int fanNumber){
        Fan f1 = fanArrayList.get(fanNumber);
        f1.increaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }
    public void decrease(int fanNumber){
        Fan f1 = fanArrayList.get(fanNumber);

        f1.decreaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is: " + f1.getSpeed());
    }
    public void report(){
        System.out.println("No of fans in switched on status : " + countOfFansOn);
        System.out.println("Overall count of buttons tested: " + overAllCount);
    }

}
