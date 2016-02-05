/***************************************************************************
CPSC 4360 SOFTWARE ENGINERING

"TEXT BASED APP FOR THE HUMANE SOCIETY DEMO"
AUTHORS: CHELSEA BOLING, VIPUL PRAJAPATI, DENNIS HUYNH, JASON HIGDON

The ‘Humane Society’ Requirements:
1. To develop a system that will hold information about pets and their services.
1.1. To register online or in person as a customer looking to adopt a pet or to return a pet;
1.2. To record the details of losing and finding a pet and to perform the connection between these
two persons.
1.3. To inform the customer about the hurricane/disaster preparedness related to pets.
1.4. To inform the customer about the animal population control.
1.5. To inform the customer about the legislative activities related to pets.
2. To analyze the history of pets’ services and estimate what people will most likely choose in the future.
2.1. If a customer has a preferred choice of a pet, the Humane Society should offer periodically
information related to the pets to retain the customer and help him/her decide adopting the pet.
2.2. To promote the national spirit of adopting a pet and take the responsibility to take care of a
pet, and so on.
3. The system must be able of future expansion to incorporate information about existing Humane
Societies and how to expand them in the future.

FUTURE WORK BASED ON CURRENT CONSTRAINTS:
- Utilize a search function to connect two lost and found parties. Currently, it is based on our human
inferences to connect these two parties.
- Populate the data to give better statistics on which pet is likely to be chosen in the future. Again,
is based on human inferences to make these interesting choices.


Command Prompt method to run program:

All classes have been compiled and successfully executed before project presentation.
Please be noted of this!

To compile, locate the folder Humane_Society.
Then type "cd TUI"

Since our TUI is ran a certain way on command prompt (rather than Eclipse IDE),
please compile HumaneSocietyApp.java to be assured that the class does indeed run.

To do this type "javac  HumaneSocietyApp.java"

If successfully ran, please type "java  HumaneSocietyApp" to run the program.

Then, the TUI is free to use at your own expense.

**************************************************************************/
import java.io.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class HumaneSocietyApp {
	
	public static void main(String [] args) throws IOException {
	
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

		int option;
		String inOption;
		
		
/**********************************************************************************************
* MAIN LOOP OF OPTIONS START HERE
***********************************************************************************************/		
		do {	
		
			System.out.println("====================================================");
			System.out.println("Welcome to the Humane Society  at Lamar University!");
			System.out.println("====================================================");
			System.out.println("What would you like to do? Press 1, 2, or 3 to exit:");
			System.out.println("1. Animal Services");
			System.out.println("2. Information Services");
			System.out.println("3. Data Analytics");
			System.out.println("4. Exit");
			System.out.println("====================================================\n");
		
			System.out.println("Enter Option: ");
			inOption = input.readLine(); 
			option = Integer.parseInt(inOption);
		
/***********************SWITCH STATEMENTS: ANIMAL SERVICES, INFORMATION, EXIT******************/
			switch(option) { 
					
/**********************************************************************************************
* ANIMAL SERVICES START HERE
***********************************************************************************************/	
				case 1:  
				{	
					
					int animalService;
					String inAnimalService;
				
					do {
						System.out.println("\n====================================================");
						System.out.println("The Humane Society of Lamar: ANIMAL SERVICES         							");
						System.out.println("====================================================");
						System.out.println("\nWhat animal service may help you right now?\n"); //first question...
						System.out.println("1. Pet Adoption"); 
						System.out.println("2. Pet Lost"); 
						System.out.println("3. Pet Found"); 
						System.out.println("4. Return a Pet"); 
						System.out.println("5. Exit to Main Menu");
						System.out.println("\nEnter Option: ");
						inAnimalService= input.readLine(); 
						animalService = Integer.parseInt(inAnimalService);
					
						switch(animalService) {
					
					
							case 1:
							{
/**********************************************************************************************
* ADOPTION STARTS HERE
***********************************************************************************************/		
								int adoption;
								String inAdoption;
							
								do {	
									System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("Pet Adoption"); 
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("\nWhat would you like to do?");
									System.out.println("1. Yes, I want to adopt!"); 
									System.out.println("2. No, take me back to the Animal Services Menu!\n"); 
									System.out.println("\nEnter Option: ");
									inAdoption = input.readLine(); 
									adoption = Integer.parseInt(inAdoption);
		
/***********************SWITCH STATEMENTS: ADOPTION, EXIT******************/
									switch(adoption) { 
					
/**********************************************************************************************
* REGISTER
***********************************************************************************************/	
										case 1:  
										{		   
											System.out.println("\nView Adoption List of Dogs and Cats \n"); 
											
											BufferedReader inAdopt = new BufferedReader(new FileReader("textdoc/AdoptInfo.txt"));
											String AdoptLine;
											while((AdoptLine = inAdopt.readLine()) != null) {
												System.out.println(AdoptLine);
											}
											inAdopt.close();
											
											Random generator1 = new Random();
											int x = generator1.nextInt(1000);
											
											
											java.io.File file = new java.io.File("Adopt_App/A_Application_"+ x +".txt");
											if (file.exists()) {
												System.out.println("FILE EXISTS");
												System.exit(0);
											}
								
											//Create a file
											java.io.PrintWriter adopt_output = new java.io.PrintWriter(file);
											System.out.println("=============================");
											String adopt_Name;
											System.out.println("\nWhat is your name?"); 
											adopt_Name = input.readLine(); 
											adopt_output.println(adopt_Name);
								
											String adopt_Address;
											System.out.println("\nWhat is your address? (In one line, please)"); 
											adopt_Address = input.readLine(); 
											adopt_output.println(adopt_Address);
								
											String adopt_Phone;
											System.out.println("\nWhat is a convenient phone number to call you?"); 
											adopt_Phone = input.readLine(); 
											adopt_output.println(adopt_Phone);
								
											String adopt_Email;
											System.out.println("\nWhat is your email?"); 
											adopt_Email = input.readLine(); 
											adopt_output.println(adopt_Email);
								
											String adopt_Pet;
											System.out.println("\nWhat is your preferred pet? (List Type of Pet, then if necessary, Name"); 
											adopt_Pet = input.readLine(); 
											adopt_output.println(adopt_Pet);
											
											adopt_output.close();
											
											System.out.println("\nThank you for applying. We will review your application.");
										} 
										break; 
				
										case 2:
										{	
											System.out.println("\nThank you for your consideration on adoption!\n");
				
										}
										break;
	
									} 
/**********************************************************************************************
* EXIT ANIMAL SERVICES HERE
***********************************************************************************************/	
								} 
								while(adoption !=2); // END OF DO WHILE ADOPTION
							} // END OF CASE 1 ADOPTION
							break;
					
					
					
							case 2:
							{
/**********************************************************************************************
* LOST STARTS HERE
***********************************************************************************************/		
								int lost;
								String inLost;
							
								do {	
									System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("Pet Lost"); 
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
									System.out.println("What would you like to do?");
									System.out.println("1. Yes, I want to report a lost pet!"); 
									System.out.println("2. No, take me back to the Animal Services Menu!\n"); 
									System.out.println("\nEnter Option: ");
									inLost = input.readLine(); 
									lost = Integer.parseInt(inLost);
		
/***********************SWITCH STATEMENTS: ADOPTION, EXIT******************/
									switch(lost) { 
					
/**********************************************************************************************
* REGISTER
***********************************************************************************************/	
										case 1:  
										{		   
											System.out.println("\nLost Pet Description\n"); 
											
											Random generator2 = new Random();
											int z = generator2.nextInt(1000);
											
											
											java.io.File file = new java.io.File("LostFound_App/L_Application_"+ z +".txt");
											if (file.exists()) {
												System.out.println("FILE EXISTS");
												System.exit(0);
											}
								
											//Create a file
											java.io.PrintWriter lost_output = new java.io.PrintWriter(file);
											System.out.println("=============================");
											String lost_Name;
											System.out.println("\nWhat is your name?"); 
											lost_Name = input.readLine(); 
											lost_output.println(lost_Name);
								
											String lost_Address;
											System.out.println("\nWhat is your address? (In one line, please)"); 
											lost_Address = input.readLine(); 
											lost_output.println(lost_Address);
								
											String lost_Phone;
											System.out.println("\nWhat is a convenient phone number to call you?"); 
											lost_Phone = input.readLine(); 
											lost_output.println(lost_Phone);
								
											String lost_Email;
											System.out.println("\nWhat is your email?"); 
											lost_Email = input.readLine(); 
											lost_output.println(lost_Email);
								
											String lost_Pet;
											System.out.println("\nHow did you lose your Pet? (one line brief description)"); 
											lost_Pet = input.readLine(); 
											lost_output.println(lost_Pet);
											
											lost_output.close();
											
											System.out.println("\nThank you for applying. We will review your application.");
											System.out.println("Our data analysts will hopefully connect you to the founder.");
												
										} 
										break; 
				
										case 2:
										{	
											System.out.println("\nThank you for your consideration on reporting a lost pet!\n");
										}
										break;
	
									} 
/**********************************************************************************************
* EXIT LOST SERVICES HERE
***********************************************************************************************/	
								}	 
								while(lost !=2); // END OF DO WHILE LOST
							} // END OF CASE 2 LOST
							break;
					
							case 3:
							{
/**********************************************************************************************
* FOUND STARTS HERE
***********************************************************************************************/		
								int found;
								String inFound;
							
								do {	
									System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("Pet Found"); 
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
									System.out.println("What would you like to do?");
									System.out.println("1. Yes, I want to report a found pet!"); 
									System.out.println("2. No, take me back to the Animal Services Menu!\n"); 
									System.out.println("\nEnter Option: ");
									inFound = input.readLine(); 
									found = Integer.parseInt(inFound);
		
/***********************SWITCH STATEMENTS: ADOPTION, EXIT******************/
									switch(found) { 
					
/**********************************************************************************************
* REGISTER
***********************************************************************************************/	
										case 1:  
										{		   
											System.out.println("\nFound Pet Description\n"); 
											
											Random generator3 = new Random();
											int w = generator3.nextInt(1000);
											
											
											java.io.File file = new java.io.File("LostFound_App/F_Application_"+ w +".txt");
											if (file.exists()) {
												System.out.println("FILE EXISTS");
												System.exit(0);
											}
								
											//Create a file
											java.io.PrintWriter found_output = new java.io.PrintWriter(file);
											System.out.println("=============================");
											String found_Name;
											System.out.println("\nWhat is your name?"); 
											found_Name = input.readLine(); 
											found_output.println(found_Name);
								
											String found_Address;
											System.out.println("\nWhat is your address? (In one line, please)"); 
											found_Address = input.readLine(); 
											found_output.println(found_Address);
								
											String found_Phone;
											System.out.println("\nWhat is a convenient phone number to call you?"); 
											found_Phone = input.readLine(); 
											found_output.println(found_Phone);
								
											String found_Email;
											System.out.println("\nWhat is your email?"); 
											found_Email = input.readLine(); 
											found_output.println(found_Email);
								
											String found_Pet;
											System.out.println("\nHow did you find this pet? (one line brief description)"); 
											found_Pet = input.readLine(); 
											found_output.println(found_Pet);
											
											found_output.close();
											
											System.out.println("\nThank you for applying. We will review your application.");
											System.out.println("Our data analysts will hopefully connect you to the owner.");
											
										} 
										break; 
				
										case 2:
										{	
											System.out.println("\nThank you for your consideration on reporting a found pet!\n");	
										}
										break;
	
									}		
/**********************************************************************************************
* EXIT FOUND SERVICES HERE
***********************************************************************************************/	
								} while (found !=2); // END OF DO WHILE FOUND
							} // END OF CASE 1 FOUND					
							break;

							case 4:
							{
/**********************************************************************************************
* RETURN STARTS HERE
***********************************************************************************************/		
								int returnP;
								String inReturn;
							
								do {	
									System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("Pet Return"); 
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
									System.out.println("What would you like to do?");
									System.out.println("1. Yes, I want to report a return pet!"); 
									System.out.println("2. No, take me back to the Animal Services Menu!\n"); 
									System.out.println("\nEnter Option: ");
									inReturn = input.readLine(); 
									returnP = Integer.parseInt(inReturn);
		
/***********************SWITCH STATEMENTS: ADOPTION, EXIT******************/
									switch(returnP) { 
					
/**********************************************************************************************
* REGISTER
***********************************************************************************************/	
										case 1:  
										{		   
											System.out.println("\nReturn Pet Description\n"); 
											System.out.println("READ OUR POLICY FIRST:");
											
											BufferedReader inReturnPet = new BufferedReader(new FileReader("textdoc/Return.txt"));
											String ReturnLine;
											while((ReturnLine = inReturnPet.readLine()) != null) {
												System.out.println(ReturnLine);
											}
											inReturnPet.close();
											
											
											Random generator2 = new Random();
											int y = generator2.nextInt(1000);
											
											
											java.io.File file = new java.io.File("Return_App/R_Application_"+ y +".txt");
											if (file.exists()) {
												System.out.println("FILE EXISTS");
												System.exit(0);
											}
								
											//Create a file
											java.io.PrintWriter return_output = new java.io.PrintWriter(file);
											System.out.println("=============================");
											String return_Name;
											System.out.println("\nWhat is your name?"); 
											return_Name = input.readLine(); 
											return_output.println(return_Name);
								
											String return_Address;
											System.out.println("\nWhat is your address? (In one line, please)"); 
											return_Address = input.readLine(); 
											return_output.println(return_Address);
								
											String return_Phone;
											System.out.println("\nWhat is a convenient phone number to call you?"); 
											return_Phone = input.readLine(); 
											return_output.println(return_Phone);
								
											String return_Email;
											System.out.println("\nWhat is your email?"); 
											return_Email = input.readLine(); 
											return_output.println(return_Email);
								
											String return_Pet;
											System.out.println("\nWhat is your reason for returning pet? (one line brief description)"); 
											return_Pet = input.readLine(); 
											return_output.println(return_Pet);
											
											return_output.close();
											
											System.out.println("\nThank you for applying. We will review your application.");

											
										} 
										break; 
				
										case 2:
										{	
											System.out.println("\nThank you for consideration on returning a pet!\n");
										}
										break;
	
									} 
/**********************************************************************************************
* EXIT RETURN SERVICES HERE
***********************************************************************************************/	
								} while(returnP !=2); // END OF DO WHILE RETURN
							}	 // END OF CASE 1 RETURN		
							break;
							
							case 5:
							{
								System.out.println("\nThank you for using our animal services!\n");
							}
							break;
						}
					} while(animalService != 5);
				} 
				break; 

/**********************************************************************************************
* INFORMATION SERVICES START HERE
***********************************************************************************************/					
				case 2: 
				{			
					int information;
					String inInformation;

/**********************************************************************************************
* MAIN LOOP OF INFORMATION SERVICES START HERE
***********************************************************************************************/		
					do {	
		
						System.out.println("\n====================================================");
						System.out.println("The Humane Society of Lamar: INFORMATION SERVICES         							");
						System.out.println("====================================================");
						System.out.println("\nWhat information do you need to know?"); 
						System.out.println("1. Disaster"); 
						System.out.println("2. Legislative Action"); 
						System.out.println("3. Population Control"); 
						System.out.println("4. Promotion of Spirit"); 	
						System.out.println("5. Other Humane Societies"); 
						System.out.println("6. Exit to Main Menu\n"); 						
		
						System.out.println("\nEnter Option: ");
						inInformation = input.readLine(); 
						information = Integer.parseInt(inInformation);
		
/***********************SWITCH STATEMENTS: INFORMATION SERVICES, EXIT******************/
						switch(information) { 
					
/**********************************************************************************************
* DISASTER SERVICES START HERE
***********************************************************************************************/	
							case 1:  
							{	
								System.out.println("\n*********************************************************************");
								System.out.println("DISASTERS"); 
								System.out.println("*********************************************************************\n");
								
								BufferedReader inDisaster = new BufferedReader(new FileReader("textdoc/DisasterInfo.txt"));
								String disasterLine;
								while((disasterLine = inDisaster.readLine()) != null) {
									System.out.println(disasterLine);
								}
								inDisaster.close();
							} 
							break; 

/**********************************************************************************************
* LEGISLATIVE SERVICES START HERE
***********************************************************************************************/					
							case 2: 
							{		   
								System.out.println("\n*********************************************************************");
								System.out.println("LEGISLATIVE ACTION"); 
								System.out.println("*********************************************************************\n");
								
								BufferedReader inLegislative = new BufferedReader(new FileReader("textdoc/LegislativeInfo.txt"));
								String LegislativeLine;
								while((LegislativeLine = inLegislative.readLine()) != null) {
									System.out.println(LegislativeLine);
								}
								inLegislative.close();
							} 
							break; 
				
/**********************************************************************************************
* POPULATION CONTROL SERVICES START HERE
***********************************************************************************************/					
							case 3: 
							{		   
								System.out.println("\n*********************************************************************");
								System.out.println("POPULATION CONTROL"); 
								System.out.println("*********************************************************************\n");
								
								BufferedReader inPopulation = new BufferedReader(new FileReader("textdoc/SpayingInfo.txt"));
								String PopulationLine;
								while((PopulationLine = inPopulation.readLine()) != null) {
									System.out.println(PopulationLine);
								}
								inPopulation.close();
							} 
							break; 
							
							
/**********************************************************************************************
* PROMOTION OF NATIONAL SPIRIT ON ADOPTION SERVICES START HERE
***********************************************************************************************/					
							case 4: 
							{		   
								System.out.println("\n*********************************************************************");
								System.out.println("PROMOTION OF NATIONAL SPIRIT ON ADOPTION"); 
								System.out.println("*********************************************************************\n");
								
								BufferedReader inSpirit = new BufferedReader(new FileReader("textdoc/Spirit.txt"));
								String SpiritLine;
								while((SpiritLine = inSpirit.readLine()) != null) {
									System.out.println(SpiritLine);
								}
								inSpirit.close();
							} 
							break; 
							
							
/**********************************************************************************************
* OTHER HUMANE SOCIETIES SERVICES START HERE
***********************************************************************************************/					
							case 5: 
							{		   
								System.out.println("\n*********************************************************************");
								System.out.println("OTHER HUMANE SOCIETIES"); 
								System.out.println("*********************************************************************\n");
								
								BufferedReader inOther = new BufferedReader(new FileReader("textdoc/Other_HS.txt"));
								String OtherLine;
								while((OtherLine = inOther.readLine()) != null) {
									System.out.println(OtherLine);
								}
								inOther.close();
							} 
							break; 
				
/**********************************************************************************************
* EXIT INFORMATION SERVICES HERE
***********************************************************************************************/		
							case 6:
							{
								System.out.println("\nTHANK YOU FOR USING OUR INFORMATION SERVICES!\n");	
							} 
							break;
			
			} // END OF SWITCH STATEMENT
		} // END OF DO WHILE LOOP
		while(information !=6);

				}
				break; // END OF CASE 2: INFORMATION SERVICES
				
/**********************************************************************************************
* DATA ANALYTICS HERE
***********************************************************************************************/		
				case 3:
				{
				System.out.println("\nAccording to our data analysts, our current proposition on our history of pets' services is that most people will choose cats in the future!\n");
				System.out.println("From your favorite Humane Society of Lamar receptionist, Angie Poloski");
			} 
				break;
							
	
/**********************************************************************************************
* EXIT PROGRAM HERE
***********************************************************************************************/		
				case 4:
				{
				System.out.println("\nTHANK YOU FOR USING OUR SERVICES!\n");	
			} 
				break;
			
			} // END OF SWITCH STATEMENT
		} // END OF DO WHILE LOOP
		while(option !=4);

/**********************************************************************************************
* MAIN LOOP OF OPTIONS ENDS HERE
***********************************************************************************************/			
	} // END OF MAIN METHOD
} // END OF HumaneSocietyApp Class