import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class HSmain extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 550;
	
	private JButton AnimalServicesB, InformationB, exitB;
	private JTextField txtWelcomeToHS;
	private JMenu mnAboutusMenu;
	private JMenuItem mntmNewMenuItem_1;
	
	public HSmain(){
		new JLabel(" Animal Services ", SwingConstants.CENTER);
		new JLabel(" Information ", SwingConstants.CENTER);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		AnimalServicesB = new JButton("Animal Services");
		AnimalServicesB.setForeground(new Color(105, 105, 105));
		AnimalServicesB.setFont(new Font("Tahoma", Font.BOLD, 21));
		AnimalServicesB.setBackground(new Color(255, 215, 0));
		AnimalServicesB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AnimalServiceUI();
				dispose();
			}
		});
		AnimalServicesB.setBounds(10, 228, 369, 155);
		
		InformationB = new JButton("Information");
		InformationB.setForeground(new Color(105, 105, 105));
		InformationB.setFont(new Font("Tahoma", Font.BOLD, 21));
		InformationB.setBackground(new Color(255, 215, 0));
		InformationB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformationUI();
				dispose();
			}
		});
		InformationB.setBounds(389, 228, 385, 155);
		
		exitB = new JButton("Exit");
		exitB.setForeground(new Color(105, 105, 105));
		exitB.setFont(new Font("Tahoma", Font.BOLD, 19));
		exitB.setBackground(new Color(255, 215, 0));
		exitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitB.setBounds(10, 435, 764, 35);
		
		setTitle("Humane Society");
		Container pane = getContentPane();
	
		getContentPane().setLayout(null);
		pane.add(AnimalServicesB);
		pane.add(InformationB);
		pane.add(exitB);
		
		txtWelcomeToHS = new JTextField();
		txtWelcomeToHS.setEditable(false);
		txtWelcomeToHS.setForeground(new Color(0, 0, 0));
		txtWelcomeToHS.setBackground(new Color(255, 215, 0));
		txtWelcomeToHS.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToHS.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtWelcomeToHS.setText("Welcome to Humane Society");
		txtWelcomeToHS.setBounds(10, 24, 764, 48);
		getContentPane().add(txtWelcomeToHS);
		txtWelcomeToHS.setColumns(10);
		
		JTextPane Hsinfo = new JTextPane();
		Hsinfo.setEditable(false);
		Hsinfo.setForeground(new Color(0, 0, 0));
		Hsinfo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Hsinfo.setText("\tThe Humane Society of Lamar is dedicated to preventing cruelty to animals. We provide and protect the abandoned, abused, and unwanted" +
				" animals in our community and attempt to find them loving homes. We are not animal control nor are we part of any national humane organization. The" +
				" Humane Society of Lamar is a not-for-profit organization. All of our operations, programs and services depend on the tireless efforts of staff members," +
				" volunteers, and the contributions of people and organizations who share our goal in creating a more responsible and humane community that benefits both" +
				" people and animals.\r\n");
		Hsinfo.setBounds(10, 83, 764, 134);
		getContentPane().add(Hsinfo);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 21);
		getContentPane().add(menuBar);
		
		JMenu mnFileMenu = new JMenu("File");
		menuBar.add(mnFileMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFileMenu.add(mntmNewMenuItem);
		
		mnAboutusMenu = new JMenu("About");
		menuBar.add(mnAboutusMenu);
		
		mntmNewMenuItem_1 = new JMenuItem("About Us");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"This project has been developed by "
								+ "\nVipul Prajapati\nChelsea Boling\nJason Higdon and\nDennis Huynh\nUnder the supervision of Dr. Stefan Andrei","About us:",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnAboutusMenu.add(mntmNewMenuItem_1);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new HSmain();
	}
}