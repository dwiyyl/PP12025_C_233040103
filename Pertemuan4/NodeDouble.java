package Pertemuan4;

/** Kelas Node untuk merepresentasikan elemen dalam linked list */
public class NodeDouble {
    private double data;   // Menyimpan nilai data dari node
    private NodeDouble next;  // Menyimpan referensi ke node berikutnya

    /** Konstruktor untuk menginisialisasi atribut data */
    public NodeDouble(double data) {
        this.data = data;
        this.next = null; // Secara default, next adalah null
    }

    /** Setter untuk data */
    public void setData(double data) {
        this.data = data;
    }
    
    /** Getter untuk data */
    public double getData() {
        return data;
    }

    /** Setter untuk next */
    public void setNext(NodeDouble next) {
        this.next = next;
    }
    
    /** Getter untuk next */
    public NodeDouble getNext() {
        return next;
    }
}