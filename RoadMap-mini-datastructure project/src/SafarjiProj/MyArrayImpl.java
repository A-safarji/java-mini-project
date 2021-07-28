package SafarjiProj;
import java.io.Serializable;
import java.lang.reflect.Array;
public class MyArrayImpl<T extends Comparable<T>> implements MyArray<T>, Serializable {
   private int capacity;
	private T[] arr;
	private int size;
	public MyArrayImpl(Class<T> cls, int capacity) {
		this.capacity = capacity;
		this.arr = (T[])Array.newInstance(cls, capacity);
                
	}
        
        
        @Override
	public String toString() {
		String temp = "";
		for (int i=0; i<size; i++)
			temp += arr[i] + "\n";
		return temp;
	}
	@Override
	public boolean isEmpty() {
		          if (size==-1 && capacity == size-1) {
                
            }
		return false;
	}
	@Override
	public boolean add(T value) throws OutOfSpaceException, DuplicateException {
		if (size == capacity)
                  	throw new OutOfSpaceException("Running out of space!");
		if (find(value) != null) 
			throw new DuplicateException("Buliding number is already exists!");
			
		arr[size] = value;
		size++;
		return true;
	}

	
	@Override
	public boolean delete(T value) {
		for (int i=0; i<size; i++) {
			if (arr[i].compareTo(value) == 0) {  // found the location 
				for (int j=i; j<size-1; j++) {
					arr[j] = arr[j+1];
				}
				size--;
				return true;
			}
		}
		return false;
	}
	@Override
	public T find(T value) throws LocationException {
		for (int i=0; i<size; i++) {
			if (arr[i].compareTo(value) == 0) { //
				return arr[i];
                        }
                       
                        }
       return null;
       
        }
        
       //return null;
           
		
                
	//}
   @Override
        public boolean Modfiy(T value) throws LocationException {
            
          if ( find(value).equals(value)) {
              
              //   find(value);
              delete(value);
               add(value);
                return true;
          }else{
               delete(value);
          }
              
              
          
          
           
                                             /*
                                       find(value);
                                         delete(value);
                                       add(value);
                         
                    // I improved it even better
*/
       return false;
       
        }
         
       }
    
           
                  
              
 

        

   
        
	
	

