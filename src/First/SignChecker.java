package First;

public class SignChecker {

    public boolean isLongString(String myString) {

        int length = myString.length();

        if (length > 10) {
            return true;
        } else return false;
    }

}


//public boolean isTrue(int a){

//boolean myBoolean = false;

//Kollar om talet är jämnt delabart med 2
// if (a % 2 == 0) {
//myBoolean = true;
//}
//return myBoolean;

