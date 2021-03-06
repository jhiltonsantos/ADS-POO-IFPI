package br.manager;

import br.states.MenuState;
import br.states.State;
import br.states.StateLocal;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StateManager implements KeyListener {

    public static final int numberStates = 2;
    public static State[] states = new State[numberStates];
    public static int currentState = 0;

    public static final int MENU = 0;
    public static final int LOCAL = 1;

    public static void setState(int state) {
        currentState = state;
        states[currentState].init();
    }

    public static State getState() {
        return states[currentState];
    }

    public StateManager() {
        states[0] = new MenuState();
        states[1] = new StateLocal();
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
        states[currentState].KeyReleased(e.getKeyCode());
    }
}
