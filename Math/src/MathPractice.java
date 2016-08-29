import java.util.Scanner;

public class MathPractice
	{
		static int num, count, right;

		public static void main(String[] args)
			{
				System.out.println("Hello!");
				askQuestionNum();
				generateQuestions();
				generateMoreQuestions();

			}
		public static void askQuestionNum()
		{
			System.out.println("How many questions would you like to answer?");
			Scanner userInput=new Scanner(System.in);
			num=userInput.nextInt();
			System.out.println("I'll ask you " + num + " questions");
		}
		public static void generateQuestions()
			{
				count=1;
				System.out.println("Tell me what numbers the following code will generate inclusive.");
				while (count<=num)
					{
						int parameterL=(int)(Math.random()*10)+1;
						int parameterH=(int)(Math.random()*10)+1;
						System.out.println("int randomNumber=(int)(Math.random()*" + parameterL + ")+" + parameterH + ";");
						int lowest=parameterH;
						int highest=parameterL+parameterH;
						
						System.out.println("What is the lowest possible number this code can generate?");
						Scanner userInput=new Scanner(System.in);
						int ans1=userInput.nextInt();
						
						System.out.println("What is the highest possible number this code can generate?");
						Scanner userInput2=new Scanner(System.in);
						int ans2=userInput2.nextInt();
						
						if (ans1==lowest && ans2==highest)
							{
								System.out.println("Correct!");
								count++;
								right++;
							}
						else
							{
								System.out.println("Incorrect.");
								count++;
							}
					}
				double percent=(right/num);
				System.out.println("You got " + right + " out of " + num + ".");
			}
		public static void generateMoreQuestions()
		{
			askQuestionNum();
			count=1;
			right=0;
			while (count<=num)
				{
					int parameterL=(int)(Math.random()*10)+1;
					int parameterH=(int)(Math.random()*10)+1;
					System.out.println("Write a statement initializing an int called randomNumber that generates numbers between " + parameterL + " and " + parameterH);
					Scanner userInput=new Scanner(System.in);
					String ans=userInput.nextLine();
					
					int parameterHL=parameterH-parameterL;
					if (parameterHL<0)
						{
							parameterHL=parameterHL*-1;
						}
					
					String correct="int randomNumber=(int)(Math.random()*" + (parameterHL) + ")+" + parameterH + ";";
					if (ans.equals(correct))
						{
							System.out.println("Correct!");
							right++;
						}
					else
						{
							System.out.println("Nope. The correct answer was " + correct);
						}
					count++;
				}
			System.out.println("You got " + right + " out of " + num);
		}

	}
