package exercicio_3_swing;

import javax.swing.*;

public class ClasseJFrame extends JFrame {

ClasseJFrame() {

setTitle("Descobrindo JFrame");

setBounds(200, 150, 400, 300); /* parametros corresponden a

posicao x,y, altura e largura*/

}

	public static void main(String arg[]) {

		ClasseJFrame Ex = new ClasseJFrame();

		Ex.setVisible(true);

	}

}