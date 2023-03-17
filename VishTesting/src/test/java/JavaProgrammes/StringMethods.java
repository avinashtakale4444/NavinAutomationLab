package JavaProgrammes;

import org.junit.Test;

public class StringMethods {

    @Test
    public void stringLength() {
        String str = "pune avinash takale pune";
        System.out.println("Length of string is:->" + str.length());
    }

    @Test
    public void stringSubstring() {
        String str = "pune avinash takale pune";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 1)); //exclusive - to index will not be considered
    }

    @Test
    public void charIndex() {
        String str = "pune avinash takale pune";
        System.out.println(str.charAt(4)); //This will return character present at index 4
    }

    @Test()
    public void indexOfChar() {
        String str = "aevinash ashine";
        System.out.println(str.indexOf('v')); //This will return index of first occurrence of character v from string
        System.out.println(str.indexOf("in"));//This will return index of string in from string(multiple words)
        System.out.println("last index of in from index 5 is ->" + str.indexOf("in", 5));//This will return index of string in from string starting from index 5
        System.out.println(str.indexOf('e', 2));
    }

    @Test()
    public void lastIndexOf() {
        String str = "aviainash takale";
        System.out.println(str.lastIndexOf('e'));
        System.out.println("last index of a from index 8 is ->" + str.lastIndexOf('i', 2));
        System.out.println(str.lastIndexOf("ashine"));
        System.out.println(str.lastIndexOf("in", 1));
        System.out.println("code point at -> " + str.codePointAt(5) + " " + str.charAt(5));
    }

    @Test
    public void stringCompare() {
        String str = "avinash";
        String str2 = "vish";
        String str1 = "vish";
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str));
    }

    @Test
    public void concatString() {
        String str = "avinash";
        String str2 = "vish";
        System.out.println(str.concat(str2));
        System.out.println(str.contains("na"));
    }
}