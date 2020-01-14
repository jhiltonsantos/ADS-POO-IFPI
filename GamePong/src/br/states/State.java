package br.states;

import java.awt.Graphics;
import java.io.IOException;

public interface State {
    void init () throws IOException;
    void update();
    void render(Graphics g);
    void KeyPressed(int cod);
    void KeyReleased(int cod) throws IOException;
}
