
package pcbuildguide;

import java.util.*;

/**
 *
 * @author nicholasroberto and geoffreysalfi
 */
public class PCBuildguide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //String vendor, String model, int storage, String type, price
        
        games Minecraft = new games("Minecraft","2009", 1);
        games GTA = new games("Grand Theft Auto 5", "2013", 2);
        games PubG = new games("PlayerUnknown Battlegrounds", "2017", 2);
        games Overwatch = new games("Overwatch","2016", 1);
        games Fortnite = new games("Fortnite", "2017", 1);
        games LoL = new games("League of Legends", "2009", 1);
        games RL = new games("Rocket League", "2015", 1);
        games FC5 = new games("Far Cry 5", "2018", 2);
        games CoD = new games("Call of Duty WW2", "2017", 2);
        games MLB = new games("MLB The Show '18", "2018", 2);
    
        ArrayList<games> game = new ArrayList<>();

        game.add(Minecraft);
        game.add(GTA);
        game.add(PubG);
        game.add(Overwatch);
        game.add(Fortnite);
        game.add(LoL);
        game.add(RL);
        game.add(FC5);
        game.add(CoD);
        game.add(MLB);
        
                 
        String budget, resol, color, game1, game2, game3;
        int FPS;
        Scanner scnr = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the personal Computer Builder!");
        System.out.println("We will ask a few questions about specific computer components and based off your inputs, we will put together your ideal computer.");
        
        System.out.println("What is your desired budget? (low (500-1000), medium(1000,1500), high(1500 and up))");
        budget = scnr.nextLine();
        
        System.out.println("Pick three games from this list of 10 and press enter after each one:");
        System.out.println(game);
        game1 = scnr.nextLine();
        game2 = scnr.nextLine();
        game3 = scnr.nextLine();
        
        System.out.println("What FPS are you looking for? (please enter a number)");
        //attempted a try catch but then gave me an error saying that the variable FPS may not be initialized.
        //try{
            FPS = scan.nextInt();
        //}
        //catch(InputMismatchException e){
            //System.out.println("Please enter a number.");
       // }
                
        System.out.println("What resolution do you want? 1080p, 1440p, 2160p (4K)?");
        resol = scnr.nextLine();
        
        System.out.println("What is your desired color for your machine?");
        color = scnr.nextLine();
                
        System.out.println("Based off what you inputed, the recommended PC for you is: ");
        
        mobo am4 = new mobo("Gigabyte", "AB350 Gaming 3", "AM4", 100);
        cpu rz3 = new cpu("AMD", "Ryzen 3 1200", 3.1, 3.4, 4, 4, 65, "AM4", 100, am4, 1);
        gpu RadeonRx460 = new gpu("AMD", "Gigabyte", "RX 460", 1212, 7000, "4GB GDDR5", 350, false, 130, 1);
        powersupply Evga400W = new powersupply("EVGA", 400, 33);
        ram ripjawsv = new ram("G.Skill", "Ripjaws V", "DDR4", 8, 2400, false, 1.2, 2, 92, 1);
        storage ssd120 = new storage("ADATA", "Ultimate", 120, "SSD", 37);
        cases white = new cases("White", "NZXT", "S340", 75);
        
        
        //The program is able to run, and you can follow through the steps that the program asks, but produces an error at the end.
        //This was something we spent a long time trying to figure out but were not able to.
        build yourbuild = new build(rz3, RadeonRx460, Evga400W, ripjawsv, ssd120, white);
        yourbuild.decide(budget, FPS, resol, color);
        yourbuild.toString();
        yourbuild.test1();
        yourbuild.test2();
        //show the components that are in the PC
        
    }
    
}
