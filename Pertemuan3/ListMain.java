package Pertemuan3;

public class ListMain {
    public static void main(String[] args) {
    	
    StrukturList list = new StrukturList(); // Buat list baru
    	        
    	//latihan 5
    	list.addHead(3); // Tambah elemen 3 di awal
    	list.addHead(4); // Tambah elemen 4 di awal
    	list.addHead(5); // Tambah elemen 5 di awal
    	        
    	 //latihan 5a
        list.addHead(3); // Tambah elemen 3 di awal
        list.addHead(2); // Tambah elemen 2 di awal
        list.addHead(1); // Tambah elemen 1 di awal
        
        //latihan 5b
        list.addHead(1); // Tambah elemen 1 di awal
        list.addHead(4); // Tambah elemen 4 di awal
        list.addHead(5); // Tambah elemen 5 di awal
        list.addHead(7); // Tambah elemen 7 di awal
        
        //latihan 4
        list.addTail(3); // Tambahkan elemen 3 di akhir list
        list.addTail(4); // Tambahkan elemen 4 di akhir list
        list.addTail(5); // Tambahkan elemen 5 di akhir list
        
        //test 4a
        list.addTail(3); // Tambahkan elemen 3 di akhir list
        list.addTail(2); // Tambahkan elemen 2 di akhir list
        list.addTail(1); // Tambahkan elemen 1 di akhir list
        
        //test 4b
        list.addTail(1); // Tambahkan elemen 1 di akhir list
        list.addTail(4); // Tambahkan elemen 4 di akhir list
        list.addTail(5); // Tambahkan elemen 5 di akhir list
        list.addTail(7); // Tambahkan elemen 7 di akhir list

        System.out.println("Elemen: ");
        list.displayList(); // Tampilkan elemen list
    	}
}