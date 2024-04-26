import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSnake extends JFrame {

    private static final int WINDOW_SIZE = 600;
    private static final int DOT_SIZE = 20;
    private int x = 100;
    private int y = 200;

    public SimpleSnake() {
        this.setTitle("Simple Snake Game");
        this.setSize(WINDOW_SIZE, WINDOW_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
        this.setVisible(true);
    }

    private class GamePanel extends JPanel implements KeyListener {
        public GamePanel() {
            this.setFocusable(true);
            this.addKeyListener(this);
            this.setBackground(Color.BLACK);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.GREEN);
            g.fillOval(x, y, DOT_SIZE, DOT_SIZE);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    break;
                case KeyEvent.VK_RIGHT:
                    break;
                case KeyEvent.VK_UP:
                    break;
                case KeyEvent.VK_DOWN:
                    break;
                case KeyEvent.VK_Q:
                    System.exit(0);
                    break;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyTyped(KeyEvent e) {}
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(SimpleSnake::new);
    }
}
