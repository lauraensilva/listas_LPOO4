package exercicio_2_awt;
import java.awt.*;
import java.awt.event.*;


public class FlowLayout2 extends FlowLayout1{
    
    
    public FlowLayout2 () {
    	
        setTitle ("A classe FlowLayout 2");
        setBackground(new Color(0,0,0));
        
        setLayout(new FlowLayout(FlowLayout.LEFT)); // alinhamento a esquerda 
        //setLayout(new FlowLayout(FlowLayout.CENTER)); 
        //setLayout(new FlowLayout(FlowLayout.RIGHT));  
        // setLayout(new FlowLayout(1, 15, 15));    
         //setLayout(new FlowLayout(0, 10, 20));  
            
       
        B1.setBackground(Color.yellow);
        B2.setBackground(Color.green);
        B3.setBackground(Color.blue);
        B4.setBackground(Color.red);
        B5.setBackground(Color.white);
        B6.setBackground(Color.CYAN);
        B7.setBackground(Color.GRAY);
        B8.setBackground(Color.MAGENTA);
        addWindowListener(new FechaJanela());
    }



    public static void main(String arg[]){
        //new j2exe9().show();
        new FlowLayout2().setVisible(true);
    }


    }

