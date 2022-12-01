package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean isRes = false;
        double susBar = 0;
        double mana = 100;
        int friends = 10;
        int streak = 0;
        Scanner ansIn = new Scanner(System.in);

        System.out.println("Would you like to play as a:\na) Resident\nb) Witch\nReply with either 'a' or 'b'");
        if (ansIn.nextLine().equals("a"))
        {
            isRes = true;

            System.out.println("Welcome resident! Below are your current stats. As you answer questions wrong, your friend count will decrease and will protect your suspect % from going up.");
            System.out.println("You can manually use friends to decrease your suspect % as well or reset it to 0%. Your friend count has a 20% chance of increasing with each question right.");
            System.out.println("5 correct questions answered in a row will reward you with 2 friends.");
            System.out.println("If you get a question wrong with no friends left to back you up, your suspect percentage will automatically reach 99%.\n");
        printStats(susBar, friends);
        }
        else
        {
            System.out.println("Welcome witch! Below are your current stats. As you answer questions wrong, your mana % will decrease and will protect your suspect % from going up.");
            System.out.println("You can manually use mana to decrease your suspect % as well or reset it to 0%. Mana will be restored slowly as you answer questions right.");
            System.out.println("If your mana reaches under 50%, your suspect % will increase two times as fast as it normally would.");
            System.out.println("If you get a question wrong with no mana, your suspect percentage will automatically reach 99%.\n");
            printStats(susBar, mana);
            System.out.println("\n");
        }


        String rightAnswer = askQuestion(1);
        if (ansIn.nextLine().equals(rightAnswer)) //If answer is right
        {
            System.out.println("Right answer!");
            streak++;
            if (mana <= 99)
                mana++;
            if (streak == 5 && isRes && friends <= 8)
            {
                friends += 2;
                streak = 0;
                System.out.println("+2 friends for getting a 5 question streak! ");
            }
            else if (friends == 10 && isRes)
                System.out.println("Couldn't reward friends since you have the max number of friends (10). Streak is still valid.");

            if ((int)(Math.random()*100+1) <=20 && friends < 10)
            {
                friends++;
                System.out.println("Friend count has been increased by +1 because of your 20% perk.");
            }
        }
        else
        {
            friends  -= 2;
            mana -= 10;

            if (mana >= 50)
                susBar += 10;
            else
                susBar += 20;
        }

    }


        timesPrint = 0;

        System.out.print("Mana Bar: [");
        for (double i = mana - 10; i >= 0; i -= 10)
        {
            System.out.print("\t=");
            timesPrint++;
        }
        while (timesPrint < 10)
        {
            System.out.print("\t-");
            timesPrint++;
        }
        System.out.println("\t]\t" + mana + "% mana left.");
    }

    public static void printStats(double susBar, int friends)
    {
        int timesPrint = 0;

        System.out.print("Suspect Bar: [");
        for (int i = 10; i <= susBar; i += 10)
        {
            System.out.print("\t=");
            timesPrint++;
        }
        while (timesPrint < 10)
        {
            System.out.print("\t-");
            timesPrint++;
        }
        System.out.println("\t]\t" + susBar + "% filled.");

        timesPrint = 0;

        System.out.print("Friend Bar: [");
        for (int i = friends; i >= 0; i -= 1)
        {
            System.out.print("\t=");
            timesPrint++;
        }
        while (timesPrint < 10)
        {
            System.out.print("\t-");
            timesPrint++;
        }
        System.out.println("\t]\t" + friends + " friends are left with you.");
    }

    public static String askQuestion(int qNum)
    {
        switch (qNum)
        {
            case 1:
                System.out.println("Question 1:");
                System.out.println("Are you one with god?");
                System.out.println("a)\tHe is my savior.");
                System.out.println("b) I'm an atheist.");
                System.out.println("c)\tYes, I like to offer potions to Him.");
                return "a";

            case 2:
                System.out.println("");
                return "a";
        }
        return "a";
    }
}
