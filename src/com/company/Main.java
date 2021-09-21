package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryItems{
    public static void main(String[] args){


        var Items = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while(!userResponse.equals("done")){
            System.out.print("Would you like to continue? Enter item name or enter 'done' to end");
            userResponse = reader.nextLine();
            if (!userResponse.equals("done")){
                Items.add(userResponse);
            }
        }
        System.out.println("The students in your class are: ");
        for (var Name: studentNames){
            System.out.println(Name);
        }
    }
}