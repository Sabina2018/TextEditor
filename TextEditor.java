//i am trying to repeat text editor
//import java.util.*;

import javax.swing.JFrame;
import javax.swing.text.JTextComponent;
public class TextEditor extends JFrame{
	private JTextComponent Text;
	public TextEditor(){
		super("Sabina's TextEditor");
		
	}
	public static void main(String args []){
		TextEditor ste = new TextEditor();
		ste.setVisible(true);
		ste.setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}
