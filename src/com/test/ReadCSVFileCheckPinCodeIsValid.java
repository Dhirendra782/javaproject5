package com.test;


public class ReadCSVFileCheckPinCodeIsValid {

    public static void main(String [] args) {

        String address ="Sector, No-20,Navi Mumbai, Maharashtra, 400708";
        String words[] = address.split(",");
        for(String word: words){
            word = word.trim();
            if(word.length() == 6 && checkValidPinCode(word)){
                System.out.println("This is valid pincode: "+word);
            }
        }

    }

    public static boolean checkValidPinCode(String str) {
        for(char c: str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}

