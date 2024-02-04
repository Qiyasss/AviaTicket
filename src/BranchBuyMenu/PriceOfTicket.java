package BranchBuyMenu;

import java.util.Scanner;

public class PriceOfTicket {

    static int[] distance = {2200, 1700, 450};

    static int i;

    public static void CalcEcoDepp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almaq istediyiniz biletin sayini secin");
        int chooseQ = scan.nextInt();
        int calcEcoDep = (int) (distance[i] * 0.2);
        int firstcash = calcEcoDep * chooseQ;
        System.out.println("Biletin qiymeti:" + firstcash + " AZN");
        TemplatePrice.template();
        int cash = scan.nextInt();
        if (cash == firstcash) {
            System.out.println("Odenisiniz ugurla heyata kecdi");
            TemplatePrice.ticket();
        } else if (cash != firstcash) {
            System.out.println("Meblegi duzgun daxil edin");
        }
        System.exit(0);
    }

    public static void CalcBussDepp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almaq istediyiniz biletin sayini secin");
        int chooseQ = scan.nextInt();
        int calcBussDep = (int) ((distance[i] * 0.2) + 100);
        int secondcash = calcBussDep * chooseQ;
        System.out.println("Biletin qiymeti:" + secondcash + " AZN");
        TemplatePrice.template();
        int cash = scan.nextInt();
        if (cash == secondcash) {
            System.out.println("Odenisiniz ugurla heyata kecdi");
            TemplatePrice.ticket();
        }else if (cash != secondcash) {
            System.out.println("Meblegi duzgun daxil edin");
        }System.exit(0);
    }

    public static void CalcEcoTurnn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almaq istediyiniz biletin sayini secin");
        int chooseQ = scan.nextInt();
        int calcEcoTurn = (int) (((distance[i] * 0.2) * 2) - 50);
        int thirdcash = calcEcoTurn* chooseQ;
        System.out.println("Biletin qiymeti:" + thirdcash + " AZN");
        TemplatePrice.template();
        int cash = scan.nextInt();
        if (cash == thirdcash) {
            System.out.println("Odenisiniz ugurla heyata kecdi");
            TemplatePrice.ticket();
        }else if (cash != thirdcash) {
            System.out.println("Meblegi duzgun daxil edin");
        }System.exit(0);
    }

    public static void CalcBussTurnn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Almaq istediyiniz biletin sayini secin");
        int chooseQ = scan.nextInt();
        int calcBussTurn = (int) ((((distance[i] * 0.2) * 2) - 50) + 100);
        int fourthcash = calcBussTurn * chooseQ;
        System.out.println("Biletin qiymeti:" + fourthcash + " AZN");
        TemplatePrice.template();
        int cash = scan.nextInt();
        if (cash == fourthcash) {
            System.out.println("Odenisiniz ugurla heyata kecdi");
            TemplatePrice.ticket();
        }else if (cash != fourthcash) {
            System.out.println("Meblegi duzgun daxil edin");
        }System.exit(0);
    }

    }



