package javaapplication43;



public class HuffmanCode implements Comparable {
	
	private char c;
	private int freq;
	
	public HuffmanCode(char c, int freq) {
		this.c = c;
		this.freq = freq;
	}

    public void setC(char c) {
        this.c = c;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public char getC() {
        return c;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        return "HuffmanCode{" + "c=" + c + ", frequency=" + freq + '}';
    }
	
	
	
	

	
	public int compareTo(HuffmanCode o) {
		return o.freq-this.freq;
	}
	
	public int compareTo(int frequency) {
		return this.freq-freq;

        
        
}

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
 
        
    } 

   

        
