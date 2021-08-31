
public class Heap {
	
	Heap right;
	Heap left;
	String ch;
	String S;
	int tekrar;
	public int getTekrar() {
		return tekrar;
	}
	public void setTekrar(int tekrar) {
		this.tekrar = tekrar;
	}
	String huff;
	public void Heap(Heap right , Heap left ,int tekrar , String ch2 ) {
		this.right = right;
		this.left = left;
		this.tekrar = tekrar;
		this.ch = ch2;
		this.huff ="";
		this.S = "";
	}
	

	
}
