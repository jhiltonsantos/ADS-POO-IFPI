package br.states;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest extends Thread {

    private static ArrayList<BufferedWriter> clients;
    private static ServerSocket server;
    private Socket connection;
    private InputStreamReader inStreamReader;
    private BufferedReader buffReader;

    public ServerTest(Socket con) {
        this.connection = connection;
        try {
            inStreamReader = new InputStreamReader(connection.getInputStream());
            buffReader = new BufferedReader(inStreamReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
