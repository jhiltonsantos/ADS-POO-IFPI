package br.manager;

import br.states.*;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class StateManager implements KeyListener {

    public static final int numberStates = 4;
    public static State[] states = new State[numberStates];
    public static int currentState = 0;

    public static final int MENU = 0;
    public static final int LOCAL = 1;
    public static final int SERVER = 2;
    public static final int CLIENT = 3;



    public static void setState(int state) throws IOException {
        currentState = state;
        states[currentState].init();
    }

    public static State getState() {
        return states[currentState];
    }

    public StateManager() {
        states[0] = new MenuState();
        states[1] = new StateLocal();
        states[2] = new StateServer();
        states[3] = new StateClient();
    }

    public void update() {
        states[currentState].update();
    }

    public void render(Graphics g) {
        states[currentState].render(g);
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //
    }

    @Override
    public void keyPressed(KeyEvent e) {
        states[currentState].KeyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            states[currentState].KeyReleased(e.getKeyCode());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
