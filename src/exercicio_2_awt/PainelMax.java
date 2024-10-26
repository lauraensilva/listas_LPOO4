package exercicio_2_awt;

import java.awt.*;
import java.awt.event.*;
import exercicio_2_awt.FechaJanela;

public class PainelMax extends Frame implements ActionListener {
    public Panel Max, P1, P2, P3, P4, P5, P6, Pbot;
    public Button B1, B2, B3, B4, B5, B6;
    public Label L1, L2, L3, L4, L5, L6;

    public PainelMax() {
        setTitle("O Gerenciador CardLayout");
        setSize(300, 200);
        setLocation(250, 200);
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        B1 = new Button("verde");
        B1.addActionListener(this);
        B2 = new Button("laranja");
        B2.addActionListener(this);
        B3 = new Button("Amarelo");
        B3.addActionListener(this);
        B4 = new Button("Azul");
        B4.addActionListener(this);
        B5 = new Button("Cinza");
        B5.addActionListener(this);
        B6 = new Button("Rosa");
        B6.addActionListener(this);
        
        L1 = new Label("A cor é verde");
        L2 = new Label("A cor é laranja");
        L3 = new Label("A cor é Amarelo");
        L4 = new Label("A cor é Azul");
        L5 = new Label("A cor é Cinza");
        L6 = new Label("A cor é Rosa");

        Max = new Panel();
        Max.setSize(200, 200);
        Max.setLayout(new CardLayout());

        Pbot = new Panel();
        Pbot.setSize(100, 200);
        Pbot.setLayout(new GridLayout(3, 1));
        Pbot.add(B1);
        Pbot.add(B2);
        Pbot.add(B3);
        Pbot.add(B4);
        Pbot.add(B5);
        Pbot.add(B6);

        P1 = new Panel();
        P1.setBackground(Color.green);
        P1.setLayout(new FlowLayout());
        P1.add(L1);

        P2 = new Panel();
        P2.setBackground(Color.orange);
        P2.setLayout(new FlowLayout());
        P2.add(L2);

        P3 = new Panel();
        P3.setBackground(Color.yellow);
        P3.setLayout(new FlowLayout());
        P3.add(L3);
        
        P4 = new Panel();
        P4.setBackground(Color.blue);
        P4.setLayout(new FlowLayout());
        P4.add(L4);
        
        P5 = new Panel();
        P5.setBackground(Color.gray);
        P5.setLayout(new FlowLayout());
        P5.add(L5);
        
        P6 = new Panel();
        P6.setBackground(Color.pink);
        P6.setLayout(new FlowLayout());
        P6.add(L6);

        Max.add(P1, "P1");
        Max.add(P2, "P2");
        Max.add(P3, "P3");
        Max.add(P4, "P4");
        Max.add(P5, "P5");
        Max.add(P6, "P6");

        add(Max, BorderLayout.CENTER);
        add(Pbot, BorderLayout.WEST);
        addWindowListener(new FechaJanela());
    }

    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) Max.getLayout();
        if (e.getSource() == B1) {
            cl.show(Max, "P1");
        }
        if (e.getSource() == B2) {
            cl.show(Max, "P2");
        }
        if (e.getSource() == B3) {
            cl.show(Max, "P3");
        }
        if (e.getSource() == B4) {
            cl.show(Max, "P4");
        }
        if (e.getSource() == B5) {
            cl.show(Max, "P5");
        }
        if (e.getSource() == B6) {
            cl.show(Max, "P6");
        }
    }

    public static void main(String arg[]) {
        new PainelMax().setVisible(true);
    }
}
