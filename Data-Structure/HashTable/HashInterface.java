package sa.edu.yuc;
public interface HashInterface<T> {
	public boolean put(String key,String value);
	public void getAllValues();
	public T get(String key);
	public boolean delete(String key);
}