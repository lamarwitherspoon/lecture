package register;

public class Registraion {


private  String usesernameA; // object or Instance varible

private static  int usesernameCount = 0; //Static varible


    public Registraion(String A){

        usesernameA=A;

        usesernameCount++;
    }


    public String PutUsernameDatabase(){

        return usesernameA;
    }

    public  static int getCount(){

        return  usesernameCount;
    }














}
