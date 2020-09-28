/**
 * Trie is a tree data structure used for collection of strings.
 * If two strings have the same prefix,then they will have same ancestor in the tree.
 *
 * Time complexity : 0(nl) for insert and delete, 0(l) for search where n is number of words and l is length of word.
 * 
 * Use Cases: Dictionary, Auto complete(prefix based search), Spell check
 *
 * Limitations: They are faster but require huge memory for storing the strings.
 * The main disadvantage of tries is that they need a lot of memory for storing the strings. 
 * For each node we have too many node pointers(equal to number of characters of the alphabet), if space is concerned, then Ternary Search Tree can be preferred for dictionary implementations. 
 * In Ternary Search Tree, the time complexity of search operation is O(h) where h is the height of the tree. 
 * Ternary Search Trees also supports other operations supported by Trie like prefix search, alphabetical order printing, and nearest neighbor search. 
 * 
 */
