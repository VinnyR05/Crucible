package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input;
        int rand = (int)(Math.random()*100+1);
        boolean lied = false;
        boolean questionLied = false;
        double susBar = 0;
        int truth = 0;
        int smallLie = 0;
        int largeLie = 0;
        int totalScore = 0;

        Questions q1 = new Questions("So, first of all, where were you last night?",
                "I was at home, alone, eating my dinner.",
                "I was at Bob's house last night.",
                "I was out chopping wood for the fireplace.",
                "*Spectator stands up*: Hey! All the lights were off at your house. (Others nod in agreement).",
                "*Spectator stands up*: That's a lie! Bob was at our place last night!",
                "Prosecutor: That is EXACTLY what a follower of a devil would say to mask his conjuring in the woods!");

        Questions q2 = new Questions("Were you alone?",
                "Yes.",
                "Yes, but I told a few friends that I'd be alone tonight.",
                "No, I was with my friend.",
                "*Spectator stands up*: Doesn't that just make you more suspicious?!",
                "*Spectator stands up*: That's a lie! You don't have any friends except John, my husband!",
                "Prosecutor: You can't prove that, can you? Please note this down your honor.");

        Questions q3 = new Questions("How much are you involved with God?",
                "I respect God, but I am not able to come to the church a lot.",
                "I respect him and he is my saviour.",
                "He is my one and only and I am only living due to his grace!",
                "Prosecutor: Why not? Are you scared of being exposed of your true nature, WITCH?",
                "*Spectator stands up*: We don't see you at church a lot, do we? (Others murmur and nod in agreement)",
                "Prosecutor: Yes? Okay then, please summarize what today's sermon was about. You can't, can you?");

        Questions q4 = new Questions("Do you fear of being cleansed by Him?",
                "A bit sir.",
                "Not really, but it still is a bit scary.",
                "Not at all!",
                "Prosecutor: Why? You think the church would expose you?",
                "Prosecutor: Why? You think the church would expose you?",
                "Prosecutor: If not, why didn't you cleanse yourself before appearing in the trials?");

        Questions q5 = new Questions("Many other residents have claimed to hear screeching from your house at night. How can you explain that?",
                " I have stomach aches.",
                "My hands hurt during the night due to the day's work.",
                "My whole body aches during the night.",
                "Town Doctor: I didn't see you at my clinic at all though!",
                "Prosecutor: Looks like your hands get burned and red from stirring potions for too long.",
                "Prosecutor: Does the devil punish you himself? Or does it hurt as God's punishment for your wicked deeds?");

        Questions q6 = new Questions("Many residents have also claimed that they have seen blood on your shorts sometimes during the day. Why would they say so?",
                "My hands crack and bleed if I work too hard. I just wipe my hands on my trousers.",
                "I get nosebleeds a lot.",
                "It's just red paint.",
                "Town Doctor: I didn't see you at my clinic at all though! How were you treating your hands without proper medical equipment?",
                "Prosecutor: Nonsense! How would blood get on your trousers if your nose was bleeding?",
                "Prosecutor: And where did you get this everlasting paint?");

        Questions q7 = new Questions("Why do you sometimes sneak out into the woods at night?",
                "I don't go to the woods at all.",
                "I pick some wood for the fire, nothing much.",
                "I like the trees and the darkness. They make me feel happy.",
                "Prosecutor: Nonsense! Many residents have claimed to see you go at night!",
                "Prosecutor: What for? Special magic potions?",
                "Prosecutor: Exactly what a witch and a follower of the Devil would say!");

        Questions q8 = new Questions("Is it true that you are having an affair with one of the women in this town?",
                "Yes, but it hasn't been going on for a long time.",
                "No sir, the woman in question just asks me for advice.",
                "Not at all. I never dare to lay an eye on another woman other than my wife.",
                "Prosecutor: Have you given her a love potion? Is she in a trance?",
                "Prosecutor: The mistress has spoken already. She clearly says that you were having an affair with her.",
                "Prosecutor: Nonsense! The woman confessed that you were having an affair with her.");

        System.out.println(rand);

        showHelp(susBar);

        System.out.println("Please enter your name below to continue");
        String userName = in.nextLine();

        System.out.println("ORDER, ORDER, ORDER! The court is now in session.");
        System.out.println("Here stands " + userName + ", who is convicted of using witchcraft.");
        System.out.println("The prosecution will now ask the defendant questions to make this case valid. Please proceed.\n\n");

        //------------------------------------------------------------------------------------------------------------------------------------------------------
        q1.printQuestionNOptions();
        input = in.nextLine();
        questionLied = didLie(q1, input, rand, susBar);
        while (input.equalsIgnoreCase("d"))
        {
            showHelp(susBar);
            q1.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
        }
        if (input.equalsIgnoreCase("a"))
            truth++;
        else if (input.equalsIgnoreCase("b"))
            smallLie++;
        else if (input.equalsIgnoreCase("c"))
            largeLie++;
        if (questionLied)
            lied = true;
        susBar += increaseSus(questionLied, input, rand);
        questionLied = false;
        rand = (int)(Math.random()*100+1);
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        q2.printQuestionNOptions();
        input = in.nextLine();
        questionLied = didLie(q2, input, rand, susBar);
        while (input.equalsIgnoreCase("d"))
        {
            showHelp(susBar);
            q2.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q2, input, rand, susBar);
        }
        if (input.equalsIgnoreCase("a"))
            truth++;
        else if (input.equalsIgnoreCase("b"))
            smallLie++;
        else if (input.equalsIgnoreCase("c"))
            largeLie++;
        if (questionLied)
            lied = true;
        susBar += increaseSus(questionLied, input, rand);
        questionLied = false;
        rand = (int)(Math.random()*100+1);
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        q3.printQuestionNOptions();
        input = in.nextLine();
        questionLied = didLie(q1, input, rand, susBar);
        while (input.equalsIgnoreCase("d"))
        {
            showHelp(susBar);
            q3.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q3, input, rand, susBar);
        }
        if (input.equalsIgnoreCase("a"))
            truth++;
        else if (input.equalsIgnoreCase("b"))
            smallLie++;
        else if (input.equalsIgnoreCase("c"))
            largeLie++;
        if (questionLied)
            lied = true;
        susBar += increaseSus(questionLied, input, rand);
        questionLied = false;
        rand = (int)(Math.random()*100+1);
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        if (susBar <= 100)
        {
            q4.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
            while (input.equalsIgnoreCase("d"))
            {
                showHelp(susBar);
                q4.printQuestionNOptions();
                input = in.nextLine();
                questionLied = didLie(q4, input, rand, susBar);
            }
            if (input.equalsIgnoreCase("a"))
                truth++;
            else if (input.equalsIgnoreCase("b"))
                smallLie++;
            else if (input.equalsIgnoreCase("c"))
                largeLie++;
            if (questionLied)
                lied = true;
            susBar += increaseSus(questionLied, input, rand);
            questionLied = false;
            rand = (int)(Math.random()*100+1);
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        if (susBar <= 100)
        {
            q5.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
            while (input.equalsIgnoreCase("d"))
            {
                showHelp(susBar);
                q5.printQuestionNOptions();
                input = in.nextLine();
                questionLied = didLie(q5, input, rand, susBar);
            }
            if (input.equalsIgnoreCase("a"))
                truth++;
            else if (input.equalsIgnoreCase("b"))
                smallLie++;
            else if (input.equalsIgnoreCase("c"))
                largeLie++;
            if (questionLied)
                lied = true;
            susBar += increaseSus(questionLied, input, rand);
            questionLied = false;
            rand = (int)(Math.random()*100+1);
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        if (susBar <= 100)
        {
            q6.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
            while (input.equalsIgnoreCase("d"))
            {
                showHelp(susBar);
                q6.printQuestionNOptions();
                input = in.nextLine();
                questionLied = didLie(q6, input, rand, susBar);
            }
            if (input.equalsIgnoreCase("a"))
                truth++;
            else if (input.equalsIgnoreCase("b"))
                smallLie++;
            else if (input.equalsIgnoreCase("c"))
                largeLie++;
            if (questionLied)
                lied = true;
            susBar += increaseSus(questionLied, input, rand);
            questionLied = false;
            rand = (int)(Math.random()*100+1);
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        if (susBar <= 100)
        {
            q7.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
            while (input.equalsIgnoreCase("d"))
            {
                showHelp(susBar);
                q7.printQuestionNOptions();
                input = in.nextLine();
                questionLied = didLie(q7, input, rand, susBar);
            }
            if (input.equalsIgnoreCase("a"))
                truth++;
            else if (input.equalsIgnoreCase("b"))
                smallLie++;
            else if (input.equalsIgnoreCase("c"))
                largeLie++;
            if (questionLied)
                lied = true;
            susBar += increaseSus(questionLied, input, rand);
            questionLied = false;
            rand = (int)(Math.random()*100+1);
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        if (susBar <= 100)
        {
            q8.printQuestionNOptions();
            input = in.nextLine();
            questionLied = didLie(q1, input, rand, susBar);
            while (input.equalsIgnoreCase("d"))
            {
                showHelp(susBar);
                q8.printQuestionNOptions();
                input = in.nextLine();
                questionLied = didLie(q8, input, rand, susBar);
            }
            if (input.equalsIgnoreCase("a"))
                truth++;
            else if (input.equalsIgnoreCase("b"))
                smallLie++;
            else if (input.equalsIgnoreCase("c"))
                largeLie++;
            if (questionLied)
                lied = true;
            susBar += increaseSus(questionLied, input, rand);
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------------

        if (susBar >= 100)
        {
            if (lied == true)
            {
                System.out.println("Game Over: Suspect bar has reached 100%. You have been hanged.");
            }
            else
                System.out.println("Winner! Even though you have been hanged, you stuck to your morals and values and didn't lie. YOU WIN!");

            System.out.println("You have told:");
            System.out.println(truth + " truths.");
            System.out.println(smallLie + " small lies.");
            System.out.println(largeLie + " large lies.");
            System.out.println("As a reward for not telling lies, you have been given 1000 extra points. Good game!");
            totalScore = (truth * 100 + (smallLie * 50) + (largeLie * 200)) + 1000;
            System.out.println("Your total score comes out to be: " + totalScore);
        }
        else
        {
            System.out.println("Winner! You have passed the trial and you have not been hanged.");
            System.out.println("You have told:");
            System.out.println(truth + " truths.");
            System.out.println(smallLie + " small lies.");
            System.out.println(largeLie + " large lies.");
            totalScore = ((truth * 100) + (smallLie * 50) + (largeLie * 200)) + 500;
            if (lied == false)
            {
                totalScore += 1000;
                System.out.println("You stayed and followed your morals and did not tell a lie. For this, you have been given 1000 extra points. Good game!");
            }
            System.out.println("Your total score comes out to be: " + totalScore);
        }

    }

    public static void printStats(double susBar)
    {
        int timesPrint = 0;

        System.out.print("\nSuspect Bar: [");
        for (int i = 10; i <= susBar; i += 10) {
            System.out.print("\t=");
            timesPrint++;
        }
        while (timesPrint < 10) {
            System.out.print("\t-");
            timesPrint++;
        }
        System.out.println("\t]\t" + susBar + "% filled.\n");
    }

    public static void showHelp(double susBar)
    {
        System.out.println("Welcome to The Game of Trials!");
        System.out.println("You are a normal citizen in Salem village. You have been dragged into court with a suspicion of being a witch.");
        System.out.println("Your goal is to answer all the questions either truthfully, or by lying, without filling your suspect bar.\n");
        printStats(susBar);
        System.out.println("\nAnswering a question truthfully will give you 100 points. (20% risk of increasing suspect bar by 10%)");
        System.out.println("Answering a question with a small lie will give you 50 points. (10% risk of increasing suspect bar by 10%)");
        System.out.println("Answering a question with a large lie will give you 200 points. (60% risk of increasing suspect bar by 30%)");
        System.out.println("If you successfully win the game without your suspect bar reaching 100%, you will be rewarded with 500 extra points.");
        System.out.println("You can earn a bonus 1000 points by doing a secret challenge. No, I'm not telling you the challenge :)\n");
        System.out.println("You can always print this help guide again by answering \"d\" for a question.\n");
    }

    public static boolean didLie(Questions question, String input, int rand, double susBar)
    {
        boolean questionLied = false;

        if (input.equalsIgnoreCase("a"))
        {
            if (rand <= 20)
            {
                System.out.println(question.opt1Caught);
                susBar += 10;
            }
            else
                System.out.println(question.pass);
        }
        else if(input.equalsIgnoreCase("b"))
        {
            questionLied = true;
            if (rand <=10)
            {
                System.out.println(question.opt2Caught);
                susBar += 10;
            }
            else
                System.out.println(question.pass);
        }
        else if(input.equalsIgnoreCase("c"))
        {
            questionLied = true;
            if (rand <= 60)
            {
                System.out.println(question.opt3Caught);
                susBar += 30;
            }
            else
                System.out.println(question.pass);
        }
        else
        {
            showHelp(susBar);

        }
        printStats(susBar);

        return questionLied;
    }

    public static double increaseSus(boolean questionLied, String input, int rand)
    {
        if (input.equalsIgnoreCase("b") && rand <= 10)
            return 10;
        else if(input.equalsIgnoreCase("c") && rand <= 60)
            return 30;
        else if(rand <= 20 && !questionLied)
            return 10;
        else
            return 0;
    }

}

class Questions
{
    public String question;
    public String opt1;
    public String opt2;
    public String opt3;
    public String opt1Caught;
    public String opt2Caught;
    public String opt3Caught;
    public String pass = "Okay, since no one has an objection, on to the next question then!";

    public Questions(String questionIn,
                     String opt1In,
                     String opt2In,
                     String opt3In,
                     String opt1CaughtIn,
                     String opt2CaughtIn,
                     String opt3CaughtIn)
    {
        question = questionIn;
        opt1 = opt1In;
        opt2 = opt2In;
        opt3 = opt3In;
        opt1Caught = opt1CaughtIn;
        opt2Caught = opt2CaughtIn;
        opt3Caught = opt3CaughtIn;
    }
    public void printQuestionNOptions()
    {
        System.out.println("Question: " + question);
        System.out.println("Available options:");
        System.out.println("a) " + opt1 + " (Risky Truth)");
        System.out.println("b) " + opt2 + " (Small Lie)");
        System.out.println("c) " + opt3 + "(Large Lie)");
        System.out.println("d) Display help menu again.");
    }
}