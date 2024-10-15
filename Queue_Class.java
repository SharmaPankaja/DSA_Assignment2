package DSA_Assignment2;

public class Queue_Class {

	private int Q[], MaxSize, front1, rear1, front, rear, mid;

	public void create_Queue(int size) {

		mid = MaxSize / 2;
		front1 = front;
		rear1 = rear;

		front = mid + 1;
		rear = mid + 1;
		Q = new int[size];
		MaxSize = size;// init MaxSize front = 0;
	}

	void Enqueue1(int e) {
		rear++;
		Q[rear] = e;
		System.out.println("Element " + e + " Inserted in Queue");
	}

	void Enqueue2(int e) {
		rear1++;
		Q[rear1] = e;
		System.out.println("Element " + e + " Inserted in Queue");
	}

	boolean is_Full1() {
		if (rear == MaxSize - 1)
			return true;
		else
			return false;
	}

	boolean is_Full2() {
		if (rear1 == MaxSize - 1)
			return true;
		else
			return false;
	}

	int Dequeue1() {
		int temp = Q[front];
		front++;
		return (temp);
	}

	int Dequeue2() {
		int temp = Q[front1];
		front1++;
		return (temp);
	}

	boolean is_Empty1() {
		if (front > rear)
			return true;
		else
			return false;
	}

	boolean is_Empty2() {
		if (front1 > rear1)
			return true;
		else
			return false;
	}

	void print_Queue1() {// lifo print System.out.println("Queue has");
		for (int i = front; i <= rear; i++) {
			System.out.print(Q[i] + "--");
		}
	}

	void print_Queue2() {// lifo print System.out.println("Queue has");
		for (int i = front1; i <= rear1; i++) {
			System.out.print(Q[i] + "--");
		}
	}
	
}
