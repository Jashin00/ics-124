
public class Encrypter { 
    // lowercase letters of the alphabet 
    private char[] normalAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                                     'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                                     'u', 'v', 'w', 'x', 'y', 'z'};
    private char [] encryptAlphabet = new char[26];
    private int shiftAmount;
    private boolean shiftToLeft; 
 
    public Encrypter(int shiftAmount, boolean shiftToLeft) { 
       // Complete Part A 
       this.shiftAmount = shiftAmount;
       this.shiftToLeft = shiftToLeft;
    } 
 
    public String encrypt(String normalWord) { 
       // Complete Part B 
       StringBuilder result = new StringBuilder();
       
       for(int i = 0; i < normalWord.length(); i++){
           char myChar = normalWord.charAt(i);
           if (normalWord.charAt(i) < 'z' &&  !shiftToLeft){
               myChar = (char)(normalWord.charAt(i) + shiftAmount);
           } else {
               myChar = (char)(normalWord.charAt(i) - (26 - shiftAmount));
           }
           result.append(myChar);
       }
       return result.toString();
    }
 }
 