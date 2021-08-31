import java.util.ArrayList;

public class Huff {

}
/*ArrayList<String> A = new ArrayList<String>(5);
ArrayList<Integer> B  = new ArrayList<Integer>(5);
ArrayList<Heap> C = new ArrayList<Heap>();
A.add("a");
A.add("b");
A.add("c");
A.add("d");
A.add("e");
B.add(5);
B.add(9);
B.add(12);
B.add(13);
B.add(16);
for(int i=0; i<A.size(); i++) {
	Heap h = new Heap();
	h.Heap(null, null, B.get(i), A.get(i));
	C.get(i).equals(h);
}



while(C.size()>1) {
	{  
		for (int i = 0; i < C.size(); i++)   
		{  
		for (int j = i + 1; j < C.size(); j++)   
		{  
		Heap tmp = null;  
		if (C.get(i).tekrar > C.get(j).tekrar)   
		{  
			tmp = C.get(i);  
			C.get(i).equals( C.get(j));  
			C.get(j).equals(tmp);  
		}  
		}  
		//prints the sorted element of the array  
		
		} 
		// Heap left =  C[0];	
		 //Heap right = C[1];	
		 //left.huff ='0';
		 //right.huff = '1';
		int tekrar = C.get(0).tekrar + C.get(1).tekrar;
		String ch =  C.get(0).ch +  C.get(1).ch;
		 Heap h1 = new Heap();
		h1.Heap( C.get(1),  C.get(0), tekrar, ch );
		C.remove(0);
		C.remove(1);
		C.add(h1);
		System.out.println(C.get(0).tekrar);
	}

}*/




/*String A[]=new String[5];
A[0] = "a";
A[1] = "b";
A[2] = "c";
A[3] = "d";
A[4] = "e";
int B[]=new int[5];
B[0] = 9;
B[1] = 5;
B[2] = 12;
B[3] = 13;
B[4] = 16;
Heap[] C=new Heap[5];
for(int i=0; i<A.length; i++) {
	Heap h = new Heap();
	h.Heap(null, null, B[i], A[i]);
	C[i] = h;
}


while(C.length>1) {
	{  
		for (int i = 0; i < C.length; i++)   
		{  
		for (int j = i + 1; j < C.length; j++)   
		{  
		Heap tmp = null;  
		if (C[i].tekrar > C[j].tekrar)   
		{  
		tmp = C[i];  
		C[i] = C[j];  
		C[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		
		} 
		// Heap left =  C[0];	
		 //Heap right = C[1];	
		 //left.huff ='0';
		 //right.huff = '1';
		int tekrar = C[0].tekrar + C[1].tekrar;
		String ch =  C[0].ch + C[1].ch;
		 Heap h1 = new Heap();
		h1.Heap(C[1], C[0], tekrar, ch );
		System.arraycopy(C, 0 + 1, C, 0, C.length - 1 - 0);
		System.arraycopy(C, 1 + 1, C, 1, C.length - 1 - 1);
	
	}

}*/