package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application 
{
//creating object and calling constructor of library class
	Library lib=new Library();
	int size =lib.getArray().length-1;
	@Override
	public void start(Stage primaryStage) 
	{	
	//DSA 2 (INSERTION SORT) method is called to sort the string array
		lib.insertionSort(size);
		try 
		{
		//instancing layout and controls
			StackPane st = new StackPane();
			GridPane gp = new GridPane();
			Scene scene = new Scene(st, 1200, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image i = new Image("https://www.incimages.com/uploaded_files/image/1920x1080/getty_813319932_383768.jpg");
			ImageView iv = new ImageView(i);
			Text t1 = new Text("\n\t\t\tLIBRARY MANAGEMENT SYSTEM");
			Label l1 = new Label("USER NAME");
			TextField name = new TextField();
			Label l2 = new Label("PASSWORD ");
			PasswordField pass = new PasswordField();
			Button login = new Button("<< LOGIN >>");
			
		//setting layouts and controls
			iv.setFitHeight(600);
			iv.setFitWidth(1200);
			t1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 46));
			t1.setFill(Color.rgb(255, 255, 102));
			l1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
			l1.setTextFill(Color.rgb(255, 255, 102));
			name.setPrefWidth(200);
			l2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
			l2.setTextFill(Color.rgb(255, 255, 102));
			pass.setPrefWidth(200);
			login.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
			login.setStyle("-fx-background-color: rgb(255, 153, 51)");
			
		//adding layouts and controls
			gp.add(l1, 45, 13);
			gp.setHgap(12);
			gp.add(name, 46, 13);
			gp.setVgap(10);	
			gp.add(l2, 45, 18);
			gp.setHgap(12);
			gp.add(pass, 46, 18);
			gp.setVgap(10);
			gp.add(login, 46, 23);
			gp.setHgap(15);
			gp.setVgap(13);
			st.getChildren().addAll(iv,t1,gp);
			StackPane.setAlignment(t1, Pos.TOP_CENTER);
			
			login.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent e) 
				{
				//local variables to check the credentials
					String User_Name = name.getText();
					String Password = pass.getText();
				
				//creating object and calling constructor of filing class
					FileRead fr = new FileRead();
					fr.open();	//file is opened
					boolean ans = fr.readfile(User_Name, Password);
					if(ans == true) 
					{
						Alert a = new Alert(AlertType.INFORMATION);
						a.setTitle("INFORMATION");
						a.setHeaderText("Welcome");
						a.setContentText("You have loged in Successfully..!");
						a.showAndWait();
						primaryStage.close();
						
					//instancing layout and controls
						Stage stage2 = new Stage();
						StackPane st2 = new StackPane();
						GridPane gp2 = new GridPane();
						Scene scene2 = new Scene(st2, 1200, 600);
						ImageView iv2 = new ImageView(i);
						Label l3 = new Label("ENTER CHOICE:\n------------------------");
						Button method1 = new Button("[+] Add Book            ");
						Button method2 = new Button("[-] Remove Book     ");
						Button method3 = new Button("[-] Remove From Index ");
						Button method4 = new Button("[?] Search Book       ");
						Button method5 = new Button("[|>] Display Shelf     ");
						Button method6 = new Button("[|>] Display Top Authors");
						Button method7 = new Button("[#] Our Mission       ");
						Button method8 = new Button("</> Developers Team");
						Button logout = new Button("<< LOGOUT >>");
					
					//setting layouts and controls
						iv2.setFitWidth(1200);
						iv2.setFitHeight(600);
						l3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
						l3.setTextFill(Color.rgb(255, 255, 102));
						method1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method1.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method2.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method3.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method4.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method5.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method6.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method7.setStyle("-fx-background-color: rgb(255, 255, 102)");
						method8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
						method8.setStyle("-fx-background-color: rgb(255, 255, 102)");
						logout.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
						logout.setStyle("-fx-background-color: rgb(255, 153, 51)");
		
					//adding layouts and controls
						gp2.add(l3, 50, 2);
						gp2.setVgap(10);
						gp2.setHgap(7);
						gp2.add(method1, 51, 5);
						gp2.add(method2, 57, 5);
						gp2.add(method3, 63, 5);
						gp2.setVgap(15);
						gp2.add(method4, 51, 10);
						gp2.add(method5, 57, 10);
						gp2.add(method6, 63, 10);
						gp2.setVgap(15);
						gp2.add(method7, 51, 15);
						gp2.add(method8, 57, 15);
						gp2.add(logout, 51, 23);
						st2.getChildren().addAll(iv2,gp2);
							
						stage2.setScene(scene2);
						stage2.setResizable(false);
						stage2.setTitle("Action Page");
						stage2.show();
						//-----------------------------------------------------------------------------------------------//
						//1st button/method action (ADDITION)
						method1.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e2) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage3 = new Stage();
								StackPane st3 = new StackPane();
								GridPane gp3 = new GridPane();
								Scene scene3 = new Scene(st3, 1200, 600);
								Button back = new Button("<< BACK");
								Text scene3_title = new Text("ADD BOOK:\n==========");
								Label l4 = new Label("Enter The Name Of The book");
								Text Ans1 = new Text("Shelf Is Full");
								Text Ans2 = new Text("Book Has Been Added And Updated\nYou Can Check Display Method\nFor Updated Books");
								TextField input = new TextField();
								Button add = new Button("ADD");
								
							//setting layouts and controls
								scene3_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene3_title.setFill(Color.rgb(255, 255, 102));
								l4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								l4.setTextFill(Color.rgb(255, 255, 102));
								input.setPrefWidth(200);
								add.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								add.setStyle("-fx-background-color: rgb(255, 255, 102)");
								Ans1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
								Ans1.setFill(Color.rgb(255, 255, 102));
								Ans2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
								Ans2.setFill(Color.rgb(255, 255, 102));
								back.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage3.close();
									}	
								});
				
							//adding layouts and controls
								gp3.add(scene3_title, 20, 2);
								gp3.add(l4, 20, 5);
								gp3.add(input, 21, 5);
								gp3.setHgap(15);
								gp3.setVgap(10);
								gp3.add(add, 22, 6);
								add.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent arg0) {
										if(lib.isfull()) {
											gp3.add(Ans1, 20, 10);
											add.setDisable(true);
										}
										else {
											String a=input.getText();
											
										//DSA 1 (STACK) method is called to add the string in array
											lib.Add_A_Book(a);
											size++;
										//DSA 2 (INSERTION SORT) method is called to sort the string array
											lib.insertionSort(size);
											gp3.add(Ans2, 20, 10);
											add.setDisable(true);
										}
									}
								});
								gp3.add(back, 20, 24);
								gp3.setAlignment(Pos.CENTER);
								st3.getChildren().addAll(iv,gp3);
										
								stage3.setScene(scene3);
								stage3.setResizable(false);
								stage3.setTitle("Addition Section");
								stage3.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//2nd button/method action (DELETION)
						method2.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e3) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage4 = new Stage();
								StackPane st4 = new StackPane();
								GridPane gp4 = new GridPane();
								Scene scene4 = new Scene(st4, 1200, 600);
								Text scene4_title = new Text("REMOVE BOOK:\n==============");
								Text message1 = new Text("Shelf Is Empty");
								Text message2 = new Text("The Last Book Has Been Removed From Shelf\nYou Can Check Display Method");
								Button back2 = new Button("<< BACK");						
								
							//setting layouts and controls
								scene4_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene4_title.setFill(Color.rgb(255, 255, 102));
								message1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								message1.setFill(Color.rgb(255, 255, 102));
								message2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								message2.setFill(Color.rgb(255, 255, 102));
								back2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back2.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back2.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage4.close();
									}	
								});
								if(lib.isempty()) {
									gp4.add(message1, 20, 5);
								}
								else {
								//DSA 1 (STACK) method is called to delete the string from array
									lib.Remove_A_Book();
									gp4.add(message2, 20, 5);
									size--;
								}
						
							//adding layouts and controls
								gp4.add(scene4_title, 20, 2);
								gp4.setHgap(15);
								gp4.setVgap(10);
								gp4.add(back2, 20, 24);
								gp4.setAlignment(Pos.CENTER);
								st4.getChildren().addAll(iv,gp4);
								
								stage4.setScene(scene4);
								stage4.setResizable(false);
								stage4.setTitle("Deletion Section");
								stage4.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//3rd button/method action (DELETION FROM INDEX PROVIDED BY USER)
						method3.setOnAction(new EventHandler<ActionEvent>() 
						{
							@Override
							public void handle(ActionEvent e4) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage5 = new Stage();
								StackPane st5 = new StackPane();
								GridPane gp5 = new GridPane();
								Scene scene5 = new Scene(st5, 1200, 600);
								Text scene5_title = new Text("REMOVE BOOK:\n==============");
								Label l6 = new Label("Enter The Index No Of The Book");
								TextField input3 = new TextField();
								Button remove = new Button("REMOVE");
								Text Ans1 = new Text("Shelf Is Empty");
								Text Ans2 = new Text("Your Provided Index Book Has Been Removed\nYou Can Check Display Method");
								Button back3 = new Button("<< BACK");
								
							//setting layouts and controls
								scene5_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene5_title.setFill(Color.rgb(255, 255, 102));
								l6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								l6.setTextFill(Color.rgb(255, 255, 102));
								input3.setPrefWidth(40);
								remove.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								remove.setStyle("-fx-background-color: rgb(255, 255, 102)");
								Ans1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
								Ans1.setFill(Color.rgb(255, 255, 102));
								Ans2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
								Ans2.setFill(Color.rgb(255, 255, 102));
								back3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back3.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back3.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage5.close();
									}	
								});
				
							//adding layouts and controls
								gp5.add(scene5_title, 20, 2);
								gp5.add(l6, 20, 5);
								gp5.add(input3, 21, 5);
								gp5.setHgap(15);
								gp5.setVgap(10);
								gp5.add(remove, 22, 6);
								remove.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent arg0) {
										if(lib.isempty()) {
											gp5.add(Ans1, 20, 10);
											remove.setDisable(true);
										}
										else {
											int a = Integer.parseInt(input3.getText())-1;
											
										//DSA 1 (STACK) method is called to delete the string from specific index in array
											lib.Remove_From_Index(a);
											gp5.add(Ans2, 20, 10);
											size--;
											remove.setDisable(true);
										}
									}
								});
								gp5.add(back3, 20, 24);
								gp5.setAlignment(Pos.CENTER);
								st5.getChildren().addAll(iv,gp5);
								
								stage5.setScene(scene5);
								stage5.setResizable(false);
								stage5.setTitle("Deletion From Specific Index Section");
								stage5.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//4th button/method action (SEARCHING)
						method4.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e5) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage6 = new Stage();
								StackPane st6 = new StackPane();
								GridPane gp6 = new GridPane();
								Scene scene6 = new Scene(st6, 1200, 600);
								Button back4 = new Button("<< BACK");		
								Text scene6_title = new Text("SEARCH BOOK:\n==============");
								Label l5 = new Label("Enter The Name Of Book");
								TextField input2 = new TextField();
								Button search = new Button("SEARCH");
								Text Ans = new Text("Your Book Not Found");
								Text Ans2 = new Text("Your Book Found");
							
							//setting layouts and controls
								scene6_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene6_title.setFill(Color.rgb(255, 255, 102));
								l5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								l5.setTextFill(Color.rgb(255, 255, 102));
								input2.setPrefWidth(200);
								Ans.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								Ans.setFill(Color.rgb(255, 255, 102));
								Ans2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								Ans2.setFill(Color.rgb(255, 255, 102));
								search.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								search.setStyle("-fx-background-color: rgb(255, 255, 102)");
								back4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back4.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back4.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage6.close();
									}	
								});
						
							//adding layouts and controls
								gp6.add(scene6_title, 20, 2);
								gp6.add(l5, 20, 5);
								gp6.add(input2, 21, 5);
								gp6.add(search, 23, 8);
								gp6.setVgap(10);
								gp6.setHgap(16);
								search.setOnAction(new EventHandler<ActionEvent>()
								{
									@Override
									public void handle(ActionEvent arg0) {

									//DSA 3 (LINEAR SEARCH) method is called to search the string in array
										int ans = lib.search(input2.getText());
										if(ans == -1) {
											gp6.add(Ans, 20, 10);
											search.setDisable(true);
										}
										else {
											gp6.add(Ans2, 20, 10);
											search.setDisable(true);
										}
									}
									
								});
								gp6.add(back4, 20, 24);
								gp6.setAlignment(Pos.CENTER);
								st6.getChildren().addAll(iv,gp6);
								
								stage6.setScene(scene6);
								stage6.setResizable(false);
								stage6.setTitle("Search Section");
								stage6.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//5th button/method action (DISPLAY)
						method5.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e6) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage7 = new Stage();
								StackPane st7 = new StackPane();
								GridPane gp7 = new GridPane();
								Scene scene7 = new Scene(st7, 1200, 600);
								Button back5 = new Button("<< BACK");
								Text scene7_title = new Text("\nTHE SHELF OF LIBRARY:\n======================\nBooks:\n---------");
								
							//setting layouts and controls
								scene7_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								scene7_title.setFill(Color.rgb(255, 255, 102));
								back5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back5.setStyle("-fx-background-color: rgb(255, 153, 51)");
								back5.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage7.close();
									}	
								});
						
							//adding layouts and controls
								for(int i=0; i<10;) 
								{
									Text text = new Text("|"+(i+1)+". "+lib.getArray()[i]);
									text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
									text.setFill(Color.rgb(255, 255, 102));
									gp7.add(text, 55, 15+i);
									for(int j=i; j<10;) 
									{
										Text text2 = new Text("\t|"+(j+11)+". "+lib.getArray()[10+j]);
										text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
										text2.setFill(Color.rgb(255, 255, 102));
										gp7.add(text2, 56, (25+j-10));
										for(int k=i; k<10;) 
										{
											Text text3 = new Text("\t|"+(k+21)+". "+lib.getArray()[20+k]);
											text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
											text3.setFill(Color.rgb(255, 255, 102));
											gp7.add(text3, 57, (35+k-20));
											gp7.setVgap(10);
											gp7.setHgap(9);
											k++;
										}
										j++;
									}
									i++;
								}
								gp7.add(back5, 55, 30);
								st7.getChildren().addAll(iv,scene7_title, gp7);
								StackPane.setAlignment(scene7_title, Pos.TOP_CENTER);
								stage7.setScene(scene7);
								stage7.setResizable(false);
								stage7.setTitle("Shelfs Display Section");
								stage7.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//6th button/method action (TOP RATED AUTHORS)
						method6.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e7) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage8 = new Stage();
								StackPane st8 = new StackPane();
								GridPane gp8 = new GridPane();
								Scene scene8 = new Scene(st8, 1200, 600);
								Text scene8_title = new Text("TOP RATED AUTHORS OF LIBRARY:\n===============================");
								Text description = new Text("AUTHORS:\t\t\tBOOKS:\t\t\tRATING:\t\tNO.OF COPIES:\n"+
								"----------------------------------------------------------------------------------------------------");
								Button back6 = new Button("<< BACK");
							
							//setting layouts and controls
								back6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back6.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back6.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage8.close();
									}	
								});
								scene8_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene8_title.setFill(Color.rgb(255, 255, 102));
								description.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
								description.setFill(Color.rgb(255, 255, 102));
						
							//adding layouts and controls
								gp8.add(scene8_title, 20, 5);
								gp8.setVgap(10);
								gp8.setHgap(18);
								gp8.add(description, 20, 8);
								for(int i=0;i<lib.Authors.length; i++) 
								{
									Text text4 = new Text(lib.Authors[i]);
									text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
									text4.setFill(Color.rgb(255, 255, 102));
									gp8.add(text4, 20, 10+i);
								}
								gp8.add(back6, 20, 20);
								gp8.setAlignment(Pos.CENTER);
								st8.getChildren().addAll(iv, gp8);
								
								stage8.setScene(scene8);
								stage8.setResizable(false);
								stage8.setTitle("Top Rated Autors Section");
								stage8.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//7th button/method action (LIBRARY MISSION)
						method7.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e8) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage9 = new Stage();
								StackPane st9 = new StackPane();
								GridPane gp9 = new GridPane();
								Scene scene9 = new Scene(st9, 1200, 600);
								Button back7 = new Button("<< BACK");						
								Text scene9_title = new Text("OUR MISSION:\n----------------------");
								String text = "We as a development team have a mission to run this library\nin a modernized way to spread the "+
											  "knowledge accross the\nworld and make young students habtual of learning through\nprevailing online sources "+
											  "that's why this library is created\nto keep the old way of learning with new trends.";
								Text scene9_text = new Text(text);
								
							//setting layouts and controls
								scene9_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene9_title.setFill(Color.rgb(255, 255, 102));
								scene9_text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								scene9_text.setFill(Color.rgb(255, 255, 102));
								back7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back7.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back7.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage9.close();
									}	
								});
						
							//adding layouts and controls
								st9.getChildren().addAll(iv,gp9);
								gp9.add(scene9_title, 20, 8);
								gp9.setHgap(25);
								gp9.setVgap(15);
								gp9.add(scene9_text, 20, 10);
								gp9.add(back7, 20, 21);
								
								stage9.setScene(scene9);
								stage9.setResizable(false);
								stage9.setTitle("Library's Mission Section");
								stage9.show();
							}
						} );
						//-----------------------------------------------------------------------------------------------//
						//8th button/method action (DEVELOPERS TEAM)
						method8.setOnAction(new EventHandler<ActionEvent>() 
						{

							@Override
							public void handle(ActionEvent e9) 
							{
								stage2.close();
								
							//instancing layout and controls
								Stage stage10 = new Stage();
								StackPane st10 = new StackPane();
								GridPane gp10 = new GridPane();
								Scene scene10 = new Scene(st10, 1200, 600);
								Button back8 = new Button("<< BACK");						
								Text scene10_title = new Text("DEVELOPERS TEAM:\n-------------------------------");
								Text developer1 = new Text("Naeem Ahmed Hakro\t\tBS (Software Engineering)");
								Text developer2 = new Text("Hafiz Syed Haris Ahmed\tBS (Software Engineering)");
								Text developer3 = new Text("Aamir Ahmed\t\t\tBS (Software Engineering)");
								
							//setting layouts and controls
								scene10_title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 28));
								scene10_title.setFill(Color.rgb(255, 255, 102));
								developer1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								developer1.setFill(Color.rgb(255, 255, 102));
								developer2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								developer2.setFill(Color.rgb(255, 255, 102));
								developer3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
								developer3.setFill(Color.rgb(255, 255, 102));
								back8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
								back8.setStyle("-fx-background-color: rgb(255, 153, 51)");
								
								back8.setOnAction(new EventHandler<ActionEvent>() 
								{
									@Override
									public void handle(ActionEvent ae) 
									{
										stage2.show();
										stage10.close();
									}	
								});
							
							//adding layouts and controls
								gp10.add(scene10_title, 20, 8);
								gp10.setHgap(25);
								gp10.setVgap(15);
								gp10.add(developer1,20,10);
								gp10.add(developer2,20,11);
								gp10.add(developer3,20,12);
								gp10.add(back8, 20, 24);
								st10.getChildren().addAll(iv, gp10);
								
								stage10.setScene(scene10);
								stage10.setResizable(false);
								stage10.setTitle("Developers Team Section");
								stage10.show();
							}
						} );
						logout.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								Alert a =new Alert(AlertType.INFORMATION);
								a.setTitle("INFORMATION");
								a.setHeaderText("You have logged Out successfully..!");
								a.showAndWait();
								stage2.close();
							}
						});
					}
					else 
					{
						Alert b = new Alert(AlertType.ERROR);
						b.setTitle("ERROR");
						b.setHeaderText("Wrong Input");
						b.setContentText("Login Failed..!");
						b.showAndWait();
					}
					fr.close();		//file closed
				}
			});
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Library Management System");
			primaryStage.show();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	//-->MAIN METHOD
	public static void main(String[] args) {
		launch(args);
	}
}
