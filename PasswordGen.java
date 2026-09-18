import java.util.Random; 
import java.util.Scanner; // take from keyboard

public class PasswordGen { 
    public static String password_generator(String upper, String lower, String spch, String num, int passLen){
        Random ran = new Random(); 
        StringBuilder str = new StringBuilder(""); 
        String[] randStrings = {upper, lower, spch, num};
        str.append(generateCharacter(upper, 2,ran)); 
        str.append(generateCharacter(lower,2,ran));
        str.append(generateCharacter(spch,2,ran));
        str.append(generateCharacter(num,2,ran));

        while(str.length() < passLen){
            str.append(generateCharacter(randStrings[ran.nextInt(0, randStrings.length)], ran.nextInt(0, 2), ran));
        }

        return str.toString();  
    }

    public static String generateCharacter(String charac, int length, Random rand){
        StringBuilder stri = new StringBuilder(""); 
        for(int i =0; i<length; i++){
            int Random_ind = rand.nextInt(0,charac.length()); 
            char Random_char = charac.charAt(Random_ind);
            stri.append(Random_char); 
        }
        return stri.toString(); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz"; 
        String speChar = "!@#%^%&*()_";
        String number = "0123456789"; 
        System.out.println("Enter the length of the password:"); 
        int password_len = sc.nextInt(); 
        String password = ""; 
        if(password_len < 8){
            System.out.println("password must contain minimum 8 letters"); 
        }else{
            password = password_generator(upperCase, lowerCase, speChar, number, password_len); 
            System.out.println("The password is : 12"+password); 
        }

        StringBuilder shufflePassword = new StringBuilder(password);  // rearranging order
        int j=1; 

        for(int i=0; i<password.length(); i++){
            if(i%2==0 && i < password.length()-1){
                char a = shufflePassword.charAt(password.length()-j); 
                char b = shufflePassword.charAt(i);
                shufflePassword.setCharAt(password.length()-j, b);
                shufflePassword.setCharAt(i, a);
                // char temp = a; --> error
                // a = b 
                // b = temp
                j++; 
            }else{
                continue; 
            }
        }

        if(shufflePassword.length()>0){
            System.out.println("the shuffled password is : "+shufflePassword.toString()); 
        }

    }
}