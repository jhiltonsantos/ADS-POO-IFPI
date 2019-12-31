package br.states;

import br.Game;
import br.input.KeyManager;

import java.awt.*;

public class Level1State implements State {

    private int wObject = 10, hObject = 10;
    //Bola
    private Rectangle ball = new Rectangle(Game.WIDTH/2 - 5,
            Game.HEIGHT/2 - 5,
            wObject, hObject);
    //Jogadores
    private Rectangle p1 = new Rectangle(0, 0, 10,50);
    private Rectangle p2 = new Rectangle(Game.WIDTH -10, 0, 10,50);

    private int x = 0, y = 0, movex = 1, movey = 1;


    @Override
    public void init() {

    }

    @Override
    public void update() {
        ball.x += movex;
        ball.y += movey;
        limitsBall();

        if (KeyManager.w){
            p1.y -= 8;
        }
        if (KeyManager.s){
            p1.y += 8;
        }
        if (KeyManager.i){
            p2.y -= 8;
        }
        if (KeyManager.k){
            p2.y += 8;
        }

        limitsPlayers();

    }

    private void limitsPlayers() {
        if (p1.y < 0){
            p1.y = 0;
        }
        if (p1.y > Game.HEIGHT - p1.height){
            p1.y = Game.HEIGHT - p1.height;
        }

        if (p2.y < 0){
            p2.y = 0;
        }
        if (p2.y > Game.HEIGHT - p2.height){
            p2.y = Game.HEIGHT - p2.height;
        }
    }

    private void limitsBall() {
        if (ball.x+wObject > Game.WIDTH) {
            movex = -1;
        }

        if (ball.y+hObject > Game.HEIGHT) {
            movey = -1;
        }

        if (ball.x < 0) {
            movex = 1;
        }

        if (ball.y < 0) {
            movey = 1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,Game.WIDTH, Game.HEIGHT);

        g.setColor(Color.WHITE);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);

        g.fillRect(p1.x, p1.y, p1.width, p1.height);
        g.fillRect(p2.x, p2.y, p2.width, p2.height);



    }

    @Override
    public void KeyPressed(int cod) {

    }

    @Override
    public void KeyReleased(int cod) {

    }
}
