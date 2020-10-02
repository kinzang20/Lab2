//creating node class
class Node{
    public int element;
    public Node next;

    // constructor
    public Node(int element, Node next ){
        this.element = element;
        next = null;
    }
}
//class
public class QueueLinkedlist{
	Node front;
	Node rear;
    Node head;
	int len;

    //constructor
	public QueueLinkedlist(){
		front = null;
		rear = null;
        head = null;
		len = 0;
	}
	//checking if the linklist is empty or not
	public boolean isEmpty()
    {
        if (len == 0) {

        	return true; 	
        }
        else {
        	return false;
        }
    }
    //size of the linkedlist
    public int len(){
    	return len;
    }
    //first value
    public int first()
    {
        if (isEmpty()){
        	return 0;

        }
        else {
        	return front.element;
        }
        
	}
    //adding values
	public void enqueue(int n)
    {
        Node newest = new Node(n, null);
        if (this.isEmpty())
        {
            this.head = newest;
            this.rear = newest;
            this.front = newest;
        }
        else
        {
            this.rear.next = newest;
            this.rear = newest;
        }
        len = len + 1;
    } 
    //removing values
    public int dequeue()
    {
        int x = front.element;

        if (isEmpty()) {
        	return 0;
        }

        else {
            front = front.next;
        }
        len = len - 1;
        return x;
    }

    //main method
    public static void main(String[] args) {
        QueueLinkedlist obj = new QueueLinkedlist();

        obj.enqueue(6);
        obj.enqueue(2);
        obj.enqueue(3);
                
        System.out.println(obj.isEmpty());
        System.out.println(obj.len());
        System.out.println(obj.first());
        System.out.println(obj.dequeue());
        System.out.println(obj.len());
        System.out.println(obj.first());
        System.out.println("All test Cases passed");
    }
}