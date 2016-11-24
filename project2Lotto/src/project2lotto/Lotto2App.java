/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2lotto;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author Camelia Farcas, Conor Clarke, Sana Diwan, Daniel Pasinski.
 */
public class Lotto2App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lotto2GUI GUI = new Lotto2GUI();
        GUI.setVisible(true);
        Lotto2 L2 = new Lotto2();
        LottoGUI LG = new LottoGUI();
        //declare var
        /*String name;
        int userGuess[];
        int lottoNum[];
        int plus1[];
        int plus2[];
        int winNum;
        int winNum1;
        int winNum2;

        //declare & create object
        Lotto2 l;
        l = new Lotto2();

        userGuess = new int[5];
        lottoNum = new int[5];
        plus1 = new int[5];
        plus2 = new int[5];
        winNum = 0;
        winNum1 = 0;
        winNum2 = 0;
        name = " ";

        name = JOptionPane.showInputDialog(null, "Please choose your game: Lotto or Plus 1 or Plus 2");
        l.setName(name);

        lottoNum = l.getLottoNum();
        System.out.println("The winning lotto numbers are: ");
        System.out.println(Arrays.toString(lottoNum)); //Prints out our lotto Numbers

        plus1 = l.getPlus1();
        System.out.println("The lotto plus 1 numbers are: ");
        System.out.println(Arrays.toString(plus1)); //Prints out our lotto plus1 Numbers

        plus2 = l.getPlus2();
        System.out.println("The lotto plus 2 numbers are: ");
        System.out.println(Arrays.toString(plus2)); //Prints out our lotto plus2 Numbers


        l.compute();
        
        //Showing Input depending on chosen game
        while (true) {
            if (name.equalsIgnoreCase("Lotto")) {
                for (int i = 0; i < 5; i++) {
                    userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your five lotto numbers"));
                }
                l.setUserGuess(userGuess);
                l.compute();
                 JOptionPane.showMessageDialog(null, "You have guessed " + l.getWinNum() + " numbers from the Lotto draw");
                break;
                
            } else if (name.equalsIgnoreCase("Plus 1")) {
                for (int i = 0; i < 5; i++) {
                    userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your five lotto numbers"));
                }
                l.setUserGuess(userGuess);
                l.compute();
                 JOptionPane.showMessageDialog(null, "You have guessed " + l.getWinNum() + " nubers from the  Lotto draw" + "\nYou have guessed " + l.getWinNum1() + " numbers from the Plus 1 draw");
                break;
                
            } else if (name.equalsIgnoreCase("Plus 2")) {
                for (int i = 0; i < 5; i++) {
                    userGuess[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your five lotto numbers"));
                }
                l.setUserGuess(userGuess);
                l.compute();           
                JOptionPane.showMessageDialog(null, "You have guessed " + l.getWinNum() + " numbers from the Lotto draw" + "\nYou have guessed " + l.getWinNum1() + " numbers from the Plus 1 draw" + "\nYou have guessed " + l.getWinNum2() + " numbers from the Plus 2 draw");
                break;
                
            } else {
                System.out.println("Sorry there was an error.");
            }
        }*/
    }

}
