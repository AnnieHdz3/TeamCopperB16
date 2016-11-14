package letterCraze;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class InitializeBuilder extends JFrame {
	public InitializeBuilder() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton createLevelButton = new JButton("Create Level");
		createLevelButton.setBounds(250, 300, 300, 50);
		panel.add(createLevelButton);
		
		JButton editSavedLevelsButton = new JButton("Edit Saved Levels");
		editSavedLevelsButton.setBounds(250, 350, 300, 50);
		panel.add(editSavedLevelsButton);
		
		JLabel title = new JLabel("LetterCraze Builder");
		title.setBounds(6, 6, 788, 500);
		title.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(title);
	}
}
