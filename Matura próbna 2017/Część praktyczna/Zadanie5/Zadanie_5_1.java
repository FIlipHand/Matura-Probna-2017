package matura2017probna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie_5_1 {
	public static boolean isPalindrome(String a) {
		return a.equals(new StringBuilder(a).reverse().toString());
	}
	
	public static void main(String [] args) throws FileNotFoundException{
		ArrayList <String> arraylist = new ArrayList();
		Scanner scanner = new Scanner(new File("C:\\Users\\filif\\Desktop\\rejestrator.txt"));
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			arraylist.add(Integer.parseInt(line.substring(0, 4),2)+""+Integer.parseInt(line.substring(4, 8),2)+""+Integer.parseInt(line.substring(8, 12),2)+""+Integer.parseInt(line.substring(12, 16),2)+""+Integer.parseInt(line.substring(16, 20),2)+""+Integer.parseInt(line.substring(20, 24),2));
			
		}
//		Zadanie 5.1
		System.out.println(arraylist.get(1110)+" "+arraylist.get(2221)+" "+arraylist.get(3332)+" "+arraylist.get(4443));
//		Zadanie 5.2
		int cnt = 0;
		for(int i = 0 ; i < arraylist.size() ; ++i) {
			if(isPalindrome(arraylist.get(i))){
				++cnt;
				System.out.println(arraylist.get(i));
				
			}
			
		}
		System.out.println(cnt);
//		Zadanie 5.3		
		ArrayList <Integer> intarraylist = new ArrayList();
		for(int i = 0 ; i < arraylist.size() ; ++i) {
			intarraylist.add(Integer.valueOf(arraylist.get(i)));
		}
		Collections.sort(intarraylist);
		for(int i = 0 ; i < intarraylist.size() ; ++i) {
			System.out.println(intarraylist.get(i));
		}
		System.out.println(arraylist);
		}
		
	
	

}
