package exercicio_2_awt;

import java.awt.*;
import java.awt.event.*;

public class Teclado_of extends Frame {
	public Button Ba, Bb, Bc, Bd, Be, Bf, Bg, Bh, Bi, Bj, Bk, Bl, Bm, Bn, Bo, Bp, Bq, Br, Bs, Bt, Bu, Bv, Bw, Bx, By, Bz, Bponto, Bvirgula;
	public Panel P1, P2, P3;

	public Teclado_of () {

        setSize(600, 300);
        setLocation(150, 150);
        setTitle("A classe GridLayout");
        setBackground(Color.black);

        setLayout(null);
        P1 = new Panel();
        P1.setSize(595, 280);
        P1.setLocation(5, 20);
        P1.setLayout(new GridLayout(4, 4, 2, 2));

		Bq = new Button("Q");
		Bq.setBackground(Color.lightGray);
		Bw = new Button("W");
		Bw.setBackground(Color.lightGray);
		Be = new Button("E");
		Be.setBackground(Color.lightGray);
		Br = new Button("R");
		Br.setBackground(Color.lightGray);
		Bt = new Button("T");
		Bt.setBackground(Color.lightGray);
		By = new Button("Y");
		By.setBackground(Color.lightGray);
		Bu = new Button("U");
		Bu.setBackground(Color.lightGray);
		Bi = new Button("I");
		Bi.setBackground(Color.lightGray);
		Bo = new Button("O");
		Bo.setBackground(Color.lightGray);
		Bp = new Button("P");
		Bp.setBackground(Color.lightGray);
		Ba = new Button("A");
		Ba.setBackground(Color.white);
		Bs = new Button("S");
		Bs.setBackground(Color.white);
		Bd = new Button("D");
		Bd.setBackground(Color.white);
		Bf = new Button("F");
		Bf.setBackground(Color.white);
		Bg = new Button("G");
		Bg.setBackground(Color.white);
		Bh = new Button("H");
		Bh.setBackground(Color.white);
		Bj = new Button("J");
		Bj.setBackground(Color.white);
		Bk = new Button("K");
		Bk.setBackground(Color.white);
		Bl = new Button("L");
		Bl.setBackground(Color.white);
		Bz = new Button("Z");
		Bz.setBackground(Color.orange);
		Bx = new Button("X");
		Bx.setBackground(Color.orange);
		Bc = new Button("C");
		Bc.setBackground(Color.orange);
		Bv = new Button("V");
		Bv.setBackground(Color.orange);
		Bb = new Button("B");
		Bb.setBackground(Color.orange);
		Bn = new Button("N");
		Bn.setBackground(Color.orange);
		Bm = new Button("M");
		Bm.setBackground(Color.orange);
		Bponto = new Button(".");
		Bponto.setBackground(Color.orange);
		Bvirgula = new Button(",");
		Bvirgula.setBackground(Color.orange);
		

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
		P1.add(Ba);
		P1.add(Bs);
		P1.add(Bd);
		P1.add(Bf);
		P1.add(Bg);
		P1.add(Bh);
		P1.add(Bj);
		P1.add(Bk);
		P1.add(Bl);
		P1.add(Bz);
		P1.add(Bx);
		P1.add(Bc);
		P1.add(Bv);
		P1.add(Bb);
		P1.add(Bn);
		P1.add(Bm);
		P1.add(Bvirgula);
		P1.add(Bponto);

		add(P1);
	
		addWindowListener(new FechaJanela());
	}

	public static void main(String arg[]) {
		new Teclado_of().show();
	}
}