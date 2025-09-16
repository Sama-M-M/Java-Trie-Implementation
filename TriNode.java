import java.util.HashMap;

public class TriNode {
	HashMap<Character, TriNode> children; //letter, node object (the root of this letter)
	boolean endofWord;

	public TriNode() {
		children = new HashMap<>();
		endofWord = false;
	}

}
 
