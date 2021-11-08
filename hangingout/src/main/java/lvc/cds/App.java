package lvc.cds;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fireSafety = sc.nextInt();
        int events = sc.nextInt();
        int peopleOnTerrace = 0;
        int turnedAway = 0;

        while (events-- > 0) {
            String status = sc.next().toLowerCase();
            int peopleAtDoor = sc.nextInt();
            if (status.equals("enter") && peopleOnTerrace + peopleAtDoor <= fireSafety)
                peopleOnTerrace += peopleAtDoor;
            else if (status.equals("leave"))
                peopleOnTerrace -= peopleAtDoor;
            else
                turnedAway++;
        }
        System.out.println(turnedAway);
    }
}
