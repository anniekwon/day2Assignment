import java.util.Random;

/*
Lotto Picker: Generate random number 0 - 30
and print out 5 distinct numbers

1. figure out how to generate a random number
2. repeat step 1 five times
3. we need to store the results of step 2.
4. we need to find a way to print the results that were stored along the way

casing - what are the capital
PascalCase - where the first letter and every first letter of every new word is capitalized
camelCase - where the first letter of first word is lower case. but every other word is capitalized.
 */
public class LottoPicker {
    public static void main(String[] args) {
        String nameOfIt = "Application starting...";
        System.out.println(nameOfIt);

        //double randomNumber = Math.random();
        //System.out.println(randomNumber);

        Random random = new Random();

        int numberOfNumbersGenerate = 0;
        int total = 5;

        int[] numberStored;

        //numberOfNumbersGenerate < total
        //needs to be a statement that evaluate to true or false
        while(numberOfNumbersGenerate < total) {
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberStored[] = numberOfNumbersGenerate;
            numberOfNumbersGenerate = numberOfNumbersGenerate + 1;
        };

        System.out.println(numberStored[0]);


        /*
        Programming is the combination of iteratives and conditions
            Iteratives - repeating a process over and over
            Conditional - checking a condition (true or false) to decide what to do or if i should keep doing something

        Control Flow - Different types of statements that affect the flow of the program
            Iterative - loops;
                while loop - while a condition is true, keep executing
                do while loop - similar to while loop, guaranteed to run once

            Condition -
                if - checks if a conditon is true, if it is it will execute once
                else -
        */



    }
}
