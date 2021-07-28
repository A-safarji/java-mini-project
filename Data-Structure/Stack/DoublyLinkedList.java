package sa.edu.yuc;
public interface DoublyLinkedList<T> {
	public boolean isEmpty();
	public boolean insertFirst(T item);
	public boolean insertLast(T item);
	public T removeFirst();
	public T removeLast();
	public boolean insertAtPosition(int position, T item);
	public T removeAtPosition(int position);
	public T search(T item);
	public T getFirst();
        public int getPosition(T item);
        public T removeValue(T item);
}