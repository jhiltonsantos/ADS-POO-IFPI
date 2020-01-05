package br.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys = new boolean[256];
    public static boolean w, s, enter, space;

    public void update() {
        w = keys[KeyEvent.VK_W];
        s = keys[KeyEvent.VK_S];
        enter = keys[KeyEvent.VK_ENTER];
        space = keys[KeyEvent.VK_SPACE];
    }


    @Override
    public void keyTyped(KeyEvent k) {
        // NOTHING
    }

    @Override
    public void keyPressed(KeyEvent k) {
        if (k.getKeyCode() <0 || k.getKeyCode() > 255) return;

        keys[k.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent k) {
        if (k.getKeyCode() <0 || k.getKeyCode() > 255) return;

        keys[k.getKeyCode()] = false;
    }
}
