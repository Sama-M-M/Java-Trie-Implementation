public class Trie {
	TriNode root;

	public Trie() {
		root = new TriNode();
	}

	static Trie trie = new Trie();


	public void insert(Trie trie, String word) {
		int wordLength = word.length();
		TriNode current = trie.root; // current node

		for (int i = 0; i < wordLength; i++) {
			char letter = word.charAt(i);
			if (current.children.containsKey(letter) == false) { // if this letter isn't one of the current nodes
																	// children
				TriNode newNode = new TriNode(); // create a new node for that letter
				current.children.put(letter, newNode); // add this node to the current nodes children
				current = newNode; // look at next letter

			} else
				current = current.children.get(letter); // if the letter already exists look at it [value (node) of that
														// // key]
			if (i == wordLength - 1) { // if this is the last letter in the word, mark as end of word
				current.endofWord = true;
			}
		}
	}

	public boolean search(Trie trie, String word) {
		int wordLength = word.length();
		TriNode current = trie.root; // current node
		
		for (int i = 0; i < wordLength; i++) {
			char letter = word.charAt(i);
			
			if (current.children.containsKey(letter) == false) {
				return false;
			} else

				current = current.children.get(letter);
		}
		return current.endofWord; 
	}

}
