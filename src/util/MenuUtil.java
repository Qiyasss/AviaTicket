package util;

public class MenuUtil {

    public static int [] arrNumber = {1,2};
    public static String [] arrMenu = {"Buy Ticket", "Sale Ticket"};

    public  static void showMenu () {

        for (int i = 0; i<arrMenu.length; i ++) {
            System.out.println(arrNumber[i]+ "." +arrMenu[i]);

        }
    }


}
