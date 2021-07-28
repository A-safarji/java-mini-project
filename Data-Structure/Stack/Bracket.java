package sa.edu.yuc;
public class Bracket<T> implements Comparable<Bracket> {
	public char ch;
	public int line;
	public int col;
	public Bracket(char ch, int line, int col) {
		this.ch = ch;
		this.line = line;
		this.col = col;
	}
	@Override
	public String toString() {
		return ch + " [" + line + ", " + col + "]";
	}
	@Override
	public int compareTo(Bracket o) {
		// if need write the code
		return 0;
	}
}