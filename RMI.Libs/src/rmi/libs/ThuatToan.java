/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.libs;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author jacky
 */
public interface ThuatToan extends Remote{
     public int UCLN(int a,int b)throws RemoteException;
    
}
