package test;

import javax.swing.*;
import java.awt.*;

public class CellButton extends JButton {
    private double dose;
    private boolean polluter;

    public CellButton(double dose, boolean polluter){
        this.dose =dose;
        this.setText(Double.toString(dose));
        this.polluter = polluter;
        if(polluter==true){
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));

        }
        Chorona.updateButtonForDose(this,dose);
    }
    public double getDose() {
        return dose;
    }


    public boolean isPolluter() {
        return polluter;
    }
}
