package ro.fasttrackit.curs16.homework;

public class RecursiveFunctionsHomework {

    public int sumOfFirstNumbers(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number * (number + 1)) / 2;
        }
    }

    public int sumOfFirstEvenNumbers(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number * (number + 1));
        }
    }

    public String palindrome(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            return palindrome(word.substring(1)) + word.charAt(0);
        }
    }

    public String palindromeSecond(String word) {
        if (word.length() <= 1) {
            return "palindrome";
        } else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return "not a palindrome";
        }
        return palindromeSecond(word.substring(1, word.length() - 1));
    }

    public int digitSum(int number) {
        if (number < 10) {
            return number;
        } else {
            return digitSum(number / 10) + number % 10;
        }
    }

    public int fibonacci(int element) {
        int f[] = new int[element + 2];
        if (element <= 1) {
            return element;
        } else {
            int i;
            f[0] = 0;
            f[1] = 1;
            for (i = 2; i < element; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            return f[element];
        }

    }

}
