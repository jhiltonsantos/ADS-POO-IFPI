package br.states;

import br.Game;

import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;


public class Menu implements State{

    private String[] options = {"START", "EXIT"};
    private Font font1, font2;
    private int choice = 0;


    @Override
    public void init() {
        font1 = new Font("SansSerif", Font.PLAIN, 60);
        font2 = new Font("Dialog", Font.PLAIN, 36);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

        graphics.setColor(Color.ORANGE);
        graphics.setFont(font1);
        String strTitle = "Tactical Game";
        graphics.drawString(strTitle,
                Game.WIDTH/2 - graphics.getFontMetrics().stringWidth(strTitle)/2,
                Game.HEIGHT * 1/4);

        // Options
        graphics.setFont(font2);
        for (int i = 0; i < options.length; i++) {
            graphics.setColor(Color.YELLOW);
            if (i == choice) {
                graphics.setColor(Color.RED);
            }
            graphics.drawString(options[i],
                    Game.WIDTH/2 - graphics.getFontMetrics().stringWidth(options[i])/2,
                    Game.HEIGHT * 3/4 + graphics.getFontMetrics(font2).getHeight() * i);
        }
    }

    @Override
    public void KeyPressed(int key) {
        // NOTHING
    }

    @Override
    public void KeyReleased(int key) {
        if (key == KeyEvent.VK_W) {
            choice --;
            if (choice < 0) {
                choice = options.length - 1;
            }
        }

        if (key == KeyEvent.VK_S) {
            choice++;
            if (choice > options.length - 1) {
                choice = 0;
            }
        }

        if (key == KeyEvent.VK_ENTER) {
            Select();
        }
    }

    private void Select() {
        switch (choice) {
            case 0:
                //Manager.setState(Manager.LEVEL1);
                break;

            case 1:
                break;

            case 2:
                System.exit(0);
                break;

            default:
                break;
        }
    }
}
