package DSA_Assignment2;

import java.util.Scanner;

public class Queue_Class_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,e;
		Scanner in = new Scanner(System.in);
		Queue_Class obj = new Queue_Class();
		System.out.println("Enter size of queue : ");
		int size = in.nextInt();
		obj.create_Queue(size);

		do {
			System.out.println("Queue Menu..");
			System.out.println("--------------------------");
			System.out.println("1.Enqueue");
			System.out.println("2.Enqueue1");
			System.out.println("3.Dequeue");
			System.out.println("4.Dequeue1");
			System.out.println("5.Print all elements of queue");
			System.out.println("6.Print all elements of queue1");
			System.out.println("0.Exit");
			System.out.println("--------------------------");
			System.out.println("Choice : ");
			ch = in.nextInt();
			
			switch(ch)
			{
			case 1: 
				if(obj.is_Full1()!=true)
				{
					System.out.println("Enter a number for queue 1.. : ");
					e = in.nextInt();
					obj.Enqueue1(e);
				}
				else
					System.out.println("Queue 1 is empty..");
				break;
			case 2: 
				if(obj.is_Full2()!=true)
				{
					System.out.println("Enter a number for queue 2.. : ");
					e = in.nextInt();
					obj.Enqueue2(e);
				}
				else
					System.out.println("Queue 2 is empty..");
				break;
			case 3:
				if(obj.is_Empty1()!=true)
				{
					System.out.println("Remove/Dequeue an element.. : ");
					System.out.println(obj.Dequeue1());
				}
				else
					System.out.println("Queue 1 is empty..");
				break;
				
			case 4:
				if(obj.is_Empty2()!=true)
				{
					System.out.println("Remove/Dequeue an element.. : ");
					System.out.println(obj.Dequeue2());
				}
				else
					System.out.println("Queue 2 is empty..");
				break;
		
			case 5:
				if(obj.is_Empty1()!=true)
				{
					System.out.println("Printing queue elements...");
					obj.print_Queue1();
				}
				else
					System.out.println("Queue is empty..");
				break;
				
			case 6:
				if(obj.is_Empty2()!=true)
				{
					System.out.println("Printing queue elements...");
					obj.print_Queue2();
				}
				else
					System.out.println("Queue is empty..");
				break;
				
				
			case 0:
				System.out.println("Thank...");
				break;
			default:
				System.out.println("Check entrered choice....");
			}
		}while(ch!=0);
	

	}

}
