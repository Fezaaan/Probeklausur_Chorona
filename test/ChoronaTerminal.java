package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoronaTerminal extends JFrame {
    private JLabel step;
    Room r;

    public ChoronaTerminal(Variant key, Room room) {
        this.setTitle("CHORona - "+ key.getLabel()+"("+key.getDesignation()+")");
        this.setLayout(new BorderLayout());
        this.r = room;

        //top--------------

        step= new JLabel("Steps: " + room.getSteps());
        JPanel top = new JPanel();
        top.add(step);
        this.add(top,BorderLayout.NORTH);
        //middle-----------
        JPanel middle = new JPanel(new GridLayout(room.getSetting().getHeight(),room.getSetting().getWidth()));
        for(int i = 0; i<room.getSetting().getHeight();i++){
            for(int j =0; j<room.getSetting().getWidth();j++){
                Point check = new Point(i,j);
                if(room.getSetting().pollutants.contains(check)){
                    middle.add(new CellButton(room.getDose(j,i),true));
                }
                else{
                    middle.add(new CellButton(0,false));
                }
            }
        }
        this.add(middle, BorderLayout.CENTER);
        //bottom
        JPanel bot = new JPanel(new GridLayout(1,3,20,20));




        JButton stepButton = new JButton("Step");

        stepButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                r.step();
                //System.out.println(room.getSteps());
                step.setText("Steps: "+ room.getSteps());
            }
        });
        bot.add(stepButton);


        JButton playButton = new JButton("Play");
        playButton.addActionListener( l -> new Thread(() -> {
            stepButton.setEnabled(false);
            playButton.setEnabled(false);
            for(int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Fuck");
            }
            stepButton.setEnabled(true);
            playButton.setEnabled(true);
        }).start());
        bot.add(playButton);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"saved successfully.");
                JOptionPane.showMessageDialog(null, "failed","Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        bot.add(saveButton);
        this.add(bot, BorderLayout.SOUTH);

        //this.pack();
        this.setSize(640,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
