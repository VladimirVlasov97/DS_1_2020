/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.Message;

/**
 *
 * @author STT
 */
public class RunServer {

    public static void main(String[] argv) {
        try {
            // создание экземпляров классов для регистрации
            Message message = new Message();
            // создаём реестр
            Registry registry = LocateRegistry.createRegistry(8001);
            // регистрация классов
            registry.bind("rmitest", message);
            System.out.println("Message Server is ready.");
        } catch (Exception e) {
            System.out.println("Message Server failed: " + e);
        }
    }
}
