package BranchBuyMenu;

import java.util.Scanner;

public class DirectionOfTicket extends PriceOfTicket {


    static String[] departure = {"Baki-Moskva", "Baki-Istanbul", "Baki-Tbilisi",};

    static String[] departureTurn = {"Baki-Moskva-Baki", "Baki-Istanbul-Baki", "Baki-Tbilisi-Baki"};


    public static String direction() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucusun istiqametini secin: ");
        int chooseD = scan.nextInt();
        String result = null;
        for (int i = 0; i < departure.length; i++) {
            if (chooseD==i) {
                result = departure[i];
            }

        }
        return result;

    }

            public static String direction2 () {
                Scanner scan = new Scanner(System.in);
                System.out.println("Ucusun istiqametini secin: ");
                String chooseD = String.valueOf(scan.nextInt());
                for (int i = 0; i < departureTurn.length; i++)
                    if (chooseD.equals(departureTurn[i])) {

                    }
                return departureTurn[i];
            }



        }

