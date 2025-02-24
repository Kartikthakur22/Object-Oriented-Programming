public class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    public boolean isPalindrome(){
        int i=0,j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void displayResult(){
        if(isPalindrome()){
            System.out.println(text+" is palindrome");
        }
        else{
            System.out.println(text+" is not palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeChecker text1=new PalindromeChecker("abcba");
        text1.displayResult();
    }
}
