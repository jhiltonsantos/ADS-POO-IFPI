package br.states;

import br.Game;
import br.input.KeyManager;

import java.awt.*;
import java.util.Random;

public class StateLocal implements State {

    private int wObject = 50, hObject = 50;
    //Bola
    private Rectangle ball = new Rectangle(Game.WIDTH/2 - 5,
            Game.HEIGHT/2 - 5,
            wObject, hObject);
    //Jogadores
    private Rectangle p1 = new Rectangle(0, 0, 10,130);
    private Rectangle p2 = new Rectangle(Game.WIDTH -10, 0, 10,130);

    private int movex = 1, movey = 1;
    private int scoreP1 = 0;
    private int scoreP2 = 0;



    @Override
    public void init() {
        start();
    }

    public void start () {
        ball.x = Game.WIDTH/2 - 5;
        ball.y = Game.WIDTH/2 - 5;

        Random r = new Random();
        //Operador Ternario
        movex = (r.nextInt(2) == 0) ? 2 : -2;
        movey = (r.nextInt(2) == 0) ? 2 : -2;

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
            scoreP1++;
            start();
        }
        if (ball.y+hObject > Game.HEIGHT) {
            movey = -2;
        }

        if (ball.x < 0) {
            scoreP2++;
            start();
        }
        if (ball.y < 0) {
            movey = 2;
        }

        if (p1.intersects(ball) || p2.intersects(ball)) {
            movex *= -1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,Game.WIDTH, Game.HEIGHT);

        Font fonte = new Font ("Dialog", Font.BOLD, 24);
        g.setFont(fonte);

        g.setColor(Color.CYAN);
        g.drawString("Player 1: " + scoreP1,
                Game.WIDTH * 1/4 - g.getFontMetrics().stringWidth("Player 1: " + scoreP1)/2,
                g.getFontMetrics(fonte).getHeight());

        g.setColor(Color.ORANGE);
        g.drawString("Player 2: " + scoreP2,
                Game.WIDTH * 3/4 - g.getFontMetrics().stringWidth("Player 2: " + scoreP2)/2,
                g.getFontMetrics(fonte).getHeight());

        g.setColor(Color.RED);
        g.fillRect(Game.WIDTH/2 - 3, 0, 6, Game.HEIGHT);



        g.setColor(Color.RED);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);

        g.setColor(Color.CYAN);
        g.fillRect(p1.x, p1.y, p1.width, p1.height);
        g.setColor(Color.ORANGE);
        g.fillRect(p2.x, p2.y, p2.width, p2.height);



    }

    @Override
    public void KeyPressed(int cod) {

    }

    @Override
    public void KeyReleased(int cod) {

    }
}
