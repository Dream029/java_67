package W13;

public  class W13_01_introArray {
    public static void main(String[] args) {
        String[] colors = { "Purple", "Cyan","Blue","Geen","Yellow","Orange","Reb" };
         int [] banks = {20,50,100,500,1000};
         char [] alphabets = { 'A','B','C','D','E'};

         //เเสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The first color is"+ colors[5]);
        System.out.println("The Third alphabet is"+ alphabets[2]);

        System.out.println("Colors in the array are");
        for (int i=6; i> 0; i--) {
            System.out.print(colors[i]+" ");
        }
        System.out.println();
        System.out.println("======================================================");
        for (int i=6; i>= 0; i--) {
            System.out.print(colors[i]+" ");
        }
         System.out.println();
        System.out.println("======================================================");
        System.out.println("Banks in the array are:");
        for (int i=6; i>= 0; i--) {
            System.out.print(colors[i]+" ");

         }
     }
   }
 
