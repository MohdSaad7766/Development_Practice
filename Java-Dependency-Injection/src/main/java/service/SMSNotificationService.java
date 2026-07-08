package service;

public class SMSNotificationService implements NoticationService{
    @Override
    public void sendNotification(){
        System.out.println("SMS Notification Sent");
    }
}
