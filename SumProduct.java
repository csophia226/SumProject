//   SumProduct.java      Java Foundations
//   Solution to Programming Project 6.9

import javax.swing.JOptionPane;

public class SumProduct

   {
   public static void main (String args[])
   {
      String numString, result;
      int num1, num2, again;
      
      do
      {
      numString = JOptionPane.showInputDialog("Enter an integer: ");
      num1 = Integer.parseInt(numString);
      
      numString = JOptionPane.showInputDialog("Enter another integer: ");
      num2 = Integer.parseInt(numString);
      
      result = "Your entered " + num1 + " and " + num2;
      result += "\nThe sum of these numbers is "+ (num1 + num2);
      result += "\nThe product of these numbers is " + (num1 + num2);
      
      JOptionPane.showMessageDialog(null, result);
      
      again = JOptionPane.showConfirmDialog(null, "Another?");
      }
    while (again == JOptionPane.YES_OPTION);
   }
   }