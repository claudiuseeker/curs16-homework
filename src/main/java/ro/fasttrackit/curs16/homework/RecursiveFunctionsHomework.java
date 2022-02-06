package ro.fasttrackit.curs16.homework;

public class RecursiveFunctionsHomework {

    public int sumOfFirstNumbers(int number) {
        if (number == 0) {
            return 0;
        } else {
            //return (number * (number + 1)) / 2;
            return  number + sumOfFirstNumbers(number-1) ;
        }
    }

    public int sumOfFirstEvenNumbers(int number) {
        if (number == 0) {
            return 0;

        }else{
            return number*2 + sumOfFirstEvenNumbers(number-1);
        }
    }

    public String palindrome(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            return palindrome(word.substring(1)) + word.charAt(0);
        }
    }

    public boolean palindromeSecond(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
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
        int f[] = new int[element];
        if (element <= 1) {
            return element;
        } else {
            return fibonacci(element-1) + fibonacci(element-2);

        }

    }

}
