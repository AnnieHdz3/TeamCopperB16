package letterCraze;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditSavedLevelsGUI extends JFrame {
	public EditSavedLevelsGUI() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Custm1 Puzzle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 80, 120, 79);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Custm4 Theme");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(373, 80, 120, 79);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EMPTY");
		btnNewButton_3.setBounds(494, 80, 120, 79);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Custm2 Theme");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(132, 80, 120, 79);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Custm3 Ligtng");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(253, 80, 120, 79);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_14 = new JButton("G");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_14.setBounds(583, 0, 42, 42);
		getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Delete Levels");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_15.setBounds(452, 0, 130, 42);
		getContentPane().add(btnNewButton_15);
		
		JButton btnAnthonyGringeriAdded = new JButton("ANTHONY GRINGERI ADDED THIS TEXT");
		btnAnthonyGringeriAdded.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnthonyGringeriAdded.setBounds(12, 193, 120, 79);
		getContentPane().add(btnAnthonyGringeriAdded);
		
		JButton button_1 = new JButton("EMPTY");
		button_1.setBounds(132, 193, 120, 79);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("EMPTY");
		button_2.setBounds(253, 193, 120, 79);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("EMPTY");
		button_3.setBounds(373, 193, 120, 79);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("EMPTY");
		button_4.setBounds(494, 193, 120, 79);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("EMPTY");
		button_5.setBounds(12, 303, 120, 79);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("EMPTY");
		button_6.setBounds(132, 303, 120, 79);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("EMPTY");
		button_7.setBounds(253, 303, 120, 79);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("EMPTY");
		button_8.setBounds(373, 303, 120, 79);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("EMPTY");
		button_9.setBounds(494, 303, 120, 79);
		getContentPane().add(button_9);
	}
}
