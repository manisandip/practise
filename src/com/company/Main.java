package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaring and initializing 2D array
        //  int arr[][]={{1,2,3,4},{2,4,5,5},{4,4,5,6},{3,4,5,7}};

        String a[][] = {{"Manisha","Sandip","Ridham"}, {"Jyot","Jagu","Aum"},{"kamal","hiren","Sweety"}};
        ;//declaration, instantiation and initialization
//printing array
         for (int i = 0; i < 3; i++){            //length is the property of array
            for (int j = 0; j < 3; j++){
                System.out.print(a[i][j]+ "  |  " + "    ");

    }

        System.out.println();
    }
}}