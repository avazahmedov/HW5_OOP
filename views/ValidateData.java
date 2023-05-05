package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";
    String patterPhone = "^(\\+7)([0-9]{10})$";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    Pattern patternPhone = Pattern.compile(patterPhone, Pattern.MULTILINE);

    public boolean checkFirstName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean checkPhone(String phone) {
        Matcher matcher = patternPhone.matcher(phone);
        return !matcher.find();
    }


}
