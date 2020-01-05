package br;

import br.display.Display;
import br.input.KeyManager;
import br.states.Manager;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {

    private Display display;
    private Thread thread;
    private boolean running = false;

    private Manager manager;
    private KeyManager keyM;

    public static final int WIDTH = 1024, HEIGHT = 768;

    public Game() {
        display = new Display("Tactical Game", WIDTH, HEIGHT);
        manager = new Manager();
        keyM = new KeyManager();

        display.setKeyListener(manager);
        display.setKeyListener(keyM);
        Manager.setState(Manager.MENU);
    }

    @Override
    public void run() {
        init ();
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
                update();
                render();
                delta--;
            }
        }
        stop();

    }

    private void render() {
        BufferStrategy bs = display.getBufferStrategy();
        if (bs == null) {
            display.createBufferStrategy();
            bs = display.getBufferStrategy();
        }

        Graphics graphics = bs.getDrawGraphics();
        graphics.clearRect(0, 0, WIDTH, HEIGHT);

        if (Manager.getState() != null) manager.render(graphics);

        graphics.dispose();
        bs.show();

    }

    private void update() {
        if (Manager.getState() == null) return;

        manager.update();
        keyM.update();
    }

    public synchronized void start() {
        if (thread != null) return;

        thread = new Thread(this);
        thread.start();
        running = true;

    }

    public synchronized void stop() {
        if (thread == null) return;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void init() {
        
    }


}
