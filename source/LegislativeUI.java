import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class LegislativeUI extends JFrame {
	private JButton BackB, ExitB;
	private JTextField txtLegislative;
	private JScrollPane scrollPane;
	
	
	public LegislativeUI(){
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
		
		setTitle("Legislative Information");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(ExitB);
		
		txtLegislative = new JTextField();
		txtLegislative.setEditable(false);
		txtLegislative.setForeground(new Color(0, 0, 0));
		txtLegislative.setBackground(new Color(255, 215, 0));
		txtLegislative.setBounds(10, 11, 764, 50);
		txtLegislative.setHorizontalAlignment(SwingConstants.CENTER);
		txtLegislative.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtLegislative.setText("Legislative Information");
		getContentPane().add(txtLegislative);
		txtLegislative.setColumns(10);
		
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
		
		JTextPane txtLegislativeInfo = new JTextPane();
		scrollPane.setViewportView(txtLegislativeInfo);
		txtLegislativeInfo.setForeground(new Color(0, 0, 0));
		txtLegislativeInfo.setEditable(false);
		txtLegislativeInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtLegislativeInfo.setText("\tAs the HSUS has released the 2013 state ranking scale, which is a comprehensive collection of all 50 states dealing with a wide range of animal protection laws that have been passed or are being put to vote. In this current report Texas has received a 40% score, having passed 31 laws out of 77 from animal fighting to horse protection. \r\n\tThe most current win for animal rights is against puppy mills in pet stores. There was a major loop hole for people that could receive a license saying they were a \u201Cpet store\u201D and using poor cage areas and mistreat of animals to mass produce a stock of goods to sell to wanting costumes. Most costumers were through online purchases and did not see the condition of the animals however. As of September 12th 2013 that loop hole is finally closed giving animal\u2019s freedom and hopefully a happy home. \r\n\tVisit www.thln.org for other recent news as well as events and other services.\r\n");
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new LegislativeUI();
	}
	
}