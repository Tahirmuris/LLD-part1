package designPattern.FacadeDesign;

public class AmazonApp {

    public void purchaseItem(String item, String price, int quantity, String userInfo) {
        updateInvantory();
        updatecart();
        generateInvoices();
        getCustomerDetail();
    }

    public void updateInvantory() {
        //Step1: checkInventory
        //Step2: deductInventory
    }

    public void updatecart() {
        //Step3: add to cart
        //step4: get price Detail with discount
    }

    public void generateInvoices() {


    }

    public void getCustomerDetail() {
        //step7: get ItemStatus
        //step8: send detail to the customer
        //step9: send delivery report
    }
}
