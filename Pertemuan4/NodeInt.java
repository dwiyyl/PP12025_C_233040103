package Pertemuan4;

public class NodeInt {
    private int data;   // Menyimpan nilai data dari node
    private NodeInt next;  // Menyimpan referensi ke node berikutnya

    /** Konstruktor untuk menginisialisasi atribut data */
    public NodeInt(int data) {
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
    public void setNext(NodeInt next) {
        this.next = next;
    }
    
    /** Getter untuk next */
    public NodeInt getNext() {
        return next;
    }
}