package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "San Diego";
    static String raceStartTime = "9:15 am";

    String name;
    int speed;
    int bibNumber;
    
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber=nextBibNumber;
        nextBibNumber++;
    }

    public static void main(String[] args) {
    	nextBibNumber = 16;
    	Athlete athena = new Athlete("Athena", 18);
    	System.out.println(athena.name + " is competing in a race in " + raceLocation
    	+ " at " + raceStartTime + ", wearing a number " + athena.bibNumber
    	+ " bib and running at a speed of " + athena.speed + " mph.");
    	Athlete apollo = new Athlete("Apollo", 16);
    	System.out.println(apollo.name + " is competing in a race in " + raceLocation
    	    	+ " at " + raceStartTime + ", wearing a number " + apollo.bibNumber
    	    	+ " bib and running at a speed of " + apollo.speed + " mph.");
    	Athlete artemis = new Athlete("Artemis",19);
    	System.out.println(artemis.name + " is competing in a race in " + raceLocation
    	    	+ " at " + raceStartTime + ", wearing a number " + artemis.bibNumber
    	    	+ " bib and running at a speed of " + artemis.speed + " mph.");
    	
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}