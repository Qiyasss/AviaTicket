package bean;

import BranchBuyMenu.TemplatePrice;
import BranchSaleMenu.TypeTickett;

public class SaleTicket {

    public static void entrySaleMenu() {

        System.out.println("Bilet Satisi ucun gosterilen emeliyyatlari icra edin. ");

        TypeTickett.typeS();
        TemplatePrice.template();
    }
}
