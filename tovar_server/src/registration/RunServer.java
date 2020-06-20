/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.TovarOperation;

/**
 *
 * @author STT
 */
public class RunServer {

    public static void main(String[] argv) {
        try {
            // создание экземпляров классов для регистрации
            TovarOperation operation = new TovarOperation();
            // создаём реестр
            Registry registry = LocateRegistry.createRegistry(8000);
            // регистрация классов
            registry.bind("tovartest", operation);
            System.out.println("Tovar Server is ready.");
        } catch (Exception e) {
            System.out.println("Tovar Server failed: " + e);
        }
    }
}
