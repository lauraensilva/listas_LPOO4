package exercicio_2_awt;

import java.awt.event.*;

public class FechaJanela extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

