class Marks
{
	public static void main(String args[])
	{
		int marks=80;
		if(marks<40)
		{
			System.out.println("Student Failed");
		}
		else if(marks>=40 && marks<=60)
		{
			System.out.println("Grade D");
		}
		else if(marks>=61 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>=71 && marks<=80)
		{
		System.out.println("Grade B");		
		}
		else if(marks>=81&& marks<=80)
		{
		System.out.println("Grade A");	
		}
		else
		{
		System.out.println("Error");
		}
		
	}
}