import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SurrenderUI extends JFrame {
	private JButton BackB, ExitB;
	private JTextField txtSurrender;
	private JScrollPane scrollPane;
	
	
	public SurrenderUI(){
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
		
		setTitle("Surrendering a Pet");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(ExitB);
		
		txtSurrender = new JTextField();
		txtSurrender.setEditable(false);
		txtSurrender.setForeground(new Color(0, 0, 0));
		txtSurrender.setBackground(new Color(255, 215, 0));
		txtSurrender.setBounds(10, 11, 764, 50);
		txtSurrender.setHorizontalAlignment(SwingConstants.CENTER);
		txtSurrender.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtSurrender.setText("Surrendering a Pet");
		getContentPane().add(txtSurrender);
		txtSurrender.setColumns(10);
		
		BackB = new JButton("Back");
		BackB.setFont(new Font("Tahoma", Font.BOLD, 12));
		BackB.setBackground(new Color(255, 215, 0));
		BackB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AnimalServiceUI();
				dispose();
			}
		});
		BackB.setBounds(26, 427, 320, 60);
		getContentPane().add(BackB);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, 764, 329);
		getContentPane().add(scrollPane);
		
		JTextPane txtSurrenderInfo = new JTextPane();
		scrollPane.setViewportView(txtSurrenderInfo);
		txtSurrenderInfo.setForeground(new Color(0, 0, 0));
		txtSurrenderInfo.setEditable(false);
		txtSurrenderInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtSurrenderInfo.setText("\tThe Humane Society of Lamar cannot accept every animal brought to our shelter immediately. \r\nWe respect the difficult decision of owners to relinquish their pets, and the hard choices of those \r\ngood citizens who are trying to help a stray. We accept the surrender of pets as space allows. \r\nWe maintain a waiting list for all animals needing to be admitted to the shelter.\r\nAnimals are surrendered to our facility by appointment.\r\nWe admit at least 12 animals per week. We accept more animals as adoptions and space allow.\r\nNote that we cannot accept aggressive, sick or pregnant animals.\r\nPlease call 409-225-7981, and one of our adoption specialists will speak to you.\r\nAt times our waiting list will have up to 100 animals waiting for admission and it can take several weeks \r\nbefore we can admit your pet.\r\nPlease understand that our primary goal is to place as many animals in forever homes as possible, \r\ntherefore we must give every pet admitted to the shelter enough time to find a loving home. \r\nWe cannot guarantee placement of every animal admitted to the shelter.\r\n\t\r\n\tAdmission of any animal into the Humane Society of Lamar  is based on the animal\u2019s health, \r\nbehavior, and adoptability. When you bring your pets, please have:\r\n\r\n    *Any veterinary records\r\n    *Your pet\u2019s medications\r\n    *Special food or treats that your pet needs\r\n    *Your pet\u2019s bed, toys, leash and other belongings from home\r\n\r\nA staff member will evaluate the temperament of your pet. Once your pet has been screened, \r\nand the Humane Society of Lamar decides to accept your pet, we ask a donation to our shelter to be made. \r\nThis is not required, but will greatly help us care for your pet.");
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new SurrenderUI();
	}
	
}