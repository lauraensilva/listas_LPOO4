package exercicio_2_awt;
import java.awt.*;
import java.awt.event.*;

public class BlocosUnip extends Frame {
    public Label L1, L2, L3, L4,L5;
    public Panel P1, P2, P3, P4,P5;
    public Dimension dim;

    public BlocosUnip() {
        dim = new Dimension(400, 300);
        setSize(dim);
        setLocation(150, 150);
        setTitle("A classe BorderLayout");
        setBackground(Color.black);
        
        

        setLayout(new BorderLayout(5,5));
        
        Panel verticalPanel = new Panel();
        verticalPanel.setLayout(new GridLayout(3, 1, 5, 5));

        P1 = new Panel();
        P1.setLayout(new FlowLayout(1));
        P1.setBackground(Color.blue);

        P2 = new Panel();
        P2.setLayout(new FlowLayout(1));
        P2.setBackground(Color.red);

        P3 = new Panel();
        P3.setLayout(new FlowLayout(1));

        P3.setBackground(Color.yellow);

        P4 = new Panel();
        P4.setLayout(new FlowLayout(1));

        P4.setBackground(Color.white);

        P5 = new Panel();
        P5.setLayout(new FlowLayout(1));

        P5.setBackground(Color.lightGray);

        L1 = new Label("BLOCO A");
        L1.setBackground(Color.blue);

        L2 = new Label(" BLOCO B");
        L2.setBackground(Color.red);

        L3 = new Label(" BLOCO C");
        L3.setBackground(Color.yellow);

        L4 = new Label("Estacionamento");
        L4.setBackground(Color.white);

        L5 = new Label(" BLOCO D");
        L5.setBackground(Color.lightGray);

        P1.add(L1);
        P2.add(L2);
        P3.add(L3);
        P4.add(L4);
        P5.add(L5);


        verticalPanel.add(P1);
        verticalPanel.add(P2);
        verticalPanel.add(P3);
        add(verticalPanel, BorderLayout.NORTH); // Adiciona o painel vertical à área NORTH
        add(P4, BorderLayout.CENTER);
        add(P5, BorderLayout.SOUTH);
        addWindowListener(new FechaJanela());
    }

    public static void main(String arg[]) {
        // new j2exe_10 ().show();
        new BlocosUnip().setVisible(true);
    }
}

