package service;

public class OrderService {

    NoticationService notificationService;

    public OrderService(NoticationService notificationService){
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        System.out.println("Order Placed:)");
        notificationService.sendNotification();
    }
}
