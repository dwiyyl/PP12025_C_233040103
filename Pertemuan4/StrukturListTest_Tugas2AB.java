package Pertemuan4;

public class StrukturListTest_Tugas2AB {
    public static void main(String[] args) {

        StrukturListDouble list1 = new StrukturListDouble();
        // Tes pertama: 2.1 3.4 4.5
        list1.addTail(2.1);
        list1.addTail(3.4);
        list1.addTail(4.5);
        System.out.print("Output a: ");
        list1.displayElement(); // Output: 2.1 3.4 4.5        
        
        StrukturListDouble list2 = new StrukturListDouble();
        // Tes kedua: 3.4 2.1 1.1 4.5 5.5
        list2.addTail(3.4);
        list2.addTail(2.1);
        list2.addMid(1.1, 2);  // Menyisipkan 1.1 pada posisi ke-2
        list2.addTail(4.5);
        list2.addTail(5.5);
        System.out.print("Output b: ");
        list2.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}
