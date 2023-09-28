import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RacingGame extends JPanel implements ActionListener, KeyListener {
    private int playerX;
    private int playerY;
    private int playerSpeed;
    private Timer timer;

    public RacingGame() {
        playerX = 150;
        playerY = 350;
        playerSpeed = 5;

        timer = new Timer(100, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Vẽ đường đua
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 500);

        // Vẽ người chơi
        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playerY -= playerSpeed;
        if (playerY < 0) {
            playerY = 350;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= playerSpeed;
        }

        if (key == KeyEvent.VK_RIGHT && playerX < 350) {
            playerX += playerSpeed;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Racing Game");
        RacingGame racingGame = new RacingGame();
        frame.add(racingGame);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

