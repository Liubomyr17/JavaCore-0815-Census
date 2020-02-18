package com.company;

/*
0815 Census

Create a dictionary (Map <String, String>), enter ten entries in it according to the principle "Last Name" - "First Name".
Check how many people have the same name or last name.

Requirements:
1. The program should not display text on the screen.
2. The program should not read values ​​from the keyboard.
3. The Solution class should contain only four methods.
4. String, String consisting of 10 entries on the principle of "Last name" - "First name".
5. The getCountTheSameFirstName () method should return the number of people who have the same name.
6. The getCountTheSameLastName () method should return the number of people who have the same last name.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashMap<String,String> createMap(){

        HashMap<String,String> map=new HashMap<>();

        for(int i=0;i++<10;map.put("lastname"+i,"name"+i));

        for(HashMap.Entry<String,String> pair:map.entrySet())
            System.out.println(pair.getKey()+" - "+pair.getValue());
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String,String> map,String name){
        int count=0;
        for(String s:map.values())if(s.equals(name))count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String,String> map,String lastName){
        int count=0;
        for(String s:map.keySet())if(s.equals(lastName))count++;
        return count;
    }

    public static void main(String[] args) {

    }
}





