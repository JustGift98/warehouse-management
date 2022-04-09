package Order;

public class EqupimentOrder implements Order {

    protected int orderNum;
    protected String orderName;
    protected double cost;


    public EqupimentOrder(int num, String name)
    {
        this.orderNum =num;
        this.orderName = name;
    }

    /*
    * SETTERS AND GETTERS
    * */

    public double getCost() {
        return cost;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    @Override
    public void placeNewOrder()
    {


    }//END OF METHOD

    @Override
    public void cancelOrder(String orderNum)
    {

    }//END OF METHOD

    @Override
    public void calculateTotalCost()
    {

    }//END OF METHOD
    @Override
    public void getOrderInvoice(String orderNum)
    {
    }//END OF METHOD


}//END OF CLASS
