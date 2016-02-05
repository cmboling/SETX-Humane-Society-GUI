import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class DisasterUI extends JFrame {
	private JButton backB, exitB;
	private JTextField txtDisaster;
	private JScrollPane scrollPane;
	
	
	public DisasterUI(){
		setType(Type.UTILITY);
		
		exitB = new JButton("Exit");
		exitB.setFont(new Font("Tahoma", Font.BOLD, 12));
		exitB.setBackground(new Color(255, 215, 0));
		exitB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new HSmain();
			}
		});
		exitB.setBounds(461, 427, 296, 60);
		
		setTitle("Hurricane/Disaster Preparedness ");
		Container pane = getContentPane();
		getContentPane().setLayout(null);
		pane.add(exitB);
		
		txtDisaster = new JTextField();
		txtDisaster.setEditable(false);
		txtDisaster.setForeground(new Color(0, 0, 0));
		txtDisaster.setBackground(new Color(255, 215, 0));
		txtDisaster.setBounds(10, 11, 764, 50);
		txtDisaster.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisaster.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
		txtDisaster.setText("Hurricane/Disaster Preparedness Information");
		getContentPane().add(txtDisaster);
		txtDisaster.setColumns(10);
		
		backB = new JButton("Back");
		backB.setFont(new Font("Tahoma", Font.BOLD, 12));
		backB.setBackground(new Color(255, 215, 0));
		backB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformationUI();
				dispose();
			}
		});
		backB.setBounds(26, 427, 320, 60);
		getContentPane().add(backB);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 73, 764, 329);
		getContentPane().add(scrollPane);
		
		JTextPane txtDisasterinfo = new JTextPane();
		scrollPane.setViewportView(txtDisasterinfo);
		txtDisasterinfo.setForeground(new Color(0, 0, 0));
		txtDisasterinfo.setEditable(false);
		txtDisasterinfo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtDisasterinfo.setText("Making plans for pets during disasters:\r\nThe same goes for pets as it does for your family, having a plan will make everyone safe. So get those emergency kits and \u201Cjust-in-case\u201D plans ready for this year. \r\nWe have given a general check list to help create a general disaster plan.\r\n\r\n1.\tGet ready now\r\na.\tID your pet \u2013 make sure all tags on your pet are up to date and maybe one or two additional address tags of people you trust in case you are out of town.\r\nb.\tDisaster kit \u2013 this is to make any time away from home as comfortable as possible without too much stuff. \r\ni.\tFood for five days\r\nii.\tMedications and medical records\r\niii.\tLitter box or waste bags\r\niv.\tLeashes, carriers\r\nv.\tCurrent photo and description\r\n1.\tIn case you get separated from your pet after evacuating.\r\nvi.\tBeds, toys, misc.\r\nvii.\tInformation on feeding schedules, medical problems, behavior issues, name and number of your vet.\r\n1.\tIn case you have to take them to a shelter\r\nviii.\tGrooming items and other cleaning products\r\n2.\tIf you leave, take your pet\r\na.\tIf it is not safe for your family, you cannot leave your pet. \r\ni.\tYour pets are family, so why would you leave them where they could be in danger.\r\nb.\tLeave early \u2013 Do not wait for an evacuation notice. If you do not feel safe pack up and leave. Most cases of people that wait to have officials help them evacuate have to leave their pets behind.  \r\n3.\tIf you stay home, be safe about it\r\na.\tClose or block unsafe nooks or crannies \u2013 scared cats will hid and may not be able to get out in an emergency\r\nb.\tMove dangerous items\r\nc.\tBring pets inside if weather conditions get bad\r\nd.\tMake a \u201Csafe room\u201D- this is where you store supplies and is safer then the rest of the house.\r\ni.\tIf there are windows board them up with cardboard or wood.\r\nii.\tTake all dangerous objects out of the room.\r\ne.\tListen to the radio for when conditions clear\r\n4.\tAfter Disaster\r\na.\tDon\u2019t let pets run loose \u2013 Pets can become confused and or lost because surroundings maybe unfamiliar from damages. \r\nb.\tCheck for damages \u2013 Pets could escape from damages to house or fence\r\nc.\tBe patient with pets \u2013 It will take time to get them to their normal routines again. There maybe a few problems so just work with them till there better.\r\nd.\tIf flooding has occurred check the area for wild animals- Wildlife may have taken refuge in your area during a storm and could pose a serious problem to you and your pets.\r\n5.\tEveryday emergencies\r\na.\t Cannot get home \u2013 Have neighbors or family that can come and check on your pet in case you are unable to get home.\r\nb.\tHeat wave \u2013 Have shaded areas for pets you live outside in case of increased heat, or a pet door so they can come inside if you are too busy to let them in. \r\n");
		
		setSize(800, 553);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/*
	public static void main(String[] args)
	{
		new DisasterUI();
	}
	*/
}