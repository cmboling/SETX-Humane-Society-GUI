import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class AdoptableListUI extends JFrame {
	private JButton HomeB, exitB;
	private JTextField txtInformation;
	private JTextPane catAdoptionList;
	private JTextPane DogAdoptionList;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	
	
	public AdoptableListUI(){
		setType(Type.UTILITY);
		
		exitB = new JButton("Exit");
		exitB.setFont(new Font("Tahoma", Font.BOLD, 12));
		exitB.setBackground(new Color(255, 215, 0));
		exitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitB.setBounds(461, 427, 296, 60);
		
		setTitle("Adoptable Pets");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(exitB);
		
		txtInformation = new JTextField();
		txtInformation.setEditable(false);
		txtInformation.setForeground(new Color(0, 0, 0));
		txtInformation.setBackground(new Color(255, 215, 0));
		txtInformation.setBounds(10, 11, 764, 50);
		txtInformation.setHorizontalAlignment(SwingConstants.CENTER);
		txtInformation.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtInformation.setText("Adoptable Pets");
		getContentPane().add(txtInformation);
		txtInformation.setColumns(10);
		
		HomeB = new JButton("Back");
		HomeB.setFont(new Font("Tahoma", Font.BOLD, 12));
		HomeB.setBackground(new Color(255, 215, 0));
		HomeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdoptionUI();
				dispose();
			}
		});
		HomeB.setBounds(26, 427, 320, 60);
		getContentPane().add(HomeB);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(400, 72, 374, 327);
		getContentPane().add(scrollPane_1);
		
		catAdoptionList = new JTextPane();
		scrollPane_1.setViewportView(catAdoptionList);
		catAdoptionList.setText("Cat Adoption list:\r\n\r\nNala\r\nYoung Female\r\n3 years old\r\nTabby\r\n\r\nElli\r\nAdult Female\r\n9 years old\r\nDilute Tortie\r\n\r\nJojo\r\nAdult Male\r\n7 years old\r\nShort Hair\r\n\r\nKing\r\nYoung Male\r\n2 years old\r\nTabby-grey\r\n\r\nClover\r\nYoung Female\r\n4 years old\r\nShort Hair\r\n\r\nGus\r\nAdult Male\r\n8 years old\r\nTabby-orange\r\n\r\nRollo\r\nAdult Male\r\n8 years old\r\nTortoiseshell\r\nSpot\r\nYoung Male\r\n2 years old\r\nTuxedo\r\n\r\nJack\r\nYoung Male\r\n4 years old\r\nTabby\r\n\r\nWoody\r\nAdult Male\r\n9 years old\r\nTabby\r\n\r\nBella\r\nAdult Female\r\n8 years old\r\nTuxedo\r\n\r\nSargent\r\nYoung Male\r\n2 years old\r\nTabby\r\n\r\nElizabeth\r\nAdult Female\r\n6 years old\r\nTortoiseshell\r\n\r\nDoll\r\nAdult Female\r\n9 years old\r\nShort Hair\r\n\r\nFife\r\nAdult Male\r\n7 years old\r\nTuxedo\r\n\r\nSpaz\r\nYoung Male\r\n2 years old\r\nShort Hair\r\n\r\n\r\nMax\r\nYoung Male\r\n4 years old\r\nTabby\r\n\r\nNoel\r\nAdult Female\r\n8 years old\r\nTabby\r\n\r\nBeana\r\nYoung Female\r\n2 years old\r\nTortoiseshell\r\n\r\nFelix\r\nYoung Male\r\n2 months old\r\nTuxedo");
		catAdoptionList.setForeground(Color.BLACK);
		catAdoptionList.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, 374, 327);
		getContentPane().add(scrollPane);
		
		DogAdoptionList = new JTextPane();
		scrollPane.setViewportView(DogAdoptionList);
		DogAdoptionList.setText("Dog Adoption list:\r\n\r\nJasper\r\nYoung Male\r\n4 years old\r\nAustralian Shepherd\r\n\r\nPepper\r\nAdult Female\r\n9 years old\r\nGreat Dane \r\n\r\nJossie\r\nAdult Female\r\n7 years old\r\nBlack Mouth Curr\r\n\r\nKing\r\nYoung Male\r\n2 years old\r\nDalmatian\r\n\r\nClover\r\nYoung Female\r\n4 years old\r\nChihuahua\r\n\r\nGus\r\nAdult Male\r\n8 years old\r\nPug\r\n\r\nRollo\r\nAdult Female\r\n7 years old\r\nFox Terrier\r\n\r\nSpot\r\nYoung Male\r\n2 years old\r\nCorgi\r\n\r\nJack\r\nYoung Male\r\n4 years old\r\nHusk\r\nWoody\r\nAdult Male\r\n9 years old\r\nGreat Dane \r\n\r\nBella\r\nAdult Female\r\n7 years old\r\nLabrador\r\n\r\nSargent\r\nYoung Male\r\n2 years old\r\nDalmatian\r\n\r\nElizabeth\r\nAdult Female\r\n6 years old\r\nJack Russell Terrier\r\n\r\nDoll\r\nAdult Female\r\n9 years old\r\nChocolate Labrador\r\n\r\nDrew\r\nAdult Male\r\n7 years old\r\nPit Bull\r\n\r\nPooch\r\nYoung Male\r\n2 years old\r\nHusky\r\n\r\nMax\r\nYoung Male\r\n4 years old\r\nMastiff\r\n\r\nLil Bit\r\nAdult Female\r\n6 years old\r\nLabrador/ Terrier\r\n\r\n\r\nShy\r\nYoung Female\r\n2 years old\r\nChihuahua\r\n\r\nZeek\r\nYoung Male\r\n2 years old\r\nWestie\r\n");
		DogAdoptionList.setForeground(Color.BLACK);
		DogAdoptionList.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	public static void main(String[] args)
	{
		new AdoptableListUI();
	}
	*/
}