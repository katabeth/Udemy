package com.sparta.kch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class largeLetters {

    static HashMap<Character,String[]> letters = new HashMap<Character,String[]>();
    public static void declareLetters() {
        letters.put('A', new String[]{"  A  ", " A A ", "A   A", "AAAAA", "A   A", "A   A", "A   A"});
        letters.put('B', new String[]{"BBBB ", "B   B", "B   B", "BBBBB", "B   B", "B   B", "BBBBB"});
        letters.put('C', new String[]{" CCC ", "C   C", "C    ", "C    ", "C    ", "C   C", " CCC "});
        letters.put('D', new String[]{"DDDD ", "D   D", "D   D", "D   D", "D   D", "D   D", "DDDD "});
        letters.put('E', new String[]{"EEEEE", "E    ", "E    ", "EEE  ", "E    ", "E    ", "EEEEE"});
        letters.put('F', new String[]{"FFFFF", "F    ", "F    ", "FFF  ", "F    ", "F    ", "F    "});
        letters.put('G', new String[]{" GGG ", "G   G", "G    ", "G GGG", "G   G", "G   G", " GGG "});
        letters.put('H', new String[]{"H   H", "H   H", "H   H", "HHHHH", "H   H", "H   H", "H   H"});
        letters.put('I', new String[]{"IIIII", "  I  ", "  I  ", "  I  ", "  I  ", "  I  ", "IIIII"});
        letters.put('J', new String[]{"JJJJJ", "   J ", "   J ", "   J ", "   J ", "J  J ", " JJ  "});
        letters.put('K', new String[]{"K   K", "K  K ", "K K  ", "KK   ", "K K  ", "K  K ", "K   K"});
        letters.put('L', new String[]{"L    ", "L    ", "L    ", "L    ", "L    ", "L    ", "LLLLL"});
        letters.put('M', new String[]{"M   M", "MM MM", "M M M", "M   M", "M   M", "M   M", "M   M"});
        letters.put('N', new String[]{"N   N", "NN  N", "N N N", "N  NN", "N   N", "N   N", "N   N"});
        letters.put('O', new String[]{" OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "});
        letters.put('P', new String[]{"PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "});
        letters.put('Q', new String[]{" QQQ ", "Q   Q", "Q   Q", "Q   Q", " QQQQ", "  Q  ", " QQQQ"});
        letters.put('R', new String[]{"RRRR ", "R   R", "R   R", "RRRR ", "R R  ", "R  R ", "R   R"});
        letters.put('S', new String[]{" SSS ", "S   S", "S    ", " SSS ", "    S", "S   S", " SSS "});
        letters.put('T', new String[]{"TTTTT", "  T  ", "  T  ", "  T  ", "  T  ", "  T  ", "  T  "});
        letters.put('U', new String[]{"U   U", "U   U", "U   U", "U   U", "U   U", "U   U", " UUU "});
        letters.put('V', new String[]{"V   V", "V   V", "V   V", "V   V", "V   V", " V V ", "  V  "});
        letters.put('W', new String[]{"W   W", "W   W", "W   W", "W W W", "WW WW", "WW WW", "W   W"});
        letters.put('X', new String[]{"X   X", "X   X", " X X ", "  X  ", " X X ", "X   X", "X   X"});
        letters.put('Y', new String[]{"Y   Y", "Y   Y", " Y Y ", "  Y  ", "  Y  ", "  Y  ", "  Y  "});
        letters.put('Z', new String[]{"ZZZZZ", "    Z", "   Z ", "  Z  ", " Z   ", "Z    ", "ZZZZZ"});
        letters.put(' ', new String[]{"     ", "     ", "     ", "     ", "     ", "     ", "     "});
        letters.put('!', new String[]{"  !  ", "  !  ", "  !  ", "  !  ", "  !  ", "     ", "  !  "});
        letters.put(',', new String[]{"     ", "     ", "     ", "     ", "     ", "  ,  ", " ,   "});
        letters.put('.', new String[]{"     ", "     ", "     ", "     ", "     ", "     ", "  :: "});
        letters.put('-', new String[]{"     ", "     ", "     ", "     ", " --- ", "     ", "     "});
        letters.put('\'',new String[]{"  :  ", "  ;  ", "     ", "     ", "     ", "     ", "     "});
    }
    public static void printLarge(String sentence) {
        Arrays.stream(sentence.split("\n")).forEach(largeLetters::printLargePart);

    }
    private static void printLargePart(String sentence) {
        Character[] args = sentence.toUpperCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        IntStream.range(0,7).forEach(line ->
                System.out.println(Arrays.stream(args)
                        .filter(arg -> letters.containsKey(arg))
                        .map(arg -> letters.get(arg)[line] + "  ")
                        .collect(Collectors.joining())));
    }
    public static void main(String[] args) {
        declareLetters();
        String sentence = "Katherine Carver-Hardy\nHi\nI'm KCH";
        printLarge(sentence);
    }
}
