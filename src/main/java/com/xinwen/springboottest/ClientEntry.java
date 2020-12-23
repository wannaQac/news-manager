package com.xinwen.springboottest;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientEntry {
    public static void main(String []args){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",2018);
            UserManagerInterface userManager = (UserManagerInterface)registry.lookup("userManager");
            System.out.println("用户名是"+userManager.getAdminAccount().getUsername()
                    +"密码"+userManager.getAdminAccount().getPassword());
        } catch (RemoteException e) {   e.printStackTrace();        }
        catch (NotBoundException e) {   e.printStackTrace();        }
    }
}
