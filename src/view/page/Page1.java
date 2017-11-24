package view.page;

import javax.swing.JPanel;

import static controller.Page1Controller.*;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Page1() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPage = new JLabel("Page 1");
		add(lblPage, BorderLayout.NORTH);
		
		JButton btnKeHome = new JButton("Ke Home");
		btnKeHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redirectToHome();
			}
		});
		add(btnKeHome, BorderLayout.CENTER);

	}

}
