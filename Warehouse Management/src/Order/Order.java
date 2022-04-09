package Order;

public interface Order {

    void placeNewOrder();
    void cancelOrder(String orderNum);
    void calculateTotalCost();
    void getOrderInvoice(String orderNum);


}
