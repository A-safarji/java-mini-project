package sa.edu.yuc;
import java.lang.reflect.Array;
public class MinHeap<E extends Comparable<E>> implements HeapInterface<E> {

        // private  static Integer max;
	 E   m;


        
	private E[] arr;
	private int heapSize;
	public  MinHeap(Class cls, int size) {
		this.arr = (E[])Array.newInstance(cls, size);
	}		
	public MinHeap(E[] arr) {
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
	public void minHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int Sallest = 0;
		if (l <= heapSize && arr[l].compareTo(arr[i]) < 0) 
			Sallest = l;
		else 
			Sallest = i;	
		if (r <= heapSize && arr[r].compareTo(arr[Sallest]) < 0)
			Sallest = r;
		
		if (Sallest != i) {
			exchange(i, Sallest);
			minHeapify(Sallest);
		}
	}
	public void minHeapify(int i, int j) {
		int l = left(i);
		int r = right(i);
		int Sallest = 0;
		if (l <= j && arr[l].compareTo(arr[i]) < 0) 
			Sallest = l;
		else 
			Sallest = i;
		
		if (r <= j && arr[r].compareTo(arr[Sallest]) < 0)
			Sallest = r;
		
		if (Sallest != i) {
			exchange(i, Sallest);
			minHeapify(Sallest, j);
		}
	}	
	public void heapSort() {
		buildMinHeap();
		for (int j = heapSize; j >= 1; j--) {
			exchange(1, j);
			minHeapify(1, j - 1);
		}
	}	
	public void buildMinHeap() { 
		
		for (int i=heapSize/2; i > 0; i--)
			minHeapify(i);
	}	
	public void print() {
		for (int i=1; i<=heapSize; i++)
			System.out.print(arr[i] + "  ");
	}
        
	public boolean insert(E value)throws IncException {
              
           // this.m=(Integer) value;
          
            heapSize++;
            
		this.arr[heapSize] = value;
                
              
            // this.m=(Integer) value;
               
                
            // this.m= (Integer) value;
         // E v = null;
        //  if (m >(Integer) v) {
        //        v=(E) this.m;
              // MinHeap.max=(Integer) v;
       
            //}
                 
               
       
     
      
		int i = heapSize;
		while (i > 1 && arr[parent(i)].compareTo(arr[i]) > 0) {
			 exchange(i, parent(i));    
			 i = parent(i);
                             
                }
                
             if (heapSize==1) {
                 this.m=value;
            
                
            }else{
                    if (value.compareTo(m)>0) {
                    this.m=value;
                    
   
}
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
	public  E Findmax() throws IncException{
            /*
       E b = (E) this.m;
      
     
              try { 
                  
        
               
                  if (m.compareTo((Integer) b)>0) {
                      max=this.m;
                      return (E) max; 
                  }
               
               } catch(Exception n){
                       System.out.println("");
                    
               
           }
              */
             return (E) this.m;
             
           }
                
            
            
     
     
             


	public  E Findmin() { // root
	
             return arr[1];

	
}
}