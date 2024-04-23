import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    private List<DrinkItem> menu;
    private List<Customer> customers;
  

    public CoffeeShop() {
        menu = new ArrayList<>();
        customers = new ArrayList<>();
        
    }

    public List<DrinkItem> getMenu() {
        return menu;
    }

    public void setMenu(List<DrinkItem> menu) {
        this.menu = menu;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getRevenue() {
        int revenue = 0;
        for (Customer customer : customers) {
            revenue = revenue + customer.getTotalPrice();
        }
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    

   
  

    public void addMenu(DrinkItem drinkItem) {
        menu.add(drinkItem);

    }

    public void showMenu() {
        int count = 0;
        System.out.println("Danh sach do uong: ");
        for (DrinkItem drinkItem : menu) {
            count++;
            System.out.println("Ten mon: " + count + "  " + drinkItem.getName() + "     Gia: " + drinkItem.getPrice());
        }

    }

    public void order(Customer customer) {

        boolean isContinue = true;
        String isContinueOrder;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Quy khach vui long chon mon theo số: ");
            int index = scanner.nextInt();
            System.out.println("Quy khach vui long chon so luong: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            customer.addOrderItems(new OrderItem(menu.get(index - 1), quantity));

            System.out.println("Ban muon tiep tuc chon mon? (y/n)");
            isContinueOrder = scanner.nextLine();
        
            if (isContinueOrder.equals("n")) {
                isContinue = false;
            }
        } while (isContinue);

        if (customer.getOrderItems().isEmpty() ==  false) {
            customers.add(customer);
        }

        
    }

    public void checkout(Customer customer) {
        System.out.println("Danh sách món đã chọn:");
        for (OrderItem orderItem : customer.getOrderItems()) {
            System.out.println("Tên món: " + orderItem.getOrderItem().getName() + "   Số lượng: "
                    + orderItem.getQuantity() + "  Giá: " + orderItem.getOrderItem().getPrice());

        }
        System.out.println("Tổng đơn hàng" + customer.getTotalPrice());

    }

}
