package server.mediator;

import utility.observer.subject.RemoteSubject;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RemoteModel extends Remote, RemoteSubject<ArrayList<String>,String> {

    void getAllUsers() throws RemoteException;
    void addLog(String log) throws IOException,RemoteException;
    ArrayList<String> getLog() throws RemoteException;
    int getConnectedUsersInt() throws RemoteException;
    ArrayList<String> getConnectedUsers() throws RemoteException;
    void addUser(String name) throws RemoteException;
    void removeUser(String name) throws RemoteException;
}
