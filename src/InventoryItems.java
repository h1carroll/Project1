package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class InventoryItems {
    public static void main(String[] args) throws IOException{
        var fileName = "itemList";
        var allLines = Files.readAllLines(filePath);
        var filePath  = Paths.get(fileName);
        var Product = new ArrayList<String>();
        var Price = new ArrayList<Float>();
        var Inventory = new ArrayList<Integer>();
        for (var line: allLines){
            var splitLine = line.split(",");
            Product.add(splitLine[0]);
            Inventory.add(Integer.parseInt(splitLine[1]));
            Price.add(Float.parseFloat(splitLine[2]));



        }