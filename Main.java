package prueba;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Main {
	 private static int count;
	 private static List buttons = new ArrayList();
	 private JButton button = new JButton();
	 public Main() {
		 JFrame frame = new JFrame();
		 JButton button = new JButton();
		 buttons.add(button);
		 button.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent ae) {
		 count++;
		 Iterator it = buttons.iterator();
		 while (it.hasNext()) {
		 ((JButton)it.next()).setText("clicks = " + count);
		 }
		 }
	 });
	 button.setText("clicks = " + count);
	 frame.getContentPane().add(button);
	 frame.setSize(300,300);
	 frame.setLocation(400,300);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 }
	 public static void main(String[] args) {
		 System.out.println("[Main] main class executed");
		 new Main();
	 }
}
