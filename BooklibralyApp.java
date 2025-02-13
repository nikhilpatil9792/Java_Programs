//Q1.Create class name as Book with using data member bid,bname,bprice,fauthor,bpublication using do while and 
//		switch case and using set and get.
//		create array of object of size 10 ,store the Book details in it and perform following operations.
//
//		case 1 : Add All Book details.
//		case 2 : Display All Book details.
//	case 3 : Display Book details whose price range between 100 to 500.
//	case 4 : Search Book  details using by:
//					case 1 : Book Id
//					case 2 : Book name
//					case 3 : Book price
//					case 4 : Book author.
//	case 5 : Update Book details using by:
//					case 1 :  Book Id
//					case 2 : Book name
//					case 3 : Book price
//					case 4 : Book publication.	
//	case 6 : Delete Book details using by:
//					case 1 : Book Id
//					case 2 : Book name
//					case 3 : Book price
//					case 4 : Book publication.
//					case 5 : Book author.
//	case 7 : Count Book details using by:
//					case 1 : Book name
//					case 2 : Book price
//					case 3 : Book publication.
//					case 4 : Book author.
//					case 8 : Sort Book Details :
//					case 1 : Ascending Order By Id.
//					case 2 : Descending Order By Price.
//	case 9 : Display Second Highest Book Price Details.
//	case 10 : Exit the code.
//


import java.util.*;
class Book
{
 	private int bid;
	private String bname;
	private int bprice;
	private String bauthor;
	private String bpublication;

 	void setbid(int bid)
        {
	     this.bid=bid;
	}
	public int getbid()
	{
              return bid;
	}
	void setbname(String bname)
        {
	     this.bname=bname;
	}
	public String getbname()
	{
              return bname;
	}
	void setbprice(int bprice)
        {
	     this.bprice=bprice;
	}
	public int getbprice()
	{
              return bprice;
	}
	void setbauthor(String bauthor)
        {
	     this.bauthor=bauthor;
	}
	public String getbauthor()
	{
              return bauthor;
	}
	void setbpublication(String bpublication)
        {
	     this.bpublication=bpublication;
	}
	public String getbpublication()
	{
              return bpublication;
	}
}

