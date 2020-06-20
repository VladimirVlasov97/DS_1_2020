/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.Naming;
import operation.MessageInterface;

/**
 *
 * @author STT
 */
public class RunClient {

    public static void main(String[] argv) {
        try {
            // вызывается метод lookup класса Naming для получения удаленной ссылки на удаленный объект Message с заданным URL.
            MessageInterface message = (MessageInterface) Naming.lookup("//localhost:8001/rmitest");
            System.out.println(message.getMessage());
        } catch (Exception e) {
            System.out.println("Message Client exception: " + e);
        }
    }
}
