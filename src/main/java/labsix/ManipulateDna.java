package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This class does mutates input DNA.
 *  The first line displays the name of the programmer and the date.  There is
 *  DNA input by the user that leads to the generation of the complements, then
 *  mutations occur.
 *
 *<p>Bugs:  This program won't have bugs if all goes well.
 */

public class ManipulateDna {


  /** The main entry point for ManipulateDna.
   *  The source code inside of this method will be executed when you run the
   *  program in the command-line.  The output will appear in the user's
   *  terminal window.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Jordan Durci " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    String fullDna = "ACTG";
    int fullLength = fullDna.length();
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    String dnaUp = dna.toUpperCase();
    System.out.println("Original DNA String:  " + dnaUp);
    // Step Two: Compute the complement of the DNA String
    String dnaComp = dnaUp.replace('A', 't');
    String dnaComp2 = dnaComp.replace('T', 'a');
    String dnaComp3 = dnaComp2.replace('G', 'c');
    String dnaComp4 = dnaComp3.replace('C', 'g');
    String dnaCompFin = dnaComp4.toUpperCase();
    System.out.println("Complement DNA String:  " + dnaCompFin);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random rando = new Random();
    String mut1 = "" + dnaCompFin.substring(0,2)
        + fullDna.charAt(rando.nextInt(fullLength))
        + dnaCompFin.substring(2, dnaCompFin.length());
    System.out.println("Insertion mutation:  " + mut1);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int loc1 = rando.nextInt(dnaCompFin.length()); // Picks a random location
    String mut2 = "" + dnaCompFin.substring(0, loc1)
        + dnaCompFin.substring(loc1 + 1, dnaCompFin.length());
    System.out.println("Random deletion mutation:  " + mut2);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int loc2 = rando.nextInt(dnaCompFin.length()); // Picks a random location
    String mut3 = "" + dnaCompFin.substring(0,loc2)
        + fullDna.charAt(rando.nextInt(fullLength))//error
        + dnaCompFin.substring(loc2,dnaCompFin.length());
    System.out.println("Random insertion mutation:  " + mut3);
    // Step Six: Display a final thank you message
    System.out.println("Merci beaucoup, monsieur, mademoiselle, madame,"
        + " ou autre!");
  }
}
