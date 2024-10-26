package exercicio_2_awt;

import java.awt.*;
import java.awt.event.*;


public class Teclado extends Frame {
	public Button Ba, Bb, Bc, Bd, Be, Bf, Bg, Bh, Bi, Bj, Bk, Bl, Bm, Bn, Bo, Bp, Bq, Br, Bs, Bt, Bu, Bv, Bw, Bx, By, Bz;
	public Panel P1, P2, P3, P4;
	public TextField texto;

	public Teclado() {

	    setSize(600, 220);
	    setLocation(150, 150);
	    setTitle("A classe GridLayout");
	    setBackground(Color.black);
	    setLayout(new BorderLayout(1, 1));

	    P1 = new Panel();
	    P1.setLayout(new FlowLayout(1));
	    P1.setSize(683, 250);
	    P2 = new Panel();
	    P2.setLayout(new FlowLayout(1));
	    P3 = new Panel();
	    P3.setLayout(new FlowLayout(1));
	    P3.setSize(683, 250);
	    P4 = new Panel();
	    P4.setLayout(new FlowLayout(1));
	    P4.setSize(683, 250);

	    Dimension buttonSize = new Dimension(50, 50); // Defina o tamanho desejado para os botões

	    Bq = new Button("Q");
	    Bq.setBackground(Color.lightGray);
	    Bq.setPreferredSize(buttonSize);

	    Bw = new Button("W");
	    Bw.setBackground(Color.lightGray);
	    Bw.setPreferredSize(buttonSize);

	    Be = new Button("E");
	    Be.setBackground(Color.lightGray);
	    Be.setPreferredSize(buttonSize);

	    Br = new Button("R");
	    Br.setBackground(Color.lightGray);
	    Br.setPreferredSize(buttonSize);

	    Bt = new Button("T");
	    Bt.setBackground(Color.lightGray);
	    Bt.setPreferredSize(buttonSize);

	    By = new Button("Y");
	    By.setBackground(Color.lightGray);
	    By.setPreferredSize(buttonSize);

	    Bu = new Button("U");
	    Bu.setBackground(Color.lightGray);
	    Bu.setPreferredSize(buttonSize);

	    Bi = new Button("I");
	    Bi.setBackground(Color.lightGray);
	    Bi.setPreferredSize(buttonSize);

	    Bo = new Button("O");
	    Bo.setBackground(Color.lightGray);
	    Bo.setPreferredSize(buttonSize);

	    Bp = new Button("P");
	    Bp.setBackground(Color.lightGray);
	    Bp.setPreferredSize(buttonSize);

	    Ba = new Button("A");
	    Ba.setBackground(Color.white);
	    Ba.setPreferredSize(buttonSize);

	    Bs = new Button("S");
	    Bs.setBackground(Color.white);
	    Bs.setPreferredSize(buttonSize);

	    Bd = new Button("D");
	    Bd.setBackground(Color.white);
	    Bd.setPreferredSize(buttonSize);

	    Bf = new Button("F");
	    Bf.setBackground(Color.white);
	    Bf.setPreferredSize(buttonSize);

	    Bg = new Button("G");
	    Bg.setBackground(Color.white);
	    Bg.setPreferredSize(buttonSize);

	    Bh = new Button("H");
	    Bh.setBackground(Color.white);
	    Bh.setPreferredSize(buttonSize);

	    Bj = new Button("J");
	    Bj.setBackground(Color.white);
	    Bj.setPreferredSize(buttonSize);

	    Bk = new Button("K");
	    Bk.setBackground(Color.white);
	    Bk.setPreferredSize(buttonSize);

	    Bl = new Button("L");
	    Bl.setBackground(Color.white);
	    Bl.setPreferredSize(buttonSize);

	    Bz = new Button("Z");
	    Bz.setBackground(Color.orange);
	    Bz.setPreferredSize(buttonSize);

	    Bx = new Button("X");
	    Bx.setBackground(Color.orange);
	    Bx.setPreferredSize(buttonSize);

	    Bc = new Button("C");
	    Bc.setBackground(Color.orange);
	    Bc.setPreferredSize(buttonSize);

	    Bv = new Button("V");
	    Bv.setBackground(Color.orange);
	    Bv.setPreferredSize(buttonSize);

	    Bb = new Button("B");
	    Bb.setBackground(Color.orange);
	    Bb.setPreferredSize(buttonSize);

	    Bn = new Button("N");
	    Bn.setBackground(Color.orange);
	    Bn.setPreferredSize(buttonSize);

	    Bm = new Button("M");
	    Bm.setBackground(Color.orange);
	    Bm.setPreferredSize(buttonSize);
	    
	    texto = new TextField(50);
	    texto.setEnabled(false);
	    

	    P1.add(Bq);
	    P1.add(Bw);
	    P1.add(Be);
	    P1.add(Br);
	    P1.add(Bt);
	    P1.add(By);
	    P1.add(Bu);
	    P1.add(Bi);
	    P1.add(Bo);
	    P1.add(Bp);

	    P2.add(Ba);
	    P2.add(Bs);
	    P2.add(Bd);
	    P2.add(Bf);
	    P2.add(Bg);
	    P2.add(Bh);
	    P2.add(Bj);
	    P2.add(Bk);
	    P2.add(Bl);

	    P3.add(Bz);
	    P3.add(Bx);
	    P3.add(Bc);
	    P3.add(Bv);
	    P3.add(Bb);
	    P3.add(Bn);
	    P3.add(Bm);
	    
	    Panel verticalPanel = new Panel();
        verticalPanel.setLayout(new GridLayout(3, 1, 5, 5));

        verticalPanel.add(P1);
        verticalPanel.add(P2);
        verticalPanel.add(P3);
        add(verticalPanel, BorderLayout.NORTH);
	    addWindowListener(new FechaJanela());
	}


	public static void main(String arg[]) {
		new Teclado().show();
	}
}
