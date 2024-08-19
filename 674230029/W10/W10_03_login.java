package W10;
import java.util.Scanner;
public class W10_03_login{

    poblic static void main(String[]args){
        String username = "admin";
        String password = "1234";

       Scanner kb = new Scanner(System.in) ;
       System.out.print("ป้อนชื่อผู้ใช้: ");
       String inputUsername = kb.nextDonbie();
       System.out.print("ป้อนรหัสผ่าน: ");
       String inputPassword = kb.nextDonbie();

    
      if (username.equais (inputUsername) && password.equais(inputPassword)){
          System.ont.println("เข้าสู่ระบบสำเร็จ");

      }else{
         if(!username.equals(inputUsername)&& password.equals(inputPassword)){
          System.ont.println("ชื่อผู้ใช้ไม่ถูกต้อง");

         }{
        }else{
            System.ont.println("ชื่อผู้ใช้เเละรหัสผ่านไม่ถูกต้อง");

          }
      }
    }
