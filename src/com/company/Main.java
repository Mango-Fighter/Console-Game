package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner INPUT = new Scanner(System.in);
	int roomNumber = 1;
	if (roomNumber == 1){cottage()}

    }
    public static int cottage(){
        Scanner INPUT = new Scanner(System.in);
        boolean hasSword = false;
        String[] options = {"Open chest", "Look out the window", "Open vent", "Bed"};
        while (roomNumber == 1)
        System.out.println("You wake up in a cabin. You see a window, a chest, a bed, and a vent. However you don't see a door. What would you like to do?");
        System.out.println(options[0] + "\n" + options[1] + "\n" + options[2] + "\n" + options[3]);
        String userChoice = INPUT.nextLine();
        if (stringParse(userChoice, options[0])) {
            System.out.println("You open the chest. Inside is an old broken sword, but you can tell it was once grand.");
            hasSword = true;
        }
        if (stringParse(userChoice,options[1])) {
            System.out.println("You look out the window and see a beautiful forest, if only you could get out somehow.");
        }
        if (stringParse(userChoice,options[2])){
            System.out.println("Looking at the vent more closely it looks like you could get outside, well if you had something to unscrew the screws.");
        }
        if (stringParse(userChoice, options[2]) && hasSword) {
            System.out.println("Using the sword as a screwdriver you open the vent. Its tight but you crawl out.");
        }
        if (stringParse(userChoice,options[3])){
            System.out.println("The bed look comfortable, so you decide to go to sleep.");
        }
    }
    public static boolean stringParse (String phrase, String key) {
        // loop through the letters of phrase
        for (int i = 0; i < phrase.length(); i++) {
            boolean foundIt = true;
            // loop through the letters of key
            for (int j = 0; j < key.length(); j++) {
                // check if the letters are the same
                if (phrase.charAt(i+j) == key.charAt(j) ) {
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