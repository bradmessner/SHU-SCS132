// This is our class file
// We create one of these for every class we are goign to make

//This names the class
public class Professor {
	
	// Declare universal variables
	// Note the security and privacy settings
	public String name = "Mr. Messner";
	public int likeableScale;
	private String office;
	
	// Constructor 
	// The constructor is used to load default settings or values into the your class
	// This will only execute when the class is first created
	// The name must match the class name
    public Professor()
    {
        likeableScale = 5;
        office = "Lynch 103";
        System.out.println("You have been assigned a Professor!\n\n");
    }
    
    public void displayInfo()
    {
    	System.out.println("\n\nCurrent Professor Name: " + name);
    	System.out.println("Current Rating Level:   " + likeableScale);
    	System.out.println("Office Location:        " + office + "\n\n");
    }
    
    public void like()
    {
    	if(likeableScale==10)
    		System.out.println("\n\nHold on! You can't like your professor any more!\n\n");
    	else
    		likeableScale++;
    }
    
    public void dislike()
    {
    	if(likeableScale==0)
    		System.out.println("\n\nHold on! You can't dislike your professor any more!\n\n");
    	else
    		likeableScale--;			
    }
    
    public void throwProf(int number) 
    {
    	if(likeableScale > number)
    		System.out.println("\n\nYou like your professor too much - why would you throw him/her?\n\n");
    	else
    	{
    		System.out.println("\n\nYou have successfully thrown your professor.  Feel better now?\n\n");
    		likeableScale = 5;
    	}
    }

}
