package SafarjiProj;
public interface MyArray<T> {
	public boolean isEmpty();
	public boolean add(T value) throws OutOfSpaceException, DuplicateException ;
	public boolean delete(T value);
	public T find(T value) throws LocationException;
	
        public boolean Modfiy(T value)throws LocationException;
}