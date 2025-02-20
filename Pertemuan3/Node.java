package Pertemuan3;

/** Kelas Node untuk merepresentasikan elemen dalam linked list */
public class Node {
    private int data;   // Menyimpan nilai data dari node
    private Node next;  // Menyimpan referensi ke node berikutnya

    /** Konstruktor untuk menginisialisasi atribut data */
    public Node(int data) {
        this.data = data;
        this.next = null; // Secara default, next adalah null
    }

    /** Setter untuk data */
    public void setData(int data) {
        this.data = data;
    }
    
    /** Getter untuk data */
    public int getData() {
        return data;
    }

    /** Setter untuk next */
    public void setNext(Node next) {
        this.next = next;
    }
    
    /** Getter untuk next */
    public Node getNext() {
        return next;
    }
}