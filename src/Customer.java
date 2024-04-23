import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    private String iD;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Customer() {
        this.iD = UUID.randomUUID().toString();

    }

    

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addOrderItems(OrderItem orderItem) {
        this.orderItems.add(orderItem);
    }

    public int getTotalPrice() {

        int totalPrice = 0;
        for (OrderItem orderItem : orderItems) {
            totalPrice = totalPrice + orderItem.getQuantity() * orderItem.getOrderItem().getPrice();
        }
        return totalPrice;
    }

    

}
