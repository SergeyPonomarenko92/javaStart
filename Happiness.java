import  java.util.Random;
import  java.util.Scanner;
public class Happiness {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner enter = new Scanner(System.in);

    int Happiness, Luck, Wealth, Health, Intelligence, Age;
    Happiness = 0;
    Luck = 0;
    Wealth= 0;
    Health = 0;
    Intelligence = 0;
        System.out.println("Please enter your age");
        Age =  enter.nextInt();

        while(Age < 100){
            Happiness += random.nextInt(100);
            Luck += random.nextInt(100);
            Wealth += random.nextInt(100);
            Health += random.nextInt(100);
            Intelligence += random.nextInt(100);
            ++Age;
            System.out.println("In your " + Age + " years, your a very good");
            System.out.println("You Happiness level is " + Happiness + " !!!");
            System.out.println("You Luck percent bar is " + Luck + "% !!!");
            System.out.println("You wealth level is " + Wealth + " !!!");
            System.out.println("You Intelligence level is " + Intelligence + " of 100 !!!" );
        }
    }
}
