import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

@SuppressWarnings("serial")
public class AdoptionUI extends JFrame {
   JFrame frame;
   JPanel panel;
   private JTextField fname,lname,address,address2,city,state,zip,hphone,cphone,wphone,email,age; 
   private JLabel FNameL,LNameL,AddressL,Address2L,CityL,StateL,ZipL,HphoneL,CphoneL,WphoneL,EmailL,AgeL,AdoptPreferenceL;
   private JButton btnBackButton;
   private JButton btnExitButton;
   private JTextField adoptpreference;
   
   public AdoptionUI() {
	   getContentPane().setLayout(new GridLayout(12, 2));
	   frame =new JFrame("Adoption Application");
	   frame.setType(Type.UTILITY);
	   frame.setForeground(Color.GREEN);
	   frame.setBackground(Color.BLUE);
	   BorderLayout borderLayout = (BorderLayout) frame.getContentPane().getLayout();
	   borderLayout.setVgap(4);
	   borderLayout.setHgap(4);
	   panel=new JPanel();
	   panel.setLayout(null);
	   FNameL=new JLabel("First Name",SwingConstants.CENTER);
	   FNameL.setBounds(28, 35, 77, 14);
	   panel.add(FNameL);
	   fname=new JTextField(30);
	   fname.setBounds(115, 32, 266, 20);
	   panel.add(fname);
	   LNameL=new JLabel("Last Name",SwingConstants.CENTER);
	   LNameL.setBounds(391, 35, 77, 14);
	   panel.add(LNameL);
	   lname=new JTextField(30);
	   lname.setBounds(478, 32, 246, 20);
	   panel.add(lname);
	   AddressL=new JLabel("Address");
	   AddressL.setHorizontalAlignment(SwingConstants.CENTER);
	   AddressL.setBounds(39, 87, 66, 14);
	   panel.add(AddressL);
	   address=new JTextField(80);
	   address.setBounds(115, 84, 724, 20);
	   panel.add(address);
	   Address2L=new JLabel("Address 2");
	   Address2L.setHorizontalAlignment(SwingConstants.CENTER);
	   Address2L.setBounds(45, 139, 60, 14);
	   panel.add(Address2L);
	   address2=new JTextField(80);
	   address2.setBounds(115, 136, 724, 20);
	   panel.add(address2);
	   CityL=new JLabel("City");
	   CityL.setHorizontalAlignment(SwingConstants.CENTER);
	   CityL.setBounds(45, 191, 60, 14);
	   panel.add(CityL);
	   city=new JTextField(20);
	   city.setBounds(115, 188, 166, 20);
	   panel.add(city);
	   StateL=new JLabel("State");
	   StateL.setHorizontalAlignment(SwingConstants.CENTER);
	   StateL.setBounds(340, 191, 55, 14);
	   panel.add(StateL);
	   state=new JTextField(20);
	   state.setBounds(405, 188, 166, 20);
	   panel.add(state);
	   ZipL=new JLabel("Zip code");
	   ZipL.setHorizontalAlignment(SwingConstants.CENTER);
	   ZipL.setBounds(680, 191, 63, 14);
	   panel.add(ZipL);
	   
	   zip = new JTextField();
	   zip.setBounds(753, 188, 86, 20);
	   panel.add(zip);
	   zip.setColumns(10);
	   
	   HphoneL = new JLabel("Home Phone");
	   HphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   HphoneL.setBounds(28, 243, 77, 14);
	   panel.add(HphoneL);
	   hphone=new JTextField(20);
	   hphone.setBounds(115, 240, 166, 20);
	   panel.add(hphone);
	   
	   CphoneL = new JLabel("Cell Phone");
	   CphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   CphoneL.setBounds(329, 243, 66, 14);
	   panel.add(CphoneL);
	   
	   cphone = new JTextField(20);
	   cphone.setBounds(405, 240, 166, 20);
	   panel.add(cphone);
	   
	   WphoneL = new JLabel("Work Phone");
	   WphoneL.setHorizontalAlignment(SwingConstants.CENTER);
	   WphoneL.setBounds(581, 243, 84, 14);
	   panel.add(WphoneL);
	   
	   wphone = new JTextField(20);
	   wphone.setBounds(679, 240, 160, 20);
	   panel.add(wphone);
	   
	   EmailL = new JLabel("Email");
	   EmailL.setHorizontalAlignment(SwingConstants.CENTER);
	   EmailL.setBounds(39, 291, 66, 14);
	   panel.add(EmailL);
	   
	   email = new JTextField(20);
	   email.setBounds(115, 288, 724, 20);
	   panel.add(email);
	   
	   AgeL = new JLabel("Age ");
	   AgeL.setHorizontalAlignment(SwingConstants.CENTER);
	   AgeL.setBounds(734, 35, 33, 14);
	   panel.add(AgeL);
	   
	   age = new JTextField();
	   age.setBounds(773, 32, 66, 20);
	   panel.add(age);
	   age.setColumns(10);
       frame.getContentPane().add(panel);
       
       AdoptPreferenceL = new JLabel("What do you want to adopt :");
       AdoptPreferenceL.setHorizontalAlignment(SwingConstants.CENTER);
       AdoptPreferenceL.setBounds(34, 337, 157, 14);
       panel.add(AdoptPreferenceL);
       
       JButton btnSubmit = new JButton("Submit Application");
       btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnSubmit.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       	       		BufferedWriter writer;
       	            try {
       	                writer = new BufferedWriter(new FileWriter("AdoptionApplicants.txt",true));
       	                //writer.write("FirstName" + "\t" + "LastName" + "\t" + "Address" + "\t" + "Address2" + "\t" +
            	                //"City" + "\t" + "State" + "\t" + "Home phone" + "\t" + "Cell phone" + "\t" + "Work phone" +
            	                //"\t" + "Email" + "\t" + "Adopt Choice");
       	                //writer.newLine();
       	                writer.write(fname.getText() + "\t" + lname.getText() + "\t" + address.getText() + "\t" + address2.getText() + "\t" +
       	                city.getText() + "\t" + state.getText() + "\t" + hphone.getText() + "\t" + cphone.getText() + "\t" + wphone.getText() +
       	                "\t" + email.getText()+ "\t" + adoptpreference.getText());
       	                writer.newLine();
       	                writer.close();
       	                JOptionPane.showMessageDialog(null, "Thank you, your information have been submitted succesfully.\n We will contact you very soon.");
       	            } catch(FileNotFoundException ex) {
       	                ex.printStackTrace();
       	            } catch (IOException ex) {
       	                ex.printStackTrace();
       	            }
       	       
       	         System.exit(0);
       	      //dispose();
       	        }
       	    });
       
       adoptpreference = new JTextField();
       adoptpreference.setBounds(195, 334, 470, 20);
       panel.add(adoptpreference);
       adoptpreference.setColumns(10);
       	       
       btnSubmit.setBackground(new Color(255, 215, 0));
       btnSubmit.setForeground(new Color(0, 0, 0));
       btnSubmit.setBounds(312, 418, 166, 52);
       panel.add(btnSubmit);
       
       btnBackButton = new JButton("Back");
       btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnBackButton.setBackground(new Color(255, 215, 0));
       btnBackButton.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		new AnimalServiceUI();
       		frame.dispose();
       	}
       });
       btnBackButton.setBounds(581, 418, 89, 52);
       panel.add(btnBackButton);
       
       btnExitButton = new JButton("Exit");
       btnExitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnExitButton.setBackground(new Color(255, 215, 0));
       btnExitButton.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		frame.dispose();
       		new HSmain();
       	}
       });
       btnExitButton.setBounds(750, 418, 89, 52);
       panel.add(btnExitButton);
       
       JButton btnAdoptablePets = new JButton("Adoptable Pets");
       btnAdoptablePets.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
       		new AdoptableListUI();
       		frame.dispose();
       	}
       });
       btnAdoptablePets.setFont(new Font("Tahoma", Font.BOLD, 12));
       btnAdoptablePets.setBackground(new Color(255, 215, 0));
       btnAdoptablePets.setBounds(58, 418, 166, 52);
       panel.add(btnAdoptablePets);
       frame.setSize(900,550);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
   /**
public static void main(String arsg[]) {
	new AdoptionUI();
	}*/
}