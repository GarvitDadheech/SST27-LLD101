public class OrderService {
    private final TaxCalculator taxCalculator;
    private final NotificationService notificationService;
    private final OrderRepository orderRepository;

    public OrderService(
            TaxCalculator taxCalculator,
            NotificationService notificationService,
            OrderRepository orderRepository
    ) {
        this.taxCalculator = taxCalculator;
        this.notificationService = notificationService;
        this.orderRepository = orderRepository;
    }

    void checkout(String customerEmail, double subtotal) {
        double tax = taxCalculator.calculateTax(subtotal);
        double total = subtotal + tax;
        notificationService.sendNotification(customerEmail, "Thanks! Your total is " + total);
        orderRepository.saveOrder();
    }
}