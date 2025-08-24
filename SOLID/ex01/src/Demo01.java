

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new DefaultTaxCalculator(0.18);
        NotificationService notificationService = new EmailClient();
        OrderRepository orderRepository = new DatabaseOrderRepository();
        OrderService orderService = new OrderService(taxCalculator, notificationService, orderRepository);

        orderService.checkout("a@shop.com", 100.0);
    }
}
