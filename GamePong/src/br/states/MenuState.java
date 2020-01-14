package br.states;

import br.Game;
import br.manager.StateManager;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class MenuState implements State {

    private String[] options = {"START LOCAL", "START SERVER", "START CLIENT", "EXIT"};
    private Font font1;
    private Font font2;
    private int choice = 0;
    private int x = 0, y = 0, movex = 1, movey = 1;
    private int wObject = 15, hObject = 15;

    @Override
    public void init() {
        font1 = new Font("Dialog", Font.PLAIN, 48);
        font2 = new Font("Dialog", Font.PLAIN, 24);

    }

    @Override
    public void update() {
        x += movex;
        y += movey;
        
        limits();
    }

    private void limits() {
        if (x+wObject > Game.WIDTH) {
            movex = -1;
        }

        if (y+hObject > Game.HEIGHT) {
            movey = -1;
        }

        if (x < 0) {
            movex = 1;
        }

        if (y < 0) {
            movey = 1;
        }
    }

    // OPCOES DO MENU
    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

        g.setColor(Color.WHITE);
        g.setFont(font1);
        String strTitle = "PONG";
        g.drawString(strTitle,
                Game.WIDTH/2 - g.getFontMetrics().stringWidth(strTitle)/2,
                Game.HEIGHT * 1/4);

        g.setFont(font2);
        for (int i = 0; i < options.length; i++) {
            g.setColor(Color.WHITE);
            if (i == choice) {
                g.setColor(Color.CYAN);
            }
            g.drawString(options[i],
                    Game.WIDTH/2 - g.getFontMetrics().stringWidth(options[i])/2,
                    Game.HEIGHT * 3/4 + g.getFontMetrics(font2).getHeight() * i);
        }


        g.setColor(Color.WHITE);
        g.fillRect(x, y, wObject, hObject);
    }

    @Override
    public void KeyPressed(int cod) {

    }

    @Override
    public void KeyReleased(int cod) throws IOException {
        if (cod == KeyEvent.VK_W) {
            choice--;
            if (choice < 0) {
                choice = options.length - 1;
            }
        }

        if (cod == KeyEvent.VK_S) {
            choice++;
            if (choice > options.length - 1) {
                choice = 0;
            }
        }

        if (cod == KeyEvent.VK_ENTER) {
            select();
        }
    }

    private void select() throws IOException {
        switch (choice) {
            case 0:
                StateManager.setState(StateManager.LOCAL);
                break;
            case 1:
                StateManager.setState(StateManager.SERVER);
                break;
            case 2:
                StateManager.setState(StateManager.CLIENT);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
