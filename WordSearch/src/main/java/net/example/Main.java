package net.example;

public class Main {

    //Call net.example.WordGrid to create grid
    //Call net.example.WordSearch to start game
    public static void main(String[] args) {
        WordGrid grid = new WordGrid(5, 7);
        WordSearch search = new WordSearch(grid);
    }
}