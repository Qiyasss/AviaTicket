package BranchBuyMenu;

import java.util.Scanner;

import static BranchBuyMenu.TypeTicket.type;

public class TemplatePrice extends DirectionOfTicket {

    public static void template()  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bileti alirsiniz?" + "Yes or No?");
        String sec = scan.nextLine();
        if (sec.equalsIgnoreCase("No")) {
            System.out.println("Musterimiz oldugunuz ucun tesekkurler.");
            System.exit(0);
        } else if (sec.equalsIgnoreCase("Yes")) {
            System.out.println("Adinizi daxil edin:");
            name = scan.nextLine();
            System.out.println("Soyadinizi daxil edin:");
            surName = scan.nextLine();
            System.out.println("Odenis ucun meblegi daxil edin:");

            }


        }  public static void ticket () {


        System.out.println("Biletinizi elde etdiniz:");

        String result = direction();

        System.out.println(" -----------------------------------\n" +
                "|"+  name  + " " + surName+                           "|"+ "\n" +
                "|"+                                               "|\n" +
                "|"+    result +                                      "|\n" +
                "|"+                                          "|\n" +
                "|"+                                                  "|\n" +
                "|                                                    |\n" +
                " ---------------------------------------   ");



    } static String name;
    static String surName;
    }







