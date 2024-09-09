package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ให้นับจำนวนเลขคู่เลขคี่ใน Array ด้านล่าง
        int [] numbers = { 2,4,6,8,9,7,23,20,55,10,30,40,34,31,34,25,};

        int countOdd = 0;
        int countEven = 0;


        for (int i= 0; i< numbers.length;  i++ ){
            System.out.println(numbers[i]+" ");
        if (numbers [i]%2 == 0) {
            countEven++;
        }else{
             countOdd++;

          }

      }
            System.out.println(numbers[i]+" ");
            System.out.println("\n Amount of all Number :" + numbers.length);
            System.out.println("\nAmount of Odd Number:" + countOdd );
            System.out.println("\nAmount of Even Number:" + countEven );
    }
}
