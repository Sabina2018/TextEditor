//i am trying to repeat text editor
//import java.util.*;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.text.JTextComponent;
public class TextEditor extends JFrame{
	private JTextComponent textComp;
	private JToolBar tb;
	private JMenuBar mb;
	
	

	public TextEditor(){
		super("Sabina's TextEditor");
		setSize(320,320);
		//I set some size to default frame. Without it it were not like frame.
		//I learned how to find word easily. You just highlight the word and press CTRL+F
		textComp=createTextArea();
		tb=createToolBar();
		mb=createMenuBar();
		
		Container content=getContentPane();//Container is a part where other components can be contained
		content.add( textComp, BorderLayout.CENTER);//I have added textArea for typing to the container 
		//And I have located in in the center
		content.add(tb,BorderLayout.NORTH);////This is tool bar added
		content.add(mb,BorderLayout.NORTH);
		
	}
	private JTextComponent createTextArea(){//method for creating textArea which is subclass of JTextComponent
		JTextArea ta= new JTextArea();
		return ta;
		
		
	}
	private JToolBar createToolBar(){
		JToolBar bar = new JToolBar();
		return bar;
		
	}
	private JMenuBar createMenuBar(){
		JMenuBar menu =new JMenuBar();
		JMenu file= new JMenu("File");
		JMenu edit= new JMenu("Edit");
		menu.add(file);
		menu.add(edit);
		
		return menu;
		
	}
	public static void main(String args []){
		TextEditor ste = new TextEditor();
		ste.setVisible(true);
		ste.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
