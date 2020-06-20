/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author STT
 */
public interface MessageInterface extends Remote {

    public String getMessage() throws RemoteException;
}
