package com.regexemail;

import java.util.regex.Pattern;

public class RegexValidation {
    /*
     * @purpose: Ability to check valid regex
     *
     * @function : compiles given regex using pattren.compile method matches input
     * and regex gives a boolean output
     *
     * @return: Returns true or false
     */

    static public boolean isValid(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        return Pattern.matches(regex, input);

    }

    public static void main(String[] args) {
        boolean regexCheck = isValid("^[a-z]{1,10}[@][a-z]{1,10}$", "abc@yahoo");
        System.out.println(regexCheck);
    }
}
