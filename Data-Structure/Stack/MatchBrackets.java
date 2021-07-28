package sa.edu.yuc;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
public class MatchBrackets {
	public static void main(String[] args) throws Exception {
		Stack<Bracket> stack = new StackImpl<>();
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            Scanner input = new Scanner(new FileInputStream(file));
            StringBuffer buffer = new StringBuffer();
            while (input.hasNext()) {
            	buffer.append(input.nextLine() + "\n");
            }
            String text = buffer.toString();
            int line = 1;
            int col = 1;
            for (int i = 0; i < text.length(); i++) {
            	char ch = text.charAt(i);
            	if (ch == '(' || ch == '[' || ch == '{') {
            		stack.push(new Bracket(ch, line, col));
            	} else if (ch == ')' || ch == ']' || ch == '}') {
            		if (!stack.isEmpty())
            			stack.pop();
            		else 
            			JOptionPane.showMessageDialog(null, "Missing open bracket for " + ch + "[" + line + ", "+ col + "]");
            	} else {
            		//do nothing
            	}
            	col++;
            	if (ch == '\n') {
            		line++;
            		col = 1;
            	}
            }
            JTextPane textPane = new JTextPane();
            textPane.setText(text);
    		JFrame frame = new JFrame("Stack");
    		frame.add(textPane);
    		//frame.setSize(600, 400);
    		frame.pack();
    		frame.setVisible(true);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		if (stack.isEmpty())
    			JOptionPane.showMessageDialog(null, "Bracket match.");
    		else 
    			JOptionPane.showMessageDialog(null, "Missing closing Bracket for " + stack.pop());
        } else {
        	JOptionPane.showMessageDialog(null, "Invaled File.");
        }
	}
}