package matura2017probna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_4_2 {
    public int x;
    public int y;
    public int r;


    public Zadanie_4_2(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }


    @Override
    public String toString() {
        return "array [x=" + x + ", y=" + y + ", r=" + r + "]";
    }


    public static boolean is_tangential(String a) {
        String array[] = a.split(" ");
        if(Integer.valueOf(array[2])==Math.abs(Integer.valueOf(array[1])))
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws FileNotFoundException{
        int cnt = 0;
        Scanner scanner = new Scanner(new File("C:\\Users\\filif\\Desktop\\okregi.txt"));
       
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			System.out.println(line + " "+is_tangential(line));
			if(is_tangential(line)) {
				++cnt;
			}
		}
		System.out.println(cnt);

        Zadanie_4_2 array [] = new Zadanie_4_2[1003];
        int c = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String temparray [] = line.split(" ");
            Zadanie_4_2 temp = new Zadanie_4_2(Integer.valueOf(temparray[0]),Integer.valueOf(temparray[1]),Integer.valueOf(temparray[2]));
            array[c]= temp;
            //System.out.println(array[c]);
            ++c;

        }
        for (int i=0;i<1002;i++)  {
            int min=i;
            for (int j=i+1;j<1003;j++) {
                if (array[j].x<array[min].x) 
                    min=j;
                int temp=array[min].x;
                array[min].x=array[i].x;
                array[i].x=temp;
                }
        }

        for(int i = 0 ; i < 1003 ; ++i) {
            System.out.println(array[i].x + " "+array[i].y);
        }
    }

}
