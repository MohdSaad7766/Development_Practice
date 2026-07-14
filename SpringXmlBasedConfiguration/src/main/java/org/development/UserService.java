package org.development;

import java.util.List;

public class UserService {
    private List<String> users;

    UserService(List<String> users){
        System.out.println("UserService() called");
        this.users = users;
    }

    public void init(){
        System.out.println("init() called");
    }

    public void destroy(){
        System.out.println("destroy() called");
    }

    public List<String> getUsers() {
        return users;
    }
}
