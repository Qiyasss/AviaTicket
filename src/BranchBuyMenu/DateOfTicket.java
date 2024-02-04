package BranchBuyMenu;

import java.util.Scanner;

public class DateOfTicket {

    static int [] date1= {01, 02 , 03, 04, 05};

    public static void date () {

        System.out.println("Sentyabr ayi ucun gedisler: 01, 02 , 03, 04, 05");
        System.out.println("Ucus tarixini secin:");

        Scanner scan = new Scanner(System.in);

        int chooseDate = scan.nextInt();

        for (int i = 0; i < date1.length; i++) {

            if (chooseDate == date1[i]) {
                System.out.println("Secdiyiniz tarix:" + "0"+ date1[i] + ".09.2023");

            }

        }

    }

    }



