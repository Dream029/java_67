package W13;

import java.util.Scanner;

public  class W13_02_introArray {

    public static void main (String[]args){
        String [] brandCars = new String[10];

        Scanner kb = new  Scanner(System.in);
       
        brandCars[0] = "Toyota";
        brandCars[3] = "Honda";
        brandCars[9] = "Nissan"; 
        
        
        System.out.println("Old Brand of cars in the array are:");
        for (int i=0; i< brandCars.length ; i++){
            System.out.println(brandCars[i]+" / ");
        }
        
                System.out.println("\n\nPease enter the brand of the 3rd car:");
        for (int i=0; i< brandCars.length ; i++){
            System.out.println("Enter brand" + (i+1) +" : ");
            brandCars[1] =kb.next();
        }
              
                System.out.println("\nNew Brand of cars in the array are:");
        for (String car : brandCars){
            System.out.println(car+" / ");
        }
    }
}