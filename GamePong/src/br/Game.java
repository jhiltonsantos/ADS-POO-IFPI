package br;

import br.display.Display;

public class Game implements Runnable{

    private Display display;
    private Thread thread;
    private boolean running = false;

    public Game() {
        display = new Display("Pong", 400,300);
    }

    @Override
    public void run() {

        int FPS = 60;
        double timePerTick = 1000000000 / FPS;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            lastTime = now;

            if (delta >= 1) {
                System.out.println(delta);
                delta--;
            }

        }
        stop();
    }

    public synchronized void start() {
        if (thread != null) {
            return;
        }
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        if (thread == null) {
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
