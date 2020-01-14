package br.display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class Display {

    private JFrame jFrame;
    private Canvas canvas;

    public Display(String title, int width, int height) {
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        jFrame = new JFrame(title);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        canvas.setFocusable(false);
        jFrame.add(canvas);
        jFrame.pack();

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public BufferStrategy getBufferStrategy() {
        return canvas.getBufferStrategy();
    }

    public void createBufferStrategy() {
        canvas.createBufferStrategy(3);
    }

    public void setKeyListener(KeyListener kl) {
        jFrame.addKeyListener(kl);
    }
}
