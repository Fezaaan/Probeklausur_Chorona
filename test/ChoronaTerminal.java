package test;

import javax.swing.*;
import java.awt.*;

public class ChoronaTerminal extends JFrame {
    public ChoronaTerminal(Variant key, Room room) {
        this.setTitle("CHORona - "+ key.getLabel()+"("+key.getDesignation()+")");
        this.setLayout(new BorderLayout());

        //top--------------
        int stepNumber = 0;
        JLabel step = new JLabel("Steps: "+ room.getSteps());
        JPanel top = new JPanel();
        top.add(step);
        this.add(top,BorderLayout.NORTH);
        //middle-----------
        JPanel middle = new JPanel(new GridLayout(room.getSetting().getHeight(),room.getSetting().getWidth()));
        int felder = room.getSetting().getHeight()*room.getSetting().getWidth();
        for(int i =0; i<felder; i++){
            middle.add(new CellButton());
        }
        this.add(middle, BorderLayout.CENTER);
        //bottom
        JPanel bot = new JPanel(new GridLayout(1,3,20,20));
        JButton stepButton = new JButton("Step");
        bot.add(stepButton);
        JButton playButton = new JButton("Play");
        bot.add(playButton);
        JButton saveButton = new JButton("Save");
        bot.add(saveButton);
        this.add(bot, BorderLayout.SOUTH);

        //this.pack();
        this.setSize(640,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
