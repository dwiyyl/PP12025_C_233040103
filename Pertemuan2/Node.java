package Pertemuan2;

public class Node {
	private int Nilai;
	private Node next;
	
	// inisialisasi Node
	public Node(int nilai) {
		this.Nilai = nilai;
	}

    // Setter untuk Nilai
    public void setNilai(int nilai) {
        this.Nilai = nilai;
    }

    // Getter untuk Nilai
    public int getNilai() {
        return Nilai;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}