package lvc.cds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public final class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String count = sc.nextLine();
        String line = sc.nextLine();
        String[] values = line.split(" ");

        int total = Integer.parseInt(count);
        ArrayList<Long> arl = new ArrayList<Long>();

        for(int i = 0; i < values.length; i++){
            arl.add(Long.parseLong(values[i]));
        }

        Collections.sort(arl);

        long discount = 0;
        for(int i = total -3; i >= 0; i -= 3){
            discount += arl.get(i);
        }
        System.out.println(discount);
    }
}
