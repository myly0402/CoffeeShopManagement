import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        CoffeeShop coffeeShop = new CoffeeShop();
        DrinkItem drinkItem1 = new DrinkItem("Black coffee", 20000);
        DrinkItem drinkItem2 = new DrinkItem("Milk cofee", 25000);
        DrinkItem drinkItem3 = new DrinkItem("Cold brew coffee", 30000);
        DrinkItem drinkItem4 = new DrinkItem("Americano", 35000);
        DrinkItem drinkItem5 = new DrinkItem("Capuchino coffee", 35000);
        DrinkItem drinkItem6 = new DrinkItem("Express coffee", 20000);
        coffeeShop.addMenu(drinkItem1);
        coffeeShop.addMenu(drinkItem2);
        coffeeShop.addMenu(drinkItem3);
        coffeeShop.addMenu(drinkItem4);
        coffeeShop.addMenu(drinkItem5);
        coffeeShop.addMenu(drinkItem6);

        boolean continueShift = true;
        Scanner scanner = new Scanner(System.in);

        do {

            Customer customer = new Customer();
            coffeeShop.showMenu();
            System.out.println("Vui lòng chọn món");
            coffeeShop.order(customer);
            coffeeShop.checkout(customer);

            System.out.print("Bạn muốn tiếp tục phiên làm việc ngày? (y/n): ");
            String result = scanner.nextLine();

            if (result.equals("n")) {
                continueShift = false;
                System.out.println(" Tổng doanh thu ca làm việc này: " + coffeeShop.getRevenue());

            }

        } while (continueShift);
        
    }

    /*
     * 1 quán cafe có các món (tên, giá)
     * Khách vào quán và make order.
     * 
     * Viết chương trình cho phép khách order, thanh toán, hiển thị doanh thu
     * 
     * 
     */

}
