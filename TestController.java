package packages.data_structures.trie;

import java.util.ArrayList;

/**
 * Test controller class for MyTrie.
 */

class TestController {
    public static void main(String[] args) {
        MyTrie t = new MyTrie();
        System.out.println(t.insert("Test"));
        System.out.println(t.insert("Tes"));
        System.out.println(t.insert("Ja"));
        System.out.println(t.insert("Jar"));
        System.out.println(t.insert("Jared"));
        System.out.println(t.insert("Fruity"));
        System.out.println(t.insert("fruity"));
        System.out.println(t.insert("zazzle"));
        System.out.println(t.insert("zazz"));
        System.out.println(t.insert("Zaz"));
        System.out.println(t.insert("Hello"));
        System.out.println(t.insert("He"));
        System.out.println(t.insert("he"));

        System.out.println(t.insert("hello"));
        System.out.println(t.insert("TeSt"));
        System.out.println("--");
        System.out.println(t.search("yo"));
        System.out.println(t.search("test"));
        System.out.println(t.search("Te"));
        System.out.println(t.search("Tes"));
        System.out.println(t.search("Tesb"));
        System.out.println(t.search("hel"));
        System.out.println(t.search("hell"));
        System.out.println(t.search("hellow"));
        System.out.println("--");
        System.out.println(t.remove("TeSt"));
        System.out.println("--");
        System.out.println(t.search("Test"));
        System.out.println(t.search("hello"));
        System.out.println("--");
        System.out.println(t.search("Test"));
        System.out.println(t.search("TeSt"));
        System.out.println(t.search("Te"));
        System.out.println(t.search("Tes"));

        //System.out.println(t.insert("te.st"));
        ArrayList<String> result = t.getWords();
        System.out.println(result);
        System.out.println(t.remove("Test"));
        System.out.println(t.remove("hello"));
        System.out.println(t.remove("He"));
        result = t.getWords();
        System.out.println(result);


    }
}
