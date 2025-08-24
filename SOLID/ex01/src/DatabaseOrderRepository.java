public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void saveOrder() {
        System.out.println("Order stored (pretend DB).");
    }
}