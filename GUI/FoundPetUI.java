import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.io.*;

@SuppressWarnings("serial")
public class FoundPetUI extends JFrame {
   JFrame frmLostPetApplication;
   JPanel panel;
   private JTextField fname,lname,city,state,zip,hphone,cphone,wphone,email; 
   private JLabel FNameL,LNameL,CityL,StateL,ZipL,HphoneL,CphoneL,WphoneL,EmailL,FoundPetInfoL;
   private JButton btnBack;
   private JButton btnExit;
   private JTextField foundpetinfo;
   
   public FoundPetUI() {
	   getContentPane().setLayout(new GridLayout(12, 2));
	   frmLostPetApplication =new JFrame("Adoption Application");
	   frmLostPetApplication.setTitle("Found Pet Application");
	   frmLostPetApplication.setType(Type.UTILITY);
	   frmLostPetApplication.setForeground(Color.GREEN);
	   frmLostPetApplication.setBackground(Color.BLUE);
	   BorderLayout borderLayout = (BorderLayout) frmLostPetApplication.getContentPane().getLayout();
	   borderLayout.setVgap(4);
	   borderLayout.setHgap(4);
	   panel=new JPanel();
	   panel.setLayout(null);
	   FNameL=new JLabel("First Name",SwingConstants.CENTER);
	   FNameL.setBounds(28, 32, 77, 43);
	   panel.add(FNameL);
	   fname=new JTextField(30);
	   fname.setBounds(115, 32, 297, 43);
	   panel.add(fname);
	   LNameL=new JLabel("Last Name",SwingConstants.CENTER);
	   LNameL.setBounds(422, 35, 77, 43);
	   panel.add(LNameL);
	   lname=new JTextField(30);
	   lname.setBounds(509, 32, 330, 46);
	   panel.add(lname);
	   CityL=new JLabel("City");
	   CityL.setHorizontalAlignment(SwingConstants.CENTER);
	   CityL.setBounds(22, 112, 77, 43);
	   panel.add(CityL);
	   city=new JTextField(20);
	   city.setBounds(115, 112, 196, 43);
	   panel.add(city);
	   StateL=new JLabel("State");
	   StateL.setHorizontalAlignment(SwingConstants.CENTER);
	   StateL.setBounds(360, 112, 55, 43);
	   panel.add(StateL);
	   state=new JTextField(20);
	   state.setBounds(425, 112, 166, 43);
	   panel.add(state);
	   ZipL=new JLabel("Zip code");
	   ZipL.setHorizontalAlignment(SwingConstants.CENTER);
	   ZipL.setBounds(661, 112, 63, 43);
	   panel.add(ZipL);
	   
	   zip = new JTextField();
	   zip.setBounds(734, 112, 105, 43);
	   panel.add(zip);
	   zip.setColumns(10);
	   
	   HphoneL = new JLabel("Home Phone");
	   HphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   HphoneL.setBounds(28, 194, 77, 43);
	   panel.add(HphoneL);
	   hphone=new JTextField(20);
	   hphone.setBounds(115, 194, 166, 43);
	   panel.add(hphone);
	   
	   CphoneL = new JLabel("Cell Phone");
	   CphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   CphoneL.setBounds(314, 194, 66, 43);
	   panel.add(CphoneL);
	   
	   cphone = new JTextField(20);
	   cphone.setBounds(405, 194, 166, 43);
	   panel.add(cphone);
	   
	   WphoneL = new JLabel("Work Phone");
	   WphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   WphoneL.setBounds(581, 194, 84, 43);
	   panel.add(WphoneL);
	   
	   wphone = new JTextField(20);
	   wphone.setBounds(679, 194, 160, 43);
	   panel.add(wphone);
	   
	   EmailL = new JLabel("Email");
	   EmailL.setHorizontalAlignment(SwingConstants.CENTER);
	   EmailL.setBounds(39, 262, 66, 43);
	   panel.add(EmailL);
	   
	   email = new JTextField(20);
	   email.setBounds(115, 262, 724, 46);
	   panel.add(email);
       frmLostPetApplication.getContentPane().add(panel);
       
       FoundPetInfoL = new JLabel("Description of Found Pet");
       FoundPetInfoL.setHorizontalAlignment(SwingConstants.CENTER);
       FoundPetInfoL.setBounds(28, 337, 146, 43);
       panel.add(FoundPetInfoL);
       
       JButton btnSubmit = new JButton("Submit Application");
       btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnSubmit.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       	       		BufferedWriter writer;
       	            try {
       	                writer = new BufferedWriter(new FileWriter("FoundPetApplicants.txt",true));
       	                //writer.write("FirstName" + "\t" + "LastName" + "\t" + address.getText() + "\t" + address2.getText() + "\t" +
            	                //city.getText() + "\t" + state.getText() + "\t" + hphone.getText() + "\t" + cphone.getText() + "\t" + wphone.getText() +
            	                //"\t" + email.getText()+ "\t" + whatdoyou.getText());
       	                writer.write(fname.getText() + "\t" + lname.getText() + "\t" + "\t" + city.getText() + "\t" + state.getText() + "\t" + hphone.getText() +
       	                		"\t" + cphone.getText() + "\t" + wphone.getText() + "\t" + email.getText()+ "\t" + foundpetinfo.getText());
       	                writer.newLine();
       	                writer.close();
       	                JOptionPane.showMessageDialog(null, "Thank you, your information have been submitted succesfully.\n We will contact you very soon.");
       	            } catch(FileNotFoundException ex) {
       	                ex.printStackTrace();
       	            } catch (IOException ex) {
       	                ex.printStackTrace();
       	            }
       	         frmLostPetApplication.dispose();
       	         new HSmain();
       	        }
       	    });
       
       foundpetinfo = new JTextField();
       foundpetinfo.setBounds(195, 334, 644, 60);
       panel.add(foundpetinfo);
       foundpetinfo.setColumns(10);
       	       
       btnSubmit.setBackground(new Color(255, 215, 0));
       btnSubmit.setForeground(new Color(0, 0, 0));
       btnSubmit.setBounds(360, 418, 166, 52);
       panel.add(btnSubmit);
       
       btnBack = new JButton("Back");
       btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnBack.setBackground(new Color(255, 215, 0));
       btnBack.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		new AnimalServiceUI();
       		frmLostPetApplication.dispose();
       	}
       });
       btnBack.setBounds(192, 418, 89, 52);
       panel.add(btnBack);
       
       btnExit = new JButton("Exit");
       btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnExit.setBackground(new Color(255, 215, 0));
       btnExit.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		frmLostPetApplication.dispose();
  	         new HSmain();
       	}
       });
       btnExit.setBounds(598, 418, 89, 52);
       panel.add(btnExit);
       frmLostPetApplication.setSize(900,550);
       frmLostPetApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frmLostPetApplication.setVisible(true);
    }

public static void main(String args[]) {
	new FoundPetUI();
	}
}