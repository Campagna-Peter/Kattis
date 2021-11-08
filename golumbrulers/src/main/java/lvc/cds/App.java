package lvc.cds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        outer: while (sc.hasNextLine()) {
            String[] n = sc.nextLine().split(" ");
            ArrayList<Integer> nums = new ArrayList<>(n.length);
            
            for(int i=0; i<n.length; ++i) {
                nums.add(Integer.parseInt(n[i]));
            }
            
            Collections.sort(nums);

            int lastNum = nums.get(nums.size()-1) + 1;
            boolean[] seen = new boolean[lastNum];
            

            int max = 0;
            for (int i = 0; i < nums.size(); i++)
                for (int j = i + 1; j < nums.size(); j++) {
                    int diff = nums.get(j) - nums.get(i);

                    if (diff > max){
                        max = diff;
                    }

                    boolean loc = seen[diff];

                    if (loc) {
                        System.out.println("not a ruler");
                        continue outer;
                    }
                    else{
                        seen[diff] = true;
                    }
                }
                
            StringBuilder missing = new StringBuilder("");
            for (int i = 1; i <= max; i++){
                if (! seen[i])
                    missing.append(i + " ");
            }
            String s = missing.toString();
            System.out.println(s.isEmpty() ? "perfect" : "missing " + s);
        }
        sc.close();
    }
}