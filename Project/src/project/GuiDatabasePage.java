package project;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiDatabasePage extends JFrame {
	private JTextField txtMuseumAccessionNumber;
	private JTextField txtSiteCode;
	public GuiDatabasePage() {
		
		JPanel panel = new JPanel();
		JPanel row = new dataRow();
		panel.add(row);
		
		JButton btnSave = new JButton("Save Database");
		
		JButton btnLoad = new JButton("Load Database");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblMuseumAccessionNumber = new JLabel("Museum Accession Number");
		
		txtMuseumAccessionNumber = new JTextField();
		txtMuseumAccessionNumber.setColumns(10);
		
		JLabel btnSiteCode = new JLabel("Site Code");
		
		txtSiteCode = new JTextField();
		txtSiteCode.setColumns(10);
		
		JLabel lblContextNumber = new JLabel("Context Number");
		
		JLabel lblNewLabel = new JLabel("Plan Number");
		
		JLabel lblNewLabel_1 = new JLabel("Benchmark Height");
		
		JLabel lblNewLabel_2 = new JLabel("Backsight Height");
		
		JLabel lblNewLabel_3 = new JLabel("Foresight Height");
		
		JLabel lblNewLabel_4 = new JLabel("Instrument Height");
		
		JLabel lblNewLabel_5 = new JLabel("Reduced Level");
		
		JButton btnClose = new JButton("Close Database");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLoad, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
							.addGap(172))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblContextNumber, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel)
							.addGap(27)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addComponent(lblNewLabel_4)
							.addGap(18)
							.addComponent(lblNewLabel_5)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblMuseumAccessionNumber)
							.addGap(4)
							.addComponent(txtMuseumAccessionNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSiteCode)
							.addGap(4)
							.addComponent(txtSiteCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(351, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnLoad)
						.addComponent(btnClose))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMuseumAccessionNumber))
						.addComponent(txtMuseumAccessionNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(btnSiteCode))
						.addComponent(txtSiteCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblContextNumber)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JScrollBar scrollBar = new JScrollBar();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(697, Short.MAX_VALUE)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
