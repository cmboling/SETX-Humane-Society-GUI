import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AnimalServiceUI extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 550;
	
	private JButton PetAdoptionB, SurrenderB, exitB;
	private JTextField txtAnimalServices;
	private JButton LostB;
	private JButton FoundB;
	
	public AnimalServiceUI(){
		setType(Type.POPUP);
		new JLabel(" Animal Services ", SwingConstants.CENTER);
		new JLabel(" Information ", SwingConstants.CENTER);
		
		//SPecify handlers for each button and add (register) ActionListeners to each button.
		PetAdoptionB = new JButton("Pet Adoption");
		PetAdoptionB.setForeground(new Color(105, 105, 105));
		PetAdoptionB.setFont(new Font("Tahoma", Font.BOLD, 21));
		PetAdoptionB.setBackground(new Color(255, 215, 0));
		PetAdoptionB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdoptionUI();
				dispose();
			}
		});
		PetAdoptionB.setBounds(10, 88, 369, 155);
		
		SurrenderB = new JButton("Surrendering a Pet");
		SurrenderB.setForeground(new Color(105, 105, 105));
		SurrenderB.setFont(new Font("Tahoma", Font.BOLD, 21));
		SurrenderB.setBackground(new Color(255, 215, 0));
		SurrenderB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SurrenderUI();
				dispose();
			}
		});
		SurrenderB.setBounds(405, 88, 369, 155);
		
		exitB = new JButton("Exit");
		exitB.setForeground(new Color(105, 105, 105));
		exitB.setFont(new Font("Tahoma", Font.BOLD, 19));
		exitB.setBackground(new Color(255, 215, 0));
		exitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HSmain();
			}
		});
		exitB.setBounds(405, 449, 369, 35);
		
		setTitle("Animal Services");
		Container pane = getContentPane();
	
		getContentPane().setLayout(null);
		pane.add(PetAdoptionB);
		pane.add(SurrenderB);
		pane.add(exitB);
		
		txtAnimalServices = new JTextField();
		txtAnimalServices.setEditable(false);
		txtAnimalServices.setForeground(new Color(105, 105, 105));
		txtAnimalServices.setBackground(new Color(255, 215, 0));
		txtAnimalServices.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnimalServices.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtAnimalServices.setText("Animal Services");
		txtAnimalServices.setBounds(10, 11, 764, 50);
		getContentPane().add(txtAnimalServices);
		txtAnimalServices.setColumns(10);
		
		LostB = new JButton("Pet Lost");
		LostB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LostPetUI();
				dispose();
			}
		});
		LostB.setForeground(SystemColor.controlDkShadow);
		LostB.setFont(new Font("Tahoma", Font.BOLD, 21));
		LostB.setBackground(new Color(255, 215, 0));
		LostB.setBounds(10, 264, 369, 155);
		getContentPane().add(LostB);
		
		FoundB = new JButton("Pet Found");
		FoundB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FoundPetUI();
				dispose();
			}
		});
		FoundB.setForeground(SystemColor.controlDkShadow);
		FoundB.setFont(new Font("Tahoma", Font.BOLD, 21));
		FoundB.setBackground(new Color(255, 215, 0));
		FoundB.setBounds(405, 264, 369, 155);
		getContentPane().add(FoundB);
		
		JButton backB = new JButton("Back");
		backB.setForeground(new Color(105, 105, 105));
		backB.setFont(new Font("Tahoma", Font.BOLD, 19));
		backB.setBackground(new Color(255, 215, 0));
		backB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new HSmain();
				dispose();
			}
		});
		backB.setBounds(10, 449, 369, 33);
		getContentPane().add(backB);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/**
	public static void main(String[] args){
		new AnimalServiceUI();
	}*/
}