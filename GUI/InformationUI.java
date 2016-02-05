import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class InformationUI extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 550;
	
	private JButton DisasterB, PopulationB, BackB, ExitB;
	private JTextField txtInformation;
	private JButton NationalSpiritB;
	
	
	public InformationUI(){
		setType(Type.UTILITY);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		DisasterB = new JButton("Hurricane/Disaster Preparedness");
		DisasterB.setFont(new Font("Tahoma", Font.BOLD, 12));
		DisasterB.setBackground(new Color(255, 215, 0));
		DisasterB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DisasterUI();
				dispose();
			}
		});
		DisasterB.setBounds(10, 98, 250, 175);
		
		PopulationB = new JButton("Animal Population Control");
		PopulationB.setFont(new Font("Tahoma", Font.BOLD, 12));
		PopulationB.setBackground(new Color(255, 215, 0));
		PopulationB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PopulationControlUI();
				dispose();
			}
		});
		PopulationB.setBounds(529, 98, 245, 175);
		
		ExitB = new JButton("Exit");
		ExitB.setFont(new Font("Tahoma", Font.BOLD, 12));
		ExitB.setBackground(new Color(255, 215, 0));
		ExitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HSmain();
			}
		});
		ExitB.setBounds(464, 427, 296, 60);
		
		setTitle("Information");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(DisasterB);
		pane.add(PopulationB);
		pane.add(ExitB);
		
		txtInformation = new JTextField();
		txtInformation.setEditable(false);
		txtInformation.setForeground(new Color(0, 0, 0));
		txtInformation.setBackground(new Color(255, 215, 0));
		txtInformation.setBounds(10, 11, 764, 50);
		txtInformation.setHorizontalAlignment(SwingConstants.CENTER);
		txtInformation.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtInformation.setText("Information");
		getContentPane().add(txtInformation);
		txtInformation.setColumns(10);
		
		JButton LegislativeB = new JButton("Legislative Information");
		LegislativeB.setFont(new Font("Tahoma", Font.BOLD, 12));
		LegislativeB.setBackground(new Color(255, 215, 0));
		LegislativeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LegislativeUI();
				dispose();
			}
		});
		LegislativeB.setBounds(270, 98, 249, 175);
		getContentPane().add(LegislativeB);
		
		BackB = new JButton("Back");
		BackB.setFont(new Font("Tahoma", Font.BOLD, 12));
		BackB.setBackground(new Color(255, 215, 0));
		BackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HSmain();
				dispose();
			}
		});
		BackB.setBounds(22, 427, 320, 60);
		getContentPane().add(BackB);
		
		NationalSpiritB = new JButton("National Spirit of Adopting a Pet");
		NationalSpiritB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new NationalSpirit();
				dispose();
			}
		});
		NationalSpiritB.setFont(new Font("Tahoma", Font.BOLD, 12));
		NationalSpiritB.setBackground(new Color(255, 215, 0));
		NationalSpiritB.setBounds(142, 284, 486, 107);
		getContentPane().add(NationalSpiritB);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new InformationUI();
	}
	
}