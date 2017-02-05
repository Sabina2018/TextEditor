//i am trying to repeat text editor
//import java.util.*;

import javax.swing.JFrame;
import javax.swing.text.JTextComponent;
public class TextEditor extends JFrame{// text editor class extends JFrame which inherits some abilities from JFrame.
	private JTextComponent Text;//The editor will have private JTextComponent
	public TextEditor(){//this is constructor of this class
		super("Sabina's TextEditor"); //It is constructor which is initialized by name
		
	}
	public static void main(String args []){
		TextEditor ste = new TextEditor();//in main we create instance of Text Editor named ste(Sabina'sTextEditor)
		ste.setVisible(true);// we make text editor to be visible
		ste.setDefaultCloseOperation(HIDE_ON_CLOSE);//default close operation which hides when pressing close. But it does not terminate process
	}
}
