package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner INPUT = new Scanner(System.in);
	    int roomNumber = 1;
	    if (roomNumber == 1){
	        roomNumber = cottage();
	    }
        if (roomNumber == 2){
            roomNumber = forest();
        }
        if (roomNumber == 3) {
            roomNumber = treetops();
        }
        if (roomNumber == 4){
            roomNumber = clearing();
        }
        if (roomNumber == 5){
            cave();
        }
    }
    public static int cottage(){
        Scanner INPUT = new Scanner(System.in);
        boolean hasSword = false;
        String[] options = {"Open chest", "Look out the window", "Open vent", "Bed"};
        int roomNumber = 1;
        System.out.println("You wake up in a room. You see a chest, a window, a vent, and a bed.");
        while (roomNumber == 1) {
            System.out.println("What would you like to do?");
            System.out.println(options[0] + "\n" + options[1] + "\n" + options[2] + "\n" + options[3]);
            String userChoice = INPUT.nextLine();
            if (stringParse(options[0], userChoice)) {
                System.out.println("You open the chest. Inside is an old broken sword, but you can tell it was once grand.");
                hasSword = true;
            }
            if (stringParse(options[1], userChoice)) {
                System.out.println("You look out the window and see a beautiful forest, if only you could get out somehow.");
            }
            if (stringParse(options[2], userChoice)) {
                System.out.println("Looking at the vent more closely it looks like you could get outside, well if you had something to unscrew the screws.");
            }
            if (stringParse(options[2], userChoice) && hasSword) {
                System.out.println("Using the sword as a screwdriver you open the vent. Its tight but you crawl out.");
                roomNumber = 2;
            }
            if (stringParse(options[3], userChoice)) {
                System.out.println("The bed look comfortable, so you decide to go to sleep.");
            }
        }
        return roomNumber;
    }
    public static int forest(){}
    public static int treetops(){}
    public static int clearing(){}
    public static int cave(){}
    public static boolean stringParse (String phrase, String key) {
        // loop through the letters of phrase
        for (int i = 0; i < phrase.length(); i++) {
            boolean foundIt = true;
            // loop through the letters of key
            for (int j = 0; j < key.length(); j++) {
                // check if the letters are the same
                if (phrase.toLowerCase().charAt(i+j) == key.toLowerCase().charAt(j) ) {
                }
                else {
                    // if they are different break the loop
                    foundIt = false;
                    break;
                }
                // end loop
            }
            // if you didn't break return true
            if (foundIt) {
                return true;
            }
            //end loop
        }
        //if you are here return false
        return false;
    }
}