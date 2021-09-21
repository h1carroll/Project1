package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryItems{
    public static void main(String[] args)throws IOException {
        var fileName = "ItemLlist";
        String all_items = Files.readString(Paths.get(fileName));
        String[] item_list = all_items.split("\n");
        for (String name: item_list){
            System.out.println(name);
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

                }
            }
        }