import service.EmailNotificationService;
import service.NoticationService;
import service.OrderService;
import service.SMSNotificationService;

public class Main {
    public static void main(String[] args) {
        NoticationService noticationService = new SMSNotificationService();
        OrderService orderService = new OrderService(noticationService);
        orderService.placeOrder();
    }
}

// Dependency Injection means providing all required dependencies by a class instead of creating them by the
// class itself, promoting loose coupling