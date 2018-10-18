import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String a;
        Scanner S=new Scanner(System.in);
        a = S.nextLine();
        Person ja = new Person();
        ja.setFullName(a);
        System.out.println(ja.getFullName());
    }
}

class Person{
private String name;
    Person(){
        setFullName(name);
    }
    void setFullName(String ime){
        name = ime;
    }
    String getFullName(){
        return name;
    }
}
