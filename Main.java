package register;

public class Main {

    public static void main(String[] args) {



    //day 1

        Registraion newUser = new Registraion("Jack");
        System.out.println(newUser.PutUsernameDatabase()+ " username created and entered into data base");


        //day 2

        Registraion newUser2 = new Registraion(" Jill");

        System.out.println(newUser2.PutUsernameDatabase() + " username created and entered into data base");




        //Traffic lets see how many we have

        System.out.println(Registraion.getCount());



























    }

}
