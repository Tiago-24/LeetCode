//242. Valid Anagram

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] c = new int[26];
        for (int i = 0; i<s.length(); i++){

            c[s.charAt(i) - 'a']++; 
            c[t.charAt(i) - 'a']--; //Subtract the ASCII value of a to check the index 
        }                           

        for (int v : c){
            
            if (v != 0) {
                return false;
            }
        }
        return true;
       
    }
}
