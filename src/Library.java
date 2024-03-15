package application;

public class Library 
{
	//public array declaration for extra work
	String[] Authors = {"William Shakespeare\t\t42\t\t\t\t5.0\t\t\t\t4 billion",
						"Agatha Christie\t\t\t85\t\t\t\t5.0\t\t\t\t4 billion",
						"Barbara Cartland\t\t\t723\t\t\t\t4.9\t\t\t\t1 billion",
						"Danielle Steel\t\t\t\t179\t\t\t\t4.9\t\t\t\t800 million",
						"Harold Robbins\t\t\t23\t\t\t\t4.9\t\t\t\t750 million"};
	//original array for STACK
	 private String[] arr = {"Hamlet","King Lear","The Tempest","As You Like It","Henry V","Richard III", "Murder on the Orient Express", 
			 "Mysterious Affair at Styles","Murder of Roger Ackroyd","Death on the Nile","The Shadow of Sin","A Ghost in Monte Carlo",
			 "Stars in the Sky","A Shaft of Sunlight","Safe Harbour","The Gift", "Kaleidoscope", "The Numbers Game","Moral Compass","Jewels",
			 "Child's Play","Nine Lives","Macbeth","79 Park Avenue","Twelfth Night","Shakespeare's Sonnets", "The Winter's Tale", "Cymbeline",
			 "King John",
			 ""}; //this is a blank string to add or remove in library cause range of library shelf is 30 books.
	 private static int rear = 28;
    
	//===========================================================
	//DATA STRUCTURE 01: STACK FOR ADDITION AND DELETION OF BOOKS
	//===========================================================
   //method 1
	public boolean isempty()
	{
		if(arr.length==0){
			return true;
		}
		else
			return false;
	}
	//method 2
	public boolean isfull()
	{
		if(rear == arr.length-1){
			return true;
		}
		else
			return false;
	}
    //method 3
    public void Add_A_Book(String a)
    {
        if(isfull())
            System.out.println("Stack is Full");
        else
        {
            arr[++rear] = a;
        }
    }
     //method 4   
    public void Remove_A_Book()
    {
        if(isempty()) {
            System.out.print("Stack is Empty");
        }
        else 
        {
        	arr[rear] = "";
        	rear--;
        }
    }
    //method 5
    public void Remove_From_Index(int index) 
    {
    	if(isempty()){
            System.out.print("Stack is Empty");
        }
        else 
        {
        	int a=index;
        	arr[a] = "";
        	for(int i=index; i<arr.length-1; i++) {
        		arr[i] = arr[i+1];
        	}
        	arr[rear] = "";
        	rear--;
        }
    }
    //method 6
	public String[] getArray() 
    {
    	return arr;
    }
    //=============================================================================
    //DATA STRUCTURE 02: INSERTION SORT FOR SORTING THE ALPHABETICAL ORDER OF BOOKS
    //=============================================================================
  	public void insertionSort(int num)
  	{
  		for (int i = 1; i <num; i++) {
  			for (int j = i; j >0; j--) {
  				if(arr[j-1].compareToIgnoreCase(arr[j])>0)
  				{
  					String temp=arr[j-1];
  					arr[j-1]=arr[j];
  					arr[j]=temp;
  				}
  				
  			}
  			
  		}
  	}
  	//============================================================================
    //DATA STRUCTURE 03: LINEAR SEARCH FOR SEARCHING THE BOOK FROM LIBRARY'S SHELF
  	//============================================================================
  	public int search(String value)
  	{
  		for(int i=0; i<arr.length; i++) 
  		{
  			if(arr[i].equalsIgnoreCase(value)) 
  			{
  				return i;
  			}
  		}
  		return -1;
  	}
}
