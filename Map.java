package lesson7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {

    public static final int MODE_HUM_HUM = 0;
    public static final int MODE_AI_HUM = 1;

    Map (){
        setBackground(Color.CYAN);
    }

    void StartNewGame (int mode, int fieldSizeX, int fieldSizeY, int winLeng){
        System.out.printf("M: %d, FSX: %d, FSY: %d, WL: %d", mode, fieldSizeX, fieldSizeY, winLeng);

    }
}
