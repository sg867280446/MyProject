package chapter20.annotation.first;

import java.util.List;

public class PasswordUtils {
    @UseCase(id = 47,description = "Passwords must contain at least one numeric")
    public boolean validatePasswird(String password){
    	return password.matches("\\w*\\d\\w*");
    }
    
    @UseCase(id = 48)
    public String encryptPassword(String password){
    	return new StringBuilder(password).reverse().toString();
    }
    
    @UseCase(id = 49,description = "New Passwords can not equals previously used ones")
    public boolean checkForNewPasswords(List<String> prePasswords,String password){
    	return !prePasswords.contains(password);
    }
}
