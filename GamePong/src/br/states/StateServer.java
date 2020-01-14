package br.states;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class StateServer extends Thread implements State {

    private static ArrayList<BufferedWriter>clients;
    private static ServerSocket server;
    private String name;
    private Socket connection;
    private InputStreamReader inStreamReader;
    private BufferedReader buffReader;

    @Override
    public void init(){

    }

    public static void main(String[] args) {
        try {
            JLabel labelMessage = new JLabel("Porta do Servidor");
            JTextField textPort = new JTextField("5000");
            Object[] texts = {labelMessage, textPort};

            JOptionPane.showMessageDialog(null, texts);

            server = new ServerSocket(Integer.parseInt(textPort.getText()));
            clients = new ArrayList<BufferedWriter>();
            JOptionPane.showMessageDialog(null, "Servidor ativo pronto para iniciar partida");

            while (true) {
                System.out.println("Aguardando conexao de jogadores...");
                Socket con = server.accept();
                System.out.println("Cliente conectado...");
                Thread t = new ServerTest(con);
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public void KeyPressed(int cod) {

    }

    @Override
    public void KeyReleased(int cod) {

    }
}
