import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String a;
        Scanner S=new Scanner(System.in);
        a = S.nextLine();
        Person ja = new Person();
        ja.getFullName(a);
        ja.Display();
    }
}

class Person{
String name;
    Person(){
        getFullName(name);
    }
    void getFullName(String ime){
        name = ime;
    }
    void Display(){
        System.out.println(name);
    }
}
