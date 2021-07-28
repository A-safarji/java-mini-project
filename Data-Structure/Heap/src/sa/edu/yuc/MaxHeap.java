package sa.edu.yuc;
import java.lang.reflect.Array;
public class MaxHeap<E extends Comparable<E>> implements HeapInterface<E> {
	
	private E[] arr;
	private int heapSize;
	public MaxHeap(Class cls, int size) {
		this.arr = (E[])Array.newInstance(cls, size);
	}		
	public MaxHeap(E[] arr) {
		this.arr = arr;
		this.heapSize = arr.length - 1;
	}
	public int left(int i) {
		return 2 * i;
	}	
	public int right(int i) {
		return 2 * i + 1;
	}	
	public int parent(int i) {
		return i/2;
	}	
	public void exchange(int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}	
	public void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = 0;
		if (l <= heapSize && arr[l].compareTo(arr[i]) > 0) 
			largest = l;
		else 
			largest = i;	
		if (r <= heapSize && arr[r].compareTo(arr[largest]) > 0)
			largest = r;
		
		if (largest != i) {
			exchange(i, largest);
			maxHeapify(largest);
		}
	}
	public void maxHeapify(int i, int j) {
		int l = left(i);
		int r = right(i);
		int largest = 0;
		if (l <= j && arr[l].compareTo(arr[i]) > 0) 
			largest = l;
		else 
			largest = i;
		
		if (r <= j && arr[r].compareTo(arr[largest]) > 0)
			largest = r;
		
		if (largest != i) {
			exchange(i, largest);
			maxHeapify(largest, j);
		}
	}	
	public void heapSort() {
		buildMaxHeap();
		for (int j = heapSize; j >= 1; j--) {
			exchange(1, j);
			maxHeapify(1, j - 1);
		}
	}	
	public void buildMaxHeap() {
		for (int i=heapSize/2; i > 0; i--)
			maxHeapify(i);
	}	
	public void print() {
		for (int i=1; i<=heapSize; i++)
			System.out.print(arr[i] + "  ");
	}
	public boolean insert(E value) {
		heapSize++;
		this.arr[heapSize] = value;
		int i = heapSize;
		while (i > 1 && arr[parent(i)].compareTo(arr[i]) < 0) {
			 exchange(i, parent(i));    
			 i = parent(i);
		 }
		return true;
	}
	public E getParent(E value){
		int index = -1;
		for(int i = 1; i <= heapSize; i++){
			if(value.compareTo(arr[i]) == 0){
				index = i;
				break;
			}
		}
		if (index == -1){
			return null;
		}else{
			E temp = null;
			temp = arr[parent(index)];
			return temp;
		}
	}
	public E getLeftChild(E value){
		int index = -1;
		for(int i = 1; i <= heapSize; i++){
			if(value.compareTo(arr[i]) == 0){
				index = i;
				break;
			}
		}
		if(index == -1){
			return null;
		}else{
			E temp = null;
			temp = arr[left(index)];
			return temp;
		}
	}
	public E getRightChild(E value){
		int index = -1;
		for(int i = 1; i <= heapSize; i++){
			if(value.compareTo(arr[i]) == 0){
				index = i;
				break;
			}
		}
		if(index == -1){
			return null;
		}else{
			E temp = null;
			temp = arr[right(index)];
			return temp;
		}
	}

    @Override
    public E Findmax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}