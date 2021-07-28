package sa.edu.yuc;
import java.util.ArrayList;
import java.util.LinkedList;
public class HashTable<T> implements HashInterface<T>{
	private int size;
	private ArrayList<LinkedList<T>> ht = new ArrayList<>();
	
	public HashTable(){
		this.size=13;
                for (int i = 0; i < size; i++) {
                    ht.add(new LinkedList<T>());
                
            }
	}
	
	public HashTable(int size){
		this.size=size;
		
                for (int i = 0; i < size; i++) {
                    ht.add(new LinkedList<T>());
                
            }
		
	}
	
	public  int hash1(int key){
            
		int h = (int)key % size;	
		return h;
	}
	
	private static int char2int(char ch) {
		return (int)ch - 64;
	}
	
	public int hash(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = char2int(ch);
			sum += num;
		}
		return sum;
	}
	
	public int hash2(String str) {
		int sum = 0;
		int exp = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = char2int(ch) * exp;
			sum += num;
			exp = exp * 26;
		}
		return sum % size;
	}
	@Override
	public boolean put(String key, String value) {
		Word v = new Word(key, value);
               
                
           
                ht.get(hash2(key)).addLast((T) v);
                return true;
                
	}
	@Override
	public void getAllValues() {
            for (int i = 0; i < size; i++) {
                if (ht.get(i).isEmpty()) {
                    continue;
                }else{
                    ht.get(i);
                }
                
            }
		     
	}
	@Override
	public T get(String key) {
		Word c = new Word(key,"");
                if(ht.get(hash2(key))!=null){
                    return (T) ht.get(hash2(key)); 
                }else{
                    return null;
                }
		
                
	}
	public boolean delete(String key){
		          if (ht.get(hash2(key)).isEmpty()!=true) {
                              ht.set(hash2(key), new  LinkedList<T>());
                
            }
		return false;
	}
}
