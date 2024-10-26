package exercicio_3_swing;

import javax.swing.JRootPane;

public class ClasseJFrame4 extends ClasseJFrame2 {
	public ClasseJFrame4() {
		//getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		//getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		//getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		//getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		//getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
		//getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);
		getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);
		
	}
	
	 public static void main(String arg[]) {
	        new ClasseJFrame4().setVisible(true);
	    }


}
