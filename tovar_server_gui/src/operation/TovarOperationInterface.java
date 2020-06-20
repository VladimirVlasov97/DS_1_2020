/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import types.Tovar;

/**
 *
 * @author STT
 */
public interface TovarOperationInterface extends Remote {

    List<Tovar> getListOfTovar() throws RemoteException;

    List<Tovar> addNewTovar(Tovar tovar) throws RemoteException;

    int getSumOfTovar() throws RemoteException;
}
