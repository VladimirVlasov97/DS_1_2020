/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author STT
 */
public class Message extends UnicastRemoteObject implements MessageInterface {

    public Message() throws RemoteException {
    }

    @Override
    public String getMessage() throws RemoteException {
        return "Сообщение от сервера";
    }
}
