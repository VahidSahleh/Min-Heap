import java.util.ArrayList;

import java.util.*;
import java.util.Arrays;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Object;

public class Project3 {
	static ArrayList<String> A = new ArrayList<String>();
	static ArrayList<Integer> B = new ArrayList<Integer>();
	static ArrayList<Heap> D = new ArrayList<Heap>();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String st;
		//read lines of txt file and put it in st
		File file = new File("E:\\Eclipse\\Project3\\main.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		st = br.readLine();
		 System.out.println("input: "+ st);
			count(st);
		

		ArrayList<Heap> C = new ArrayList<Heap>();
		
		// it will take the Repetition and chars from A and B and make new Heaps object with them and add it to C arrayList
		for (int i = 0; i < A.size(); i++) {
			Heap h = new Heap();
			h.Heap(null, null, B.get(i), A.get(i));
			C.add(h);
		}
		
		while (C.size() > 1) {
			{
				//it will sort the arrayLisy bye using the Repetition of heap objects in C arrayList
				for (int i = 0; i < C.size(); i++) {
					int min = C.get(i).tekrar;
			        int minId = i;
					for (int j = i + 1; j < C.size(); j++) {
						Heap tmp = null;
						if (C.get(j).tekrar< min) {
							C.get(j).setTekrar(min);
							minId = j;

						}
					}
					

				}
				//Implementation of huffman tree
				Heap left = C.get(0);
				Heap right = C.get(1);
				left.huff = "0";
				right.huff = "1";
				int tekrar = left.tekrar + right.tekrar;
				String ch = left.ch + right.ch;
				Heap h1 = new Heap();
				h1.Heap(right, left, tekrar, ch);
				C.remove(right);
				C.remove(left);
				C.add(h1);

			}

		}
		String s = "";
		print(C.get(0), s);
		String v = "";
		//make D arrayList sorted 
	 for(int k1 =0; k1<st.length(); k1++) {
		 for(int k2 =0; k2<D.size(); k2++) {
			 if(D.get(k2).ch.charAt(0)==st.charAt(k1)) {
				 System.out.print(" "+D.get(k2).ch+" : "+ D.get(k2).S);
				v=v+D.get(k2).S;
				 D.remove(k2);
				 break;

				  
				 
			 }
		 }
	 }
	 
	 System.out.println();
	 System.out.print("out put: "+ v);
	
		
	 FileWriter myWriter = new FileWriter("encode.txt");
     myWriter.write(v);
     myWriter.close();

		 
	}
//for showing string in  form of huffman
	public static void print(Heap h, String s) {
		
		String S = s + h.huff;
		
		
		if (h.left != null) {
			
			print(h.left, S);
			
		}
		if (h.right != null) {
			print(h.right, S);
		}

		if (h.left == null && h.right == null) {
			
			//System.out.print(D.get(0));
			//System.out.print(h.ch+" :"+S);
			
			      try {
					Heap h3 = new Heap();
					  h3.Heap(null, null, 0, h.ch);
					  h3.S = S;
					  D.add(h3);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    
			    
		}

	}
//method for counting the chars and separate chars and put it into arrayList A(for chars) and B(number of Repetition)
	public static void count(String aa) {
		for (int i = 0; i < aa.length(); i++) {
			char c = aa.charAt(i);
			if (!A.contains(" " + c)) {
				A.add("" + aa.charAt(i));
				
			}

		}
		for (int i = 0; i < A.size(); i++) {
			int count = 0;
			for (int j = 0; j < aa.length(); j++) {

				if (A.get(i).equals(aa.charAt(j) + "")) {

					count++;
				}
			}
			B.add(count);
			
		}
	}
}
