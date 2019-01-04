package matura2017probna;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_4_3 {
    public double x;
    public double y;

    public Zadanie_4_3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Zadanie_4_3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static double pole_trojkata(Zadanie_4_3 first , Zadanie_4_3 second) {
    	return 0.5*(Math.abs((second.x-first.x)*(0-first.y)-(second.y-first.y)*(0-first.x)));
    }

    public static void main(String[] args) throws FileNotFoundException {
    	double pole = 0;
        Scanner scanner = new Scanner(new File("C:\\Users\\filif\\Desktop\\punkty.txt"));
        ArrayList<Zadanie_4_3> arrayList = new ArrayList<>();
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String arraytemp [] = line.split(" ");
            Zadanie_4_3 a = new Zadanie_4_3(Double.valueOf(arraytemp[0]),Double.valueOf(arraytemp[1]));
                arrayList.add(a);
        }
        for(int i = 0 ; i < arrayList.size()-1 ; ++i) {
        	pole+=pole_trojkata(arrayList.get(i),arrayList.get(i+1));
        }
        pole+=pole_trojkata(arrayList.get(0),arrayList.get(arrayList.size()-1));
        System.out.println((int)pole);

    }



}
