package com.davidmwangi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hacking......");

        /** Counting duplicate characters**/
        String TEXT1 = "Be strong, be fearless, be beautiful. "
                + "And believe that anything is possible when you have the right "
                + "people there to support you. ";
//        System.out.println(CountDuplicateCharacters.countDuplicateCharactersV1(TEXT1));


        /** Finding the first non-repeated character**/
        String TEXT2 = "afjfkekjkjkgjk4a";
//        System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedCharacterV1(TEXT2));

        /** Finding the first repeated character**/
        String TEXT3 = "afjfkekjkjkgjk4a";
//        System.out.println(FirstRepeatedCharacter.firstRepeatedCharacterV1(TEXT3));

        /** Checking whether a string contains only digits **/
        String ONLY_DIGITS = "45566336754493420932877387482372374982374823"
                + "749823283974232237238472392309230923849023848234580383485342234287943943094"
                + "234745374657346578465783467843653748654376837463847654382382938793287492326";

        String NOT_ONLY_DIGITS = "45566336754493420932877387482372374982374823"
                + "749823283974232237238472392309230923849023848234580383485342234287943943094"
                + "234745374657346578465783467843653748654376837463847654382382938793287492326P";
//        System.out.println(ContainOnlyDigits.containsOnlyDigitsV1(ONLY_DIGITS));
//        System.out.println(ContainOnlyDigits.containsOnlyDigitsV1(NOT_ONLY_DIGITS));


        /** Counting vowels and consonants **/

        // 14 vowels, 19 consonants
        String TEXT4 = " ... Illinois Mathematics & Science Academy ... ";
//         System.out.println(CountVowelsAndConsonants.countVowelsAndConsonantsV1(TEXT4));

        /*** Counting occurrences of a certain character: **/
        String TEXT5 = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";
        char CHAR_TO_COUNT = 'u';
//         System.out.println(CountOccurrenceOfCharacter.countOccurrencesOfACertainCharacterV1(TEXT5, CHAR_TO_COUNT));
//         System.out.println(CountOccurrenceOfCharacter.countOccurrencesOfACertainCharacterV2(TEXT5, CHAR_TO_COUNT));

        /** Removing white spaces from a string **/

        String TEXT6 = "      My high\n\n school,        the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. \r"
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, \t"
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.           ";
//        System.out.println(RemoveWhiteSpacesFromString.removeWhitespaces(TEXT6));

        /** Joining multiple strings with a delimiter **/
        String TEXT_1 = "Illinois";
        String TEXT_2 = "Mathematics";
        String TEXT_3 = "and";
        String TEXT_4 = "Science";
        String TEXT_5 = "Academy";

//        System.out.println(JoinMultipleString.joinByDelimiterV2(' ', TEXT_1,TEXT_2,TEXT_3,TEXT_4,TEXT_5));


        /*** Generating all permutations **/
         String TEXT7 = "ABC";
//         GeneratePermutations.permuteAndPrint(TEXT7);

         /** Check if is palindrome **/
         String TEXT8 = "ABCDEFEDCBA";
//         System.out.println(CheckPalindrome.isPalindromev1(TEXT8));
//         System.out.println(CheckPalindrome.isPalindromeV2(TEXT8));

        /** Removing duplicate characters **/
        String TEXT9 = "!ABCBA;C D E-D  D  DFA;";
//        System.out.println(RemoveDuplicateCharacters.removeDuplicatesV1(TEXT9));

        /** Removing given characters **/
        String TEXT10 = "oobotooorogshŜoootorgo";
        char CHAR = 'Ŝ';
//        System.out.println(RemoveGivenCharacter.removeCharacterV1(TEXT10,CHAR));
//        System.out.println(RemoveGivenCharacter.removeCharacterV2(TEXT10,'o'));

        /** **/
        String TEXT11 = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";
//        System.out.println(FindCharacterWithMostAppearaces.maxOccurenceCharacterV1(TEXT11));


        /** Sorting an array of strings by length **/
        String[] strs = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
//        SortArrayOfStringByLength.sortArrayByLengthV1(strs, SortArrayOfStringByLength.Sort.DESC);
//        System.out.println(Arrays.toString(strs));


         String TEXT12 = "My high school, the Illinois Mathematics and Science Academy, "
                + "showed me that anything is possible and that you're never too young to think big. "
                + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
                + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
                + "computer science.";

        String SUBTEXT = "programmer";
//        System.out.println(CheckStringContainsSubstring.containsV1(TEXT12,SUBTEXT));


        /**Checking whether two strings are anagrams */
        String TEXT13 = "hello world";
        String TEXT14 = "dh\n le rlo l wo";
//        System.out.println(CheckTwoStringsAnagram.isAnagramV1(TEXT13,TEXT14));

        /** Declaring multiline strings (text blocks)*/
//        System.out.println(DeclareMultilineStrings.TEXT_1);

        /** */
        String TEXT15 = "hello";
        System.out.println(ConcatenateStringNTimes.concatRepeat(TEXT15,3));

    }





}
