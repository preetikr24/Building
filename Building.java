import java.util.Scanner;

class Building 
{
	static void tower_Construction(int n ,char floor_one, char floor_max, char temp)
	{
		if (n==0)
		{
			return;
			
		}
		
		tower_Construction(n-1, floor_one , temp , floor_max);
		System.out.println();
		System.out.println ("The floor size given at first_day: "+n);
		System.out.println ("The floor size given at second_day: "+floor_one);
		System.out.println ("The floor size given at third_day: "+floor_max);
		System.out.println ("The order of Construction is : \n");
		System.out.println (floor_one+" to "+floor_max);
		tower_Construction(n-1 , temp ,floor_max, floor_one);
	
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of floors in the building: ");
		n = sc.nextInt();
		tower_Construction (n, 'A' , 'B' , 'C');
		
		
	}
}
