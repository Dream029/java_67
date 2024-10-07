package W14;
public class W14_02_Array_Gender {
    public static void main(String[] args) {
        
    
        // สร้าง Array ชื่อ name เพื่อเก็บชื่อนักเรียน จำนวน 5 คน
        String [] name = {"นายสมชาย","นางสมใจ","นางสาวสมนึก","นายสมดี","นางสาวสมฤทัย"};
        String [] codes = {"123TH","124EN","125EN","126TH","127EN"};

        // 1) แสดงจำนวนนักเรียนทั้งหมด
         System.out.println("จำนอนนักเรียนทั้งหมด = " + name.length +"คน") ;
        System.out.println("====================================");
        



        // 2) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [startsWith()] และมีจำนวนนักเรียนเท่ากับกี่คน

        // แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย"
        System.out.println("ชื่อนักเรียนขึ้นต้นด้วยคำว่า 'นาย'");
        //System.out.println(name[0]);
        //System.out.println(name[3]);
        int count = 0;
        for(int i=0; i< name.length; i++){
            if(name[i].startsWith("นาย")){
                System.out.println(name[i]);
                count++;
            }
        }
        System.out.println("จำนวนนักเรียนที่ขึ้นต้นด้วยคำว่า นาย = " +count + "คน");

        System.out.println("=========================================");


        // และมีจำนวนนักเรียนเท่ากับกี่คน
       
  
        //  3) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" 
        System.out.println("ชื่อนักเรียนขึ้นต้นด้วยคำว่า 'นางสาว'");
         count = 0;
        for(int i=0; i< name.length; i++){
            if(name[i].startsWith("นางสาว")){
                System.out.println(name[i]);
                count++;
 }
}       System.out.println("จำนวนนักเรียนที่ขึ้นต้นด้วยคำว่า นางสาว = " +count + "คน");
    
        System.out.println("====================================");
        
       
            
            

        // 4) แสดงชื่อนักเรียนทั้งหมด และแสดงเพศของนักเรียนแต่ละคน
                // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" ให้แสดงว่าเป็นเพศชาย
                // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" ให้แสดงว่าเป็นเพศหญิง
        

        // มีจำนวนนักเรียนเท่ากับกี่คน
        count = 0;
        for(int i=0; i< name.length; i++){
            if(name[i].startsWith("นาง")){
                System.out.println(name[i]+"เพศหญิง");
                count++;
            }else{
                System.out.println(name[i]+"เพศหญิง");
 }
} 
      System.out.println("จำนวนนักเรียนทั้งหมด  " +count + "คน");
        System.out.println("====================================");

    

        // 5) แสดงเลขลำดับของนักเรียนแต่ละคน 
                 // มีจำนวนนักเรียนเท่ากับกี่คน
                 // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
                 // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
                 // มีจำนวนนักเรียนเท่ากับกี่คน
                  // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
                   count = 0;
                   int countAll =0;
                   int countMale =0;
        for(int i=0; i< name.length; i++){
            if(name[i].startsWith("นาง")){
                System.out.println(name[i]+"เพศหญิง");
                countAll++;
                countMale++;
            }else{
                System.out.println(name[i]+"เพศชาย");
             countAll++;
             countMale++;
            }
   } 

         // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
      System.out.println("จำนวนนักเรียนเพศชาย  " +countMale + "คน");
         // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
       System.out.println("จำนวนนักเรียนเพศชาย  " +countMale + "คน");
         // มีจำนวนนักเรียนเท่ากับกี่คน
        System.out.println("จำนวนนักเรียนเพศชาย  " +countAll + "คน");


        System.out.println("====================================");



        //  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
// มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
// มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
// มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่

public class W14_hw_Array02 {

    public static void main(String[] args) {

        String[] codes = {"123TH", "124EN", "125EN", "126TH", "127EN"};
        int count = 0;

        // แสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมดคือ = " + codes.length);
        System.out.println("====================================");

        // มีจำนวนพัสที่มาจากไทยเท่าไหร่
        for (String code : codes) {
            if (code.endsWith("TH")) {
                count++;
            }
        }

        //จำนวนพัสดุที่มาจากไทย 
        System.out.println("มีจำนวนพัสดุที่มาจากไทย: " + count);
        System.out.println("====================================");
        // มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        count = 0;
        for (String code : codes) {
            if (code.endsWith("EN")) {
                count++;
            }
        }

        System.out.println("มีจำนวนพัสดุที่มาจากต่างประเทศ: " + count);
        System.out.println("====================================");
        // แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        int countAll = 0;
        int countThai = 0;
        int countEn = 0;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                System.out.println((i + 1) + ". " + codes[i] + "มาจากประเทศไทย");
                countThai++;
            } else {
                System.out.println((i + 1) + ". " + codes[i] + " มาจากต่างประเทศ");
                countEn++;
            }
            countAll++; // นับจำนวนพัสดุทั้งหมด
        }
        System.out.println("====================================");
        // แสดงจำนวนพัสดุทั้งหมด
        System.out.println("จำนวนพัสดุทั้งหมด = " + countAll + " ชิ้น");
        // แสดงจำนวนพัสดุที่มาจากไทย
        System.out.println("จำนวนพัสดุที่มาจากประเทศไทย = " + countThai + " ชิ้น");
        // แสดงจำนวนพัสดุที่มาจากต่างประเทศ
        System.out.println("จำนวนพัสดุที่มาจากต่างประเทศ = " + countEn + " ชิ้น");
        System.out.println("====================================");
        }
      }
    }
  } 