package com.davidmwangi;

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
         System.out.println(CountVowelsAndConsonants.countVowelsAndConsonantsV1(TEXT4));
    }
}
