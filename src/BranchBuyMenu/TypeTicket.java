package BranchBuyMenu;

import java.util.Scanner;

public class TypeTicket extends DirectionOfTicket {

    public static String type() {

        String[] arrD = {"Gedis (Econom)", "Gedis (Business-Class)", "Gedis - Donus (Econom)", "Gedis - Donus (Business-Class)"};
        for (int i = 0; i < arrD.length; i++) {
            System.out.println((i + 1) + "." + arrD[i]);
        }
        Scanner scan = new Scanner(System.in);

        System.out.println("Almaq istediyiniz biletin novunu secin:");

        int chooseType = scan.nextInt();
String resultType = null;
        if (chooseType == i) {
            System.out.println("1.Baki-Moskva," + "\n2.Baki-Istanbul," + "\n3.Baki-Tbilisi");
            DirectionOfTicket.direction();
            DateOfTicket.date();
            PriceOfTicket.CalcEcoDepp();


        } else if (chooseType == i) {
            System.out.println("1.Baki-Moskva," + "\n2.Baki-Istanbul," + "\n3.Baki-Tbilisi");
            DirectionOfTicket.direction();
            DateOfTicket.date();
            PriceOfTicket.CalcBussDepp();

        } else if (chooseType == i) {
            System.out.println("1.Baki-Moskva-Baki," + "\n2.Baki-Istanbul-Baki," + "\n3.Baki-Tbilisi-Baki");
            DirectionOfTicket.direction2();
            DateOfTicket.date();
            PriceOfTicket.CalcEcoTurnn();


        } else if (chooseType == i) {
            System.out.println("1.Baki-Moskva-Baki," + "\n2.Baki-Istanbul-Baki," + "\n3.Baki-Tbilisi-Baki");
            DirectionOfTicket.direction2();
            DateOfTicket.date();
            PriceOfTicket.CalcBussTurnn();


        } else {
            System.out.println("Reqemi duzgun daxil edin:");
        }
return resultType;

    }

    }
