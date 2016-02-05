import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PopulationControlUI extends JFrame {
	private JButton BackB, ExitB;
	private JTextField txtPopulation;
	private JScrollPane scrollPane;
	
	
	public PopulationControlUI(){
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
		
		setTitle("Animal Population Control");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(ExitB);
		
		txtPopulation = new JTextField();
		txtPopulation.setEditable(false);
		txtPopulation.setForeground(new Color(0, 0, 0));
		txtPopulation.setBackground(new Color(255, 215, 0));
		txtPopulation.setBounds(10, 11, 764, 50);
		txtPopulation.setHorizontalAlignment(SwingConstants.CENTER);
		txtPopulation.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtPopulation.setText("Animal Population Control Information");
		getContentPane().add(txtPopulation);
		txtPopulation.setColumns(10);
		
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
		
		JTextPane txtPopulationInfo = new JTextPane();
		scrollPane.setViewportView(txtPopulationInfo);
		txtPopulationInfo.setForeground(new Color(0, 0, 0));
		txtPopulationInfo.setEditable(false);
		txtPopulationInfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtPopulationInfo.setText("Neutering/Spaying services:\r\n\r\n\tMany owners wait till their pet is at least 6 months till they think of neutering. This is not always a wise decision, because though this varies animals can have litters as soon as 4 months.  Humane societies have partnered with whentospay.org to help promote \r\ninformation for people who are uninformed.\r\n\r\n4 months:\r\na. Although this varies from animal to animal, Cats can get pregnant as soon as 4 months\r\nb. Also cats can become pregnant again while they are still nursing their litters, and can have up to three litters a year with four kittens pre litter\r\nc. Dogs generally are 5 to 6 months old before their first heat \r\nd. Dogs normally have about two litters pre year with an average of four puppies a litter.\r\n\r\nAccidently pregnancies:\r\na. About 50% of pregnancies are accidental\r\nb. in heat most animals will go to extremes to mate\r\nc. Even if you are as careful as possible there is still a strong chance of your animal getting pregnant\r\n\r\nShelter Overcrowding:\r\na. Overbreeding leads to an excess of animals\r\nb. millions of animals are put in shelter each year, up to 75% of animals have to be put down to make room for these new incoming animals.\r\n\r\nNeutering/Spaying at an early age is safe:\r\na. Yes, this is a safe process for animals even at an early age\r\nb. This will also help keep animals from extreme behavior as they will not experience heat as strongly as non-neutered animals do.\r\nc. Puppies and kittens recover faster than adult cats and dogs do So visit your local animal shelter and check for neutering services and times\r\n\r\n");
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new PopulationControlUI();
	}
	
}