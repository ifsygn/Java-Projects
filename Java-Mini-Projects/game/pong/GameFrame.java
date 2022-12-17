package game.pong;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false); //pencerenin büyüklüklerininin sonradan yanlışlıkla değiştirilememesi için
        this.setBackground(Color.BLACK); //arka plan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); //GamePanel penceresinin, GameFrame penceresi ile birebir olması için
        this.setVisible(true);
        this.setLocationRelativeTo(null); //programın ekranın ortasında açılması için
    }
}
