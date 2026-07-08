package service;

public class EmailNotificationService implements NoticationService{
    @Override
    public void sendNotification(){
        System.out.println("Email Notification Sent");
    }
}
