package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main (String [] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = "Za stodołą, gdzieś na płocie kogut gromko pieje, zaraz przyjdę miła do cię, tylko się odleję";
        poemBeautifier.beautify(() -> System.out.println(poem));
        poemBeautifier.beautify(() -> System.out.println(poem.toUpperCase()));
        poemBeautifier.beautify(() -> System.out.println(poem.toLowerCase()));
        poemBeautifier.beautify(() -> System.out.println("*** " + poem + " ***"));
        poemBeautifier.beautify(() -> System.out.println("A teraz przed państwem próbka poezji krasnoludzkiej: " + poem));

    }
}
