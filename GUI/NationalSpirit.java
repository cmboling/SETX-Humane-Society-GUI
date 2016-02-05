import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class NationalSpirit extends JFrame {
	private JButton BackB, ExitB;
	private JTextField txtNSpirit;
	private JScrollPane scrollPane;
	
	
	public NationalSpirit(){
		setType(Type.UTILITY);
		
		ExitB = new JButton("Exit");
		ExitB.setFont(new Font("Tahoma", Font.BOLD, 12));
		ExitB.setBackground(new Color(255, 215, 0));
		ExitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HSmain();
			}
		});
		ExitB.setBounds(461, 427, 296, 60);
		
		setTitle("National Spirit of Adopting a Pet");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(ExitB);
		
		txtNSpirit = new JTextField();
		txtNSpirit.setEditable(false);
		txtNSpirit.setForeground(new Color(0, 0, 0));
		txtNSpirit.setBackground(new Color(255, 215, 0));
		txtNSpirit.setBounds(10, 11, 764, 50);
		txtNSpirit.setHorizontalAlignment(SwingConstants.CENTER);
		txtNSpirit.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtNSpirit.setText("National Spirit of Adopting a Pet");
		getContentPane().add(txtNSpirit);
		txtNSpirit.setColumns(10);
		
		BackB = new JButton("Back");
		BackB.setFont(new Font("Tahoma", Font.BOLD, 12));
		BackB.setBackground(new Color(255, 215, 0));
		BackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformationUI();
				dispose();
			}
		});
		BackB.setBounds(26, 427, 320, 60);
		getContentPane().add(BackB);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 73, 764, 329);
		getContentPane().add(scrollPane);
		
		JTextPane txtNSpiritInfo = new JTextPane();
		scrollPane.setViewportView(txtNSpiritInfo);
		txtNSpiritInfo.setForeground(new Color(0, 0, 0));
		txtNSpiritInfo.setEditable(false);
		txtNSpiritInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNSpiritInfo.setText("Annual Community Outreach: \r\nEach year the Humane Society of Lamar hosts an information event to provide direct benefit to pet owners. Past events have included: low cost vaccinations and low cost micro-chipping.\r\n\r\nCommunity Fundraising:\r\nEach year you will find the Humane Society of Lamar at events in the community throughout the year.  Volunteers are critically involved in attending these events and taking adoptable animals out to public venues to increase their chances of finding a permanent loving home.  You will find us at PetSmart and at other Southeast Texas businesses participating in fund-raising efforts.\r\n\t\r\nLamar Pet Therapy:\r\nHumane Society volunteers, accompanied by a variety of small animals, make regular visits to nursing homes and convalescent centers in Southeast Texas. This \"hands on\" activity brings joy to our community each year by providing them with the opportunity to cuddle a furry kitten or puppy. ");
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new NationalSpirit();
	}
	
}