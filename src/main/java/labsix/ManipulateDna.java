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
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    // Step Two: Compute the complement of the DNA String
    compDna = dna.replace('A', 't');
    compDna = compDna.replace('T', 'a');
    compDna = compDna.replace('G', 'c');
    compDna = compDna.replace('C', 'g');
    compDna = compDna.toUpperCase();
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random rando = new Random();
    String mut1 = "" + compDna.charAt(rando.nextChar(compDna.length()));
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int del = rando.nextInt(compDna.length());
    String mut2 = "" + compDna.substring(0, del - 1)
        + compDna.substring(del + 1, compDna.length();
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message

  }

}
