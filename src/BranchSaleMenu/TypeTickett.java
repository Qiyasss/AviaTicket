package BranchSaleMenu;

import BranchBuyMenu.DateOfTicket;
import BranchBuyMenu.DirectionOfTicket;
import BranchBuyMenu.PriceOfTicket;

import java.util.Scanner;

public class TypeTickett {
    public static void typeS() {

        System.out.println("1.Gedis (Econom)");
        System.out.println("2.Gedis (Business-Class)");
        System.out.println("3.Gedis - Donus (Econom)");
        System.out.println("4.Gedis - Donus (Business-Class)");

        Scanner scan = new Scanner(System.in);

        System.out.println("Musteriden secmek istediyi biletin novunu sorusun ve xanalari doldurun:");

        int chooseType = scan.nextInt();

        if (chooseType == 1 ) {
            System.out.println("1.Baki-Moskva," + "\n2.Baki-Istanbul," + "\n3.Baki-Tbilisi");
            DirectionOfTicket.direction();
            DateOfTicket.date();
            PriceOfTicket.CalcEcoDepp();

        } else if (chooseType==2) {
            System.out.println("1.Baki-Moskva," + "\n2.Baki-Istanbul," + "\n3.Baki-Tbilisi");
            DirectionOfTicket.direction();
            DateOfTicket.date();
            PriceOfTicket.CalcBussDepp();


        } else if (chooseType ==3 ) {
            System.out.println("1.Baki-Moskva-Baki," + "\n2.Baki-Istanbul-Baki," + "\n3.Baki-Tbilisi-Baki");
            DirectionOfTicket.direction2();
            DateOfTicket.date();
            PriceOfTicket.CalcEcoTurnn();


        }else if ( chooseType==4) {
            System.out.println("1.Baki-Moskva-Baki," + "\n2.Baki-Istanbul-Baki," + "\n3.Baki-Tbilisi-Baki");
            DirectionOfTicket.direction2();
            DateOfTicket.date();
            PriceOfTicket.CalcBussTurnn();


        }  else {
            System.out.println("Reqemi duzgun daxil edin:");
        }


    }

}



