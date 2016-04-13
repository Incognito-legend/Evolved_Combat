// import java.util.Random;
// import java.util.Scanner;
// import javax.swing.JOptionPane;
// import java.util.*;
// 
// public class GuessingGameGUI
// {
// 
//     public static void main(String[] args) {
//         Random rand = new Random();
//         int value = rand.nextInt(32) + 1;
//         int guesses = 0, LowGuess = 0, HighGuess = 0; //ADDED LowGuess AND HighGuess
//         Scanner input = new Scanner(System.in);
//         int guess;
//         boolean win = false;
//         while (win == false) {
//             JOptionPane.showInputDialog("Guess a number between 1 and 32: ");
//             guess = input.nextInt();
//             guesses++;
//             if (guess == value) {
//                 win = true;
//             } else if (guess < value) {
//                 JOptionPane.showInputDialog("Your guess is lower than random number");
//                 LowGuess++; //COUNTER TO KEEP TRACK OF LOW GUESSES
//             } else if (guess > value) {
//                 JOptionPane.showInputDialog("Your guess is higher than random number");
//                 HighGuess++; //COUNTER TO KEEP TRACK OF HIGH GUESSES
//             }
//         }
//         JOptionPane.showMessageDialog(null, "You win! You are the worst guesser in history!");
//         JOptionPane.showMessageDialog(null, "The number was: " + value);
// 
//             // ADDED FROM HERE (GUESSES)
//         JOptionPane.showMessageDialog(null, "Number of Guesses:" + guesses);
//         for (int x = 1; x <= guesses; x++) {
//             for (int a = 1; a <= guesses; a++) {
//                 if (a == guesses) {
//                     JOptionPane.showMessageDialog(null, "*");
//                 }
//             }
//         } // TO HERE FOR AMOUNT OF GUESSES
// 
//             // I ADDED FROM HERE (LOW)
//         JOptionPane.showMessageDialog(null, "Smaller Guesses:" + LowGuess);
//         for (int Low_i = 1; Low_i <= LowGuess; Low_i++) {
//             for (int Low_e = 1; Low_e <= LowGuess; Low_e++) {
//                 if (Low_e == LowGuess) {
//                     JOptionPane.showMessageDialog(null, "*");
//                 }
//             }
//         } // Then TO HERE FOR LOW
// 
//             // I ADDED FROM HERE (HIGH)
//         JOptionPane.showMessageDialog(null, "Largest Guesses:" + HighGuess);
//         for (int High_i = 1; High_i <= HighGuess; High_i++) {
//             for (int High_e = 1; High_e <= HighGuess; High_e++) {
//                 if (High_e == HighGuess) {
//                     JOptionPane.showMessageDialog(null, "*");
//                 }
//             }
//         } //FINALLY TO HERE FOR HIGH
//     }
// }