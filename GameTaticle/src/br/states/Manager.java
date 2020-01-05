package br.states;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Manager implements KeyListener {

    public static final int numberStates = 1;
    public static State[] states = new State[numberStates];
    public static int currentState = 0;

    public static final int MENU = 0;

    public Manager() {
        states[0] = new Menu();
    }

    public static State getState() {
        return states[currentState];
    }

    public static void setState(int state) {
        currentState = state;
        states[currentState].init();
    }

    public void update() {
        states[currentState].update();
    }

    public void render(Graphics graphics) {
        states[currentState].render(graphics);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        // NOTHING
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        states[currentState].KeyPressed(keyEvent.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        states[currentState].KeyReleased(keyEvent.getKeyCode());
    }
}
