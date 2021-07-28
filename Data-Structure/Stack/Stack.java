package sa.edu.yuc;
public interface Stack<T> {
	public boolean push(T value);
	public T pop();
	public T peek();
	public boolean isEmpty();
         public T search(T value);
}