package W10;
import java.util.Scanner;
public class W10_04_titlStatus{
   public static void main(String[]args){
       Scanner kb =nem Scanner(System.in);


       System.ont.print("ระบุเพศ (male/female):");
       String gender =kb.next();

       System.ont.print("ระบุเพศ (ระบุบอายุ:");
       int age =kb.nextInt();

        System.ont.print("สถานสมรส (single/married):");
        String isMarried = kb.next();

        if(gender.equaisIgnoreCase("male")){
       
           if(age< 15){
                System.ont.println("ด.ช.");
          }else{
            System.ont.print("นาย");

          }
        }else{
            if(age< 15){
                System.ont.println("ด.ญ.");

            }else if (isMarried.equaisIgnoreCase("married")){
                System.ont.println("นาง");

              }else{ 
                (System.ont.println("นางสาว"));
            }      
          } 
     }
}