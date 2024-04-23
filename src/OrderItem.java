public class OrderItem {

    private DrinkItem orderItem;
    private int quantity;
    public OrderItem(DrinkItem orderItem, int quantity) {
        this.orderItem = orderItem;
        this.quantity = quantity;
    }
    public DrinkItem getOrderItem() {
        return orderItem;
    }
    public void setOrderItem(DrinkItem orderItem) {
        this.orderItem = orderItem;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

}
