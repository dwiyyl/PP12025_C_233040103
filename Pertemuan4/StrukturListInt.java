package Pertemuan4;

public class StrukturListInt {
	private NodeInt HEAD; // Head dari linked list

	    public StrukturListInt() {
	        this.HEAD = null; // Inisialisasi linked list kosong
	    }

	    /** Fungsi untuk mengecek apakah list kosong */
	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	    /** Fungsi untuk menambahkan elemen di akhir list */
	    public void addTail(int data) {
	        NodeInt posNode = null, curNode = null; // Pointer sementara
	        NodeInt newNode = new NodeInt(data); // Buat node baru

	        if (isEmpty()) {
	            HEAD = newNode; // Jika kosong, HEAD langsung diisi newNode
	        } else {
	            curNode = HEAD; // Mulai dari HEAD
	            while (curNode != null) { // Iterasi sampai node terakhir
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newNode); // Set node terakhir menunjuk ke newNode
	        }
	    }

    
	    /** addMid */
	    public void addMid(int data, int position) {
	        NodeInt newNode = new NodeInt(data); // Buat node baru dengan data

	        if (isEmpty() || position <= 1) { 
	            // Jika list kosong atau posisi = 1, tambahkan di awal
	            newNode.setNext(HEAD);
	            HEAD = newNode;
	        } else {
	            NodeInt curNode = HEAD;
	            NodeInt posNode = null;
	            int i = 1;

	            // Iterasi sampai posisi sebelum yang diinginkan
	            while (curNode != null && i < position) {
	                posNode = curNode;
	                curNode = curNode.getNext();
	                i++;
	            }

	            // Menyisipkan newNode di antara posNode dan curNode
	            if (posNode != null) {
	                posNode.setNext(newNode);
	                newNode.setNext(curNode);
	            }
	        }
	    }

	 
	    /** Fungsi untuk menampilkan list */
	    public void displayList() {
	        NodeInt temp = HEAD;
	        while (temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println(" ");
	    }
	    
	    /* Fungsi untuk menampilkan addHead*/
	
	    public void addHead(int data) {
	        NodeInt newNode = new NodeInt(data); // Buat node baru dengan data

	        if (isEmpty()) { // Jika list kosong
	            HEAD = newNode; // Jadikan newNode sebagai HEAD
	        } else {
	            newNode.setNext (HEAD); // Hubungkan newNode ke HEAD lama
	            HEAD = newNode; // Perbarui HEAD ke newNode
	        }
	    }
	    
	    public void displayElement() {
	        NodeInt curNode = HEAD; // Mulai dari HEAD
	        while (curNode != null) { // Iterasi selama node tidak null
	            System.out.print(curNode.getData() + " ");
	            curNode = curNode.getNext(); // Pindah ke node berikutnya
	        }
	        System.out.println(" "); // Akhiran tampilan	        
	    }
	 }