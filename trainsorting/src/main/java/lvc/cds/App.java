package lvc.cds;

import java.util.Scanner;

public class App {
    
    public static void longestInc(int a[], int l[], int n) {

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                if (a[i] < a[j]){
                    l[i] = Math.max(l[j] + 1, l[i]);
                }
            }
        }
    }

    public static void longestDec(int a[], int d[], int n) {

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]){
                    d[i] = Math.max(d[j] + 1, d[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int l[] = new int[n];
        int d[] = new int[n];


        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            l[i] = 1;
            d[i] = 1;
        }

        longestInc(a, l, n);
        longestDec(a, d, n);
        
        int max = 0;
        for(int i = 0; i < n; i++){
            int temp = l[i] + d[i] -1;
            if(max < temp){
                max = temp;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
