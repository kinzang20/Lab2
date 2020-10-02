//Creating class
public class Queue{
	int[] arr;
	int rear;
	int len;
	int front;
	int first;

	//constructor
	public Queue(int x){
		len = 0;
		rear = -1;
		front = -1;
		first = -1;
		arr = new int[x];
	}

	//checking array is empty or not
	public boolean isEmpty(){
		if (len == 0) {
			return true;	
		}
		return false;

	}
	//size of the array
	public int len(){
		return len;
	}

	//value that is at the front of the queue
	public int first(){
		if (isEmpty()) {
			return 0;	
		}
		else
		{
			return arr[front];
		}
	}

	//adding values
	public void enqueue(int x){
		if (isEmpty()) {
			arr[0] = x;
			front = 0;
			rear = 0;
			first = arr[0];
		}
		else
		{
			arr[rear + 1] = x;
			rear = rear + 1;
		}
		len = len + 1;
	}

	//removing values
	public int dequeue(){
		if (isEmpty()) {
			return 0;
		}
		else
		{
			front = front + 1; 
		}
		len = len - 1;
		return arr[front-1];
	}
	//main method
	public static void main(String[] args) {		
        Queue s = new Queue(8); //object declaration
        s.enqueue(109);
        s.enqueue(20);
        s.enqueue(300);
        s.enqueue(112);
    
        System.out.println(s.isEmpty());
        System.out.println(s.len());
        System.out.println(s.first());
        System.out.println(s.dequeue());
        System.out.println(s.len());        

		//when using assert run the command java -ea filename to execute the file.
		System.out.println("All test cases passed");	
	}
}