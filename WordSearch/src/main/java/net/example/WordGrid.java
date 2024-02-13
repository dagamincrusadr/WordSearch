package net.example;


public class WordGrid {
    //List of words
    //Pick x number of words
    //Make 2d array size y*y
    //Fit words into array
    //Fill rest of space with arbitrary characters
    //Object can retrieve words, grid size, or set new words and set new grid size


    private final String[] POSSIBLEWORDS = {};
    private String[] words;
    private int numOfWords;
    private int size;
    private char[][] grid;


    public WordGrid(int x, int y) {
        pickWords(x);
        makeGrid(y);
    }

    public void pickWords(int x) {

    }

    public void makeGrid(int y) {

    }

    public String[] getWords() {
        return words;
    }

    public String getWord(int x) {
        return words[x];
    }

    public int getSize() {
        return size;
    }

    public char[][] getGrid() {
        return grid;
    }


    @Override
    public String toString() {

        return size + " by " + size + " Word Grid with " + numOfWords + " words to find!";
    }
}
