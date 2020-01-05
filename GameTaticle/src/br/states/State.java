package br.states;

import java.awt.*;

public interface State {
    void init ();
    void update();
    void render(Graphics graphics);
    void KeyPressed(int key);
    void KeyReleased(int key);

}
