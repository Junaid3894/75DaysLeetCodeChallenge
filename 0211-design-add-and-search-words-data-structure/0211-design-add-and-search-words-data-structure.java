class WordDictionary {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    // Add word
    public void addWord(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }

        node.isEnd = true;
    }

    // Search with '.' support
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int i, TrieNode node) {

        if (node == null) return false;

        if (i == word.length()) return node.isEnd;

        char c = word.charAt(i);

        if (c == '.') {
            // Try all possible paths
            for (int j = 0; j < 26; j++) {
                if (dfs(word, i + 1, node.children[j])) {
                    return true;
                }
            }
            return false;
        } else {
            return dfs(word, i + 1, node.children[c - 'a']);
        }
    }
}