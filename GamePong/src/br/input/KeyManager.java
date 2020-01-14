package br.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys = new boolean[256];
    public static boolean w, s, i, k;

    public void update() {
        w = keys[KeyEvent.VK_W];
        s = keys[KeyEvent.VK_S];
        i = keys[KeyEvent.VK_I];
        k = keys[KeyEvent.VK_K];
    }

    @Override
    public void keyPressed(KeyEvent k) {
        if (k.getKeyCode() < 0 || k.getKeyCode() > 255) {
            return;
        }
        keys[k.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent k) {
        if (k.getKeyCode() < 0 || k.getKeyCode() > 255) {
            return;
        }
        keys[k.getKeyCode()] = false;

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }
}
