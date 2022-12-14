package game.snake;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //Params: resizable – true if this frame is resizable; false otherwise.
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
