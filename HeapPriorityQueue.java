/*
* HeapPriorityQueue.java
*
* An implementation of a minimum PriorityQueue using a heap.
* based on the implementation in "Data Structures and Algorithms
* in Java", by Goodrich and Tamassia
*
* This implementation will throw a Runtime, HeapEmptyException
*	if the heap is empty and removeLow is called.
*
* This implementation will throw a Runtime, HeapFullException
*	if the heap is full and insert is called.
*
*/
@SuppressWarnings({"rawtypes", "unchecked"})
public class HeapPriorityQueue implements PriorityQueue {

	protected final static int DEFAULT_SIZE = 10000;
	
	protected Comparable[] storage;
	protected int currentSize; //numElements

	/*
	 * Constructor that initializes the array to hold DEFAULT_SIZE elements
	 */
	public HeapPriorityQueue() {
		this.storage = new Comparable[DEFAULT_SIZE];
		this.currentSize = 0;
	}
	
	/*
	 * Constructor that initializes the array to hold size elements
	 */
	public HeapPriorityQueue(int size) {
		this.storage = new Comparable[size];
		this.currentSize = 0;
		
		// if using a 1-based implementation, remember to allocate an 
		// extra space in the array since index 0 is not used. 
	}

	public void insert (Comparable element) throws HeapFullException {
		
		//1. Check for if array is empty
		if (currentSize == 0){
			storage[1] = element;
			currentSize++;
		}
		//2. Check for if array is full
		if (storage.length-1 == currentSize){
			throw new HeapFullException();
		}
		//3. Array is not full nor empty, now we'll insert
		storage[currentSize+1] = element;
		
		// When inserting the first element, choose whether to use 
		// a 0-based on 1-based implementation. Whatever you choose,
		// make sure your implementation for the rest of the program
		// is consistent with this choice.		
    }
	
	public void bubbleUp(int index) {
		// TODO: implement this
	}
			
	public Comparable removeMin() throws HeapEmptyException {
		// TODO: implement this
		
		return null; // so it compiles
	}
	
	private void bubbleDown(int index) {
		// TODO: implement this
	}

	public boolean isEmpty(){
		// TODO: implement this
		
		return false; // so it compiles
	}
	
	public boolean isFull() {
		// TODO: implement this
		
		return false; // so it compiles
	}
	
	public int size () {
		// TODO: implement this
		
		return -1; // so it compiles
	}

	public String toString() {
		String s = "";
		String sep = "";
		// This implementation of toString assumes you 
		// are using a 1-based approach. Update the initial
		// and final value for i if using a 0-based
		for(int i=1; i<=currentSize; i++) {
			s += sep + storage[i];
			sep = " ";
		}
		return s;
	}
}
