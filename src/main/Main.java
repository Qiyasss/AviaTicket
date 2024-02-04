package main;

import bean.BuyTicket;
import bean.SaleTicket;
import util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("~~~Avia-Ticket sirketimize xos gelmisiniz!~~~");
        for (int i=5; i >0; i --) {
            System.out.println("Xahis edirik " + i + " san gozleyin.");
        }
        System.out.println("~~~Menu~~~");
        MenuUtil.showMenu();
        System.out.println("Secmek istediyiniz menu-nu daxil edin:");

        Scanner scan = new Scanner(System.in);
        int chooseMenu = scan.nextInt();

            if (chooseMenu == 1) {
                BuyTicket.entryBuyMenu();

            } else if (chooseMenu == 2) {
                SaleTicket.entrySaleMenu();

        }
    }
}