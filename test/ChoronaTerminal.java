package test;

import javax.swing.*;
import java.awt.*;

public class ChoronaTerminal extends JFrame {
    public ChoronaTerminal(Variant key, Room room) {
        this.setTitle("CHORona - "+ key.getLabel()+"("+key.getDesignation()+")");
        this.setSize(640,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
