package csci3130a3.email_validator;

/**
 * Hello world!
 *
 */
public class EmailValidator 
{
   public EmailValidator(){
	   
   }

public boolean justOneAt(String ex1) {
	
	int i=0;
	for(int j=0;j<ex1.length();j++){
		if(ex1.charAt(j)=='@'){
			i++;
		}
	}
	if(i != 1){
		return false;
	}
	return true;
}

public boolean moreonePoint(String ex1) {
	int i=0;
	for(int j=0;j<ex1.length();j++){
		if(ex1.charAt(j)=='.'){
			i++;
		}
	}
	if(i >= 1){
		return true;
	}
	return false;
}

public boolean isValidate(String ex1) {
	boolean result=false;
	result=this.justOneAt(ex1)&&this.moreonePoint(ex1)&&this.isLowerCase(ex1)&&this.isLonger10(ex1);
	return result;
}

public boolean isLowerCase(String ex1) {
	int i=0;
	for(int j=0;j<ex1.length();j++){
		if(ex1.charAt(j)=='@'|| ex1.charAt(j)=='.'||Character.isLowerCase(ex1.charAt(j))){
			i++;
		}
	}
	if(i != ex1.length()){
		return false;
	}
	return true;
}

public boolean isLonger10(String ex1) {
	if(ex1.length()>=10){
		return true;
	}
	return false;
}
}
