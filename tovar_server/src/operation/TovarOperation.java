/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import types.Tovar;

/**
 *
 * @author STT
 */
public class TovarOperation extends UnicastRemoteObject implements TovarOperationInterface {

    static List<Tovar> lstTovar = new ArrayList<Tovar>();

    static {
        lstTovar.add(new Tovar("Товар1", 10, 100));
        lstTovar.add(new Tovar("Товар2", 20, 200));
        lstTovar.add(new Tovar("Товар3", 30, 300));
        lstTovar.add(new Tovar("Товар4", 40, 400));
    }

    public TovarOperation() throws RemoteException {
    }

    @Override
    public List<Tovar> getListOfTovar() throws RemoteException {
        return lstTovar;
    }

    @Override
    public List<Tovar> addNewTovar(Tovar tovar) throws RemoteException {
        lstTovar.add(tovar);
        return lstTovar;
    }

    @Override
    public int getSumOfTovar() throws RemoteException {
        int sum = 0;
        for (Tovar tovar : lstTovar) {
            sum += tovar.getSumma();
        }
        return sum;
    }
}
