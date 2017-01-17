package Assignment2;

import java.util.Scanner;

public class MealPackage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Meal Cost");
        double mealPrice = scan.nextDouble();
        System.out.println("Enter Percentage of Tip");
        int tipPercent = scan.nextInt();
        System.out.println("Enter Percentage of Tax");
        int taxPercent = scan.nextInt(); // taxPercent
        scan.close();

        
        double tipValue = mealPrice * ((double) tipPercent / 100);
        double taxValue = mealPrice * ((double) taxPercent / 100);
        double totalMealCost = mealPrice + tipValue + taxValue;
        
        int sumTotalCost = (int) totalMealCost;
        
        System.out.println("This is the final meal cost inclusive of tip and tax" + " " + sumTotalCost);

  }
}
