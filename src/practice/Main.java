package practice;

// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//
// For example:
//
// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28
// ...
// 1 <= columnNumber <= 2^31 - 1

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int curr = columnNumber % 26;
            columnNumber /= 26;
            sb.append((char) (curr + 'A'));
        }
        return sb.reverse().toString();

    }
}
