

package W15;;

public class W15_02_method_calculator {

      // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
       // 1) Method สำหรับบวกเลข
        static int add (int a, int b){
            return  a + b;
        }

    // 2) Method สำหรับลบเลข
          static int Subject (int a, int b){
            return  a - b;
          }  

    // 3) Method สำหรับคูณเลข
           static int multiply (int a, int b){
            return  a * b;
           }

    // 4) Method สำหรับหารเลข
          static int devide (int a, int b){
            return  a / b;
          }


    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.print("ป้อนตัวเลขที่1:"); 
         int a =sc .nextInt();
         System.err.print("ป้อนตัวเลขที่2:");
         int b = sc.nextInt();



        // 1) Method สำหรับบวกเลข
               System.out.println("ผลบวกของตัวเลข เท่ากับ " + add (55,5));

        // 2) Method สำหรับลบเลข
                System.out.println("ผลบวกของตัวเลข เท่ากับ " + Subject (55,5));
        
        // 3) Method สำหรับคูณเลข
                 System.out.println("ผลบวกของตัวเลข เท่ากับ " + multiply (55,5));
        
        // 4) Method สำหรับหารเลข
                 System.out.println("ผลบวกของตัวเลข เท่ากับ " + devide (55,5));
        
    }
}
    

