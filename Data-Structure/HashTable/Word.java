package sa.edu.yuc;

import java.util.Scanner;

public class Word implements Comparable<Word>{
	private String word;
	private String meaning;
	public Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + "]";
	}
	public boolean equals(Word other) {
		
	          return this.word.equalsIgnoreCase(other.word);
                   
            
                       }
	@Override
	public int compareTo(Word o) {
		
		           
		
		return this.word.compareTo(o.word);
	}
	public static Word getWordMeaning() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word :: ");
		String word = input.nextLine();
		System.out.print("Meaning :: ");
		String meaning = input.nextLine();
		return new Word(word, meaning);
	}
}