public class BooklibralyApp
{
	public static void main(String x[])
	{
	     Scanner np=new Scanner(System.in);
                   
                        Book b[]=new Book[3];
	         
	     		int ch;
                        int choice;
              do{
                       System.out.println("1.Add All Book details");
	     	       System.out.println("2.Display All Book details.");
			System.out.println("3.Display Book details whose price range between 100 to 500.");
			System.out.println("4.Search Book  details using by:");
			System.out.println("5.Update Book details using by");
			System.out.println("Delete Book details using by");
                        System.out.println("Enter your Choice");
			 ch=np.nextInt();

                   switch(ch)
                   {
			case 1:
			      	 for(int i=0; i<b.length; i++)
	   			 {
					b[i]=new Book();

					System.out.println("Enter the id,name,price,author and publication of product");
		
		
		        		 b[i].setbid(np.nextInt());
					 b[i].setbname(np.next());
					 b[i].setbprice(np.nextInt());
					 b[i].setbauthor(np.next());
					 b[i].setbpublication(np.next());
	   			 }
                                 break;
                        case 2:
				System.out.println("id\tname\tprice\tauthor\tpublication");
				System.out.println("..................................................................");
               			 for(int i=0; i<b.length; i++) 
				{
                      		    System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());
				}
				break;
			case 3:
				for(int i=0; i<b.length; i++)
				{
				   
 					if(b[i].getbprice()>=100 && b[i].getbprice()<=500)
					{
						System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());

					}
				   
				}
                               break;
			case 4:   
			        System.out.println("case1.Enter the book id");
				System.out.println("case2.Enter the book name");
				System.out.println("case3.Enter the book price");
				System.out.println("case4.Enter the book author");
                                System.out.println("...................................");
                                System.out.println("Enter your choice in 4 case");
				choice=np.nextInt();
			     
				switch(choice)
				{
				   case 1:
                                        int skey;
				        System.out.println("Enter the Skey book id for detial");
                                        skey=np.nextInt();
					
					 for(int i=0; i<b.length; i++)
					 {
						if(b[i].getbid()==skey)
       						{
							System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());
						}
						else
						{
							System.out.println("Book ID is not avialable");
						}
					 }
				    break;

				    case 2:	String searchname;
						System.out.println("Enter your choice book name");
						searchname=np.nextLine();
						 for(int i=0; i<b.length; i++)
						 {
							if(b[i].getbname()==searchname)
       							{
							    System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());
					                }
						}
						break;
					case 3: int searchprice;
						System.out.println("Enter your choice book price");
						searchprice=np.nextInt();
						 for(int i=0; i<b.length; i++)
						 {
							if(b[i].getbprice()==searchprice)
       							{
							  System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());
							}
							else
							{
							   System.out.println("Book price is not avialable");
							}
						 }
						break;
                                         case 4: String searchauthor;
						System.out.println("Enter your choice book author");
						searchauthor=np.nextLine();
						 for(int i=0; i<b.length; i++)
						 {
							if(b[i].getbauthor()==searchauthor)
       							{
							   System.out.println(b[i].getbid()+"\t"+b[i].getbname()+"\t"+b[i].getbprice()+"\t"+b[i].getbauthor()+"\t"+b[i].getbpublication());
							}
							else
							{
							  System.out.println("Book author is not avialable");
							}
						 }
						break;
	
                                  default:
                                       System.out.println("Invalid choice");
                               }
			     break;
                            case 5: 
				 System.out.println("case1.Enter the book id");
				 System.out.println("case2.Enter the book price");
				System.out.println("case3.Enter the book name");
				System.out.println("case4.Enter the book publication");
                                System.out.println("...................................");
                                System.out.println("Enter your choice in  case 5");
 				choice=np.nextInt();
				
				switch(choice)
				{
				   case 1:
                                         int sid;
					 System.out.println("Enter the search id");
                                         sid=np.nextInt();
					 np.nextLine();
					 
					 for(int i=0; i<b.length; i++)
					 {
							if(b[i].getbid()==sid)
       							{
							   System.out.println("Enter the  book name");
							   b[i].setbname(np.nextLine());
                                                           
							   System.out.println("Enter the  book price");
							   b[i].setbprice(np.nextInt());
							   np.nextLine();
							   System.out.println("Enter the  book author");
							   b[i].setbauthor(np.nextLine());

							  
							  System.out.println("Enter the  book publication");
							   b[i].setbpublication(np.nextLine());

							}
							else
							{
							  System.out.println("Book id not found");
							}
				         }
					break;

                                    case 2: int searchprice;
					 System.out.println("Enter the  searc book price");
                                         searchprice=np.nextInt();
					 for(int i=0; i<b.length; i++)
					 {
							if(b[i].getbprice()==searchprice)
       							{
							   System.out.println("Enter the  book id");
							   b[i].setbid(np.nextInt());
                                                           
							   System.out.println("Enter the  book name");
							   b[i].setbname(np.nextLine());

							  System.out.println("Enter the  book author");
							  b[i].setbauthor(np.nextLine());

							  
							  System.out.println("Enter the  book publication");
							  b[i].setbpublication(np.nextLine());

							}
							else
							{
							  System.out.println("Book price is not avialable");
							}
				         }
					break;

                                     case 3: String searchname;
					 System.out.println("Enter the search book name");
                                         searchname=np.nextLine();
					 for(int i=0; i<b.length; i++)
					 {
							if(b[i].getbname()==searchname)
       							{
							   System.out.println("Enter the  book id");
							   b[i].setbid(np.nextInt());
                                                           
							   System.out.println("Enter the  book price");
							   b[i].setbprice(np.nextInt());

							  System.out.println("Enter the  book author");
							  b[i].setbauthor(np.nextLine());

							  
							  System.out.println("Enter the  book publication");
							   b[i].setbpublication(np.nextLine());

							}
							else
							{
							  System.out.println("Book name is not avialable");
							}
				         }
					break;
				   
					case 4: String searchpublication;
					 System.out.println("Enter the search book  publication");
                                         searchpublication=np.nextLine();
					 for(int i=0; i<b.length; i++)
					 {
							if(b[i].getbpublication()==searchpublication)
       							{
							   System.out.println("Enter the  book id");
							   b[i].setbid(np.nextInt());
                                                           
							   System.out.println("Enter the  book price");
							   b[i].setbprice(np.nextInt());

							  System.out.println("Enter the  book author");
							  b[i].setbauthor(np.nextLine());

							  
							  System.out.println("Enter the  book name");
							  b[i].setbname(np.nextLine());

							}
							else
							{
							  System.out.println("Book publication  is not avialable");
							}
				         }
					break;
					
                                        default:
						System.out.println("Invalid case details");     
				}
                                break;

                               case 6:  
                                       
					                   
		
			  default:
				  System.out.println("Invaid details");

                      }
		}while(ch<=8);
	}
}







