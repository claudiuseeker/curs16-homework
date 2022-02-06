package ro.fasttrackit.curs16.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveFunctionsHomeworkTest {

    @Test
    void testSumOfFirstNumbers(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.sumOfFirstNumbers(0)).isZero();
        assertThat(recursiveFunctionsHomework.sumOfFirstNumbers(5)).isEqualTo(15);
        assertThat(recursiveFunctionsHomework.sumOfFirstNumbers(12)).isEqualTo(78);
    }

    @Test
    void testSumOfFirstEvenNumbers(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.sumOfFirstEvenNumbers(0)).isZero();
        assertThat(recursiveFunctionsHomework.sumOfFirstEvenNumbers(3)).isEqualTo(12);
        assertThat(recursiveFunctionsHomework.sumOfFirstEvenNumbers(10)).isEqualTo(110);
    }

    @Test
    void testPalindrome(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.palindrome("ana")).isEqualTo("ana");
        assertThat(recursiveFunctionsHomework.palindrome("madam")).isEqualTo("madam");
        assertThat(recursiveFunctionsHomework.palindrome(null)).isEqualTo("");
    }

    @Test
    void testPalindromeSecond(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.palindromeSecond("madam")).isEqualTo(true);
        assertThat(recursiveFunctionsHomework.palindromeSecond("noon")).isEqualTo(true);
        assertThat(recursiveFunctionsHomework.palindromeSecond("pizza")).isEqualTo(false);
    }
    @Test
    void testDigitSum(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.digitSum(4)).isEqualTo(4);
        assertThat(recursiveFunctionsHomework.digitSum(1234)).isEqualTo(10);
    }

    @Test
    void testFibonacci(){
        RecursiveFunctionsHomework recursiveFunctionsHomework= new RecursiveFunctionsHomework();
        assertThat(recursiveFunctionsHomework.fibonacci(0)).isZero();
        assertThat(recursiveFunctionsHomework.fibonacci(1)).isEqualTo(1);
        assertThat(recursiveFunctionsHomework.fibonacci(2)).isEqualTo(1);
        assertThat(recursiveFunctionsHomework.fibonacci(10)).isEqualTo(55);
    }
}