package test;

import javax.swing.*;
import java.awt.*;

public class CellButton extends JButton {
    private double dose;
    private boolean polluter;

    public void setDose(double dose) {
        this.dose = dose;
    }

    public void setPolluter(boolean polluter) {
        this.polluter = polluter;
        if(polluter==true){
            this.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        }
    }

    public CellButton(double Dose, boolean polluter){
        this.dose =0;
        this.polluter =false;
        this.setText(Double.toString(getDose()));
    }
    public double getDose() {
        return dose;
    }


    public boolean isPolluter() {
        return polluter;
    }
}
