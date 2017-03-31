package project;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiFrontPage extends JFrame {
	public GuiFrontPage() {
		
		JButton btnNew = new JButton("New Database");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Behavior for the New Database button
				GuiDatabasePage gdp = new GuiDatabasePage();
				gdp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				gdp.pack();
				gdp.setVisible(true);
				
			}
		});
		
		JButton btnLoad = new JButton("Load Database");
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Behavior for the Exit button
				System.exit(0);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNew)
						.addComponent(btnLoad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(327, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNew)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLoad)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExit)
					.addContainerGap(169, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
