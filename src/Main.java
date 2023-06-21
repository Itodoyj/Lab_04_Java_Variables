// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String[] args) {
            // Creating and initializing integers
            int varA = 10;
            int varB = 12;
            int varC = 8;
            int varD = 16;

            // Creating and initializing real numbers (doubles)
            double varA2 = 3.14;
            double varB2 = 2.5;
            double varC2 = 6.5;
            double varD2 = 9.99;

            // Printing the values
            System.out.println("Integer numbers:");
            System.out.println("Int1: " + varA);
            System.out.println("Int2: " + varB);
            System.out.println("Int3: " + varC);
            System.out.println("Int4: " + varD);

            System.out.println("\nReal numbers:");
            System.out.println("Double1: " + varA2);
            System.out.println("Double2: " + varB2);
            System.out.println("Double3: " + varC2);
            System.out.println("Double4: " + varD2);

            //Perform addition, subtraction, division and multiplication
            // Addition
            int sumint = varA + varB + varC + varD;
            System.out.println("\nSum for integers: " + sumint);
            double sumreal = varA2 + varB2 + varC2 + varD2;
            System.out.println("Sum for double values: " + sumreal);

            // Subtraction
            int differenceint = varB - varA;
            System.out.println("\nDifference for integers: " + differenceint);
            double differencereal = varD2 - varC2;
            System.out.println("Difference for double values: " + differencereal);

            // Multiplication
            int productint = varA * varB * varC;
            System.out.println("\nProduct for Integers: " + productint);
            double productreal = varA * varB * varC;
            System.out.println("Product for double values: " + productreal);

            // Division
            int quotientint = varD/varC;
            System.out.println("\nDivision for integers: " + quotientint);
            double quotientreal = varD2/varA2;
            System.out.println("Division for double values: " + quotientreal);

        }
    }