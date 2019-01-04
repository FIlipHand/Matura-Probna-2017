package matura2017probna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie_4_1 {
	public static boolean is_in_first(String a){
		String array[] = a.split(" ");
		if(Double.valueOf(array[0])>=0 && Double.valueOf(array[1])>=0)
			return true;
		else
			return false;
	}
	public static boolean is_in_second(String a){
		String array[] = a.split(" ");
		if(Double.valueOf(array[0])<=0 && Double.valueOf(array[1])>=0)
			return true;
		else
			return false;
	}
	public static boolean is_in_third(String a){
		String array[] = a.split(" ");
		if(Double.valueOf(array[0])<=0 && Double.valueOf(array[1])<=0)
			return true;
		else
			return false;
	}
	public static boolean is_in_fourth(String a){
		String array[] = a.split(" ");
		if(Double.valueOf(array[0])>=0 && Double.valueOf(array[1])<=0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		int array[] = {0,0,0,0};
		Scanner scanner = new Scanner(new File("C:\\Users\\filif\\Desktop\\punkty.txt"));
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			if(is_in_first(line)) {
				array[0]++;
			}else if(is_in_second(line)) {
				array[1]++;
			}else if(is_in_third(line)) {
				array[2]++;
			}else if(is_in_fourth(line)) {
				array[3]++;
			}
			
		}
		for(int i = 0 ; i < array.length ; ++i) {
			System.out.print(array[i]+ " ");
		}
		scanner.close();
	}

}
