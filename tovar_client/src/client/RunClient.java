/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.Naming;
import java.util.List;
import operation.TovarOperationInterface;
import types.Tovar;

/**
 *
 * @author STT
 */
public class RunClient {

    public static void main(String[] argv) {
        try {
            TovarOperationInterface tovarOperation = (TovarOperationInterface) Naming.lookup("//localhost:8000/tovartest");
            // 1 метод
            List<Tovar> lstRet = tovarOperation.getListOfTovar();
            doVivod(lstRet);
            // 3 метод
            System.out.println("Общая сумма товара: " + tovarOperation.getSumOfTovar());
            // 2 метод
            Tovar tovar = new Tovar("Товар555", 55, 555);
            lstRet = tovarOperation.addNewTovar(tovar);
            doVivod(lstRet);
            // 3 метод
            System.out.println("Общая сумма товара: " + tovarOperation.getSumOfTovar());
        } catch (Exception e) {
            System.out.println("Message Client exception: " + e);
        }
    }

    public static void doVivod(List<Tovar> lst) {
        int i = 0;
        System.out.println("#\tНазвание\tЦена\tКол-во\tСумма");
        for (Tovar tovar : lst) {
            System.out.println(++i + "\t" + tovar.getName() + " \t"
                    + tovar.getPrice() + "\t"
                    + tovar.getKol() + " \t"
                    + tovar.getSumma());
        }
        System.out.println();
        System.out.println();
    }
}
