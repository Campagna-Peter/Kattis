package lvc.cds;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        int hCut = Integer.parseInt(values[1]);
        int vCut = Integer.parseInt(values[2]);

        int maxH = Math.max(n-hCut,hCut);
        int maxV = Math.max(n-vCut,vCut);
        System.out.println(maxH*maxV*4);
    }
}
