package view.page;

import javax.swing.JPanel;

import static controller.HomeController.*;
import view.View;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Home");
		add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnKePage = new JButton("Ke page 1");
		btnKePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redirectToPage1();
			}
		});
		add(btnKePage, BorderLayout.CENTER);

	}

}
