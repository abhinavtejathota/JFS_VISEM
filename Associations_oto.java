import java.util.ArrayList;
import java.util.Scanner;
class Passport {
    int passportNo;
    String country;
    Passport (int passportNo, String country){
        this.passportNo = passportNo;
        this.country = country;
    }
}

class Person {
    int id;
    String name;
    Passport pass;
    Person (int id, String name, Passport p){
        this.id = id;
        this.name=name;
        this.pass = p;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Passport p;
        ArrayList<Person> m = new ArrayList<>();
        for(int i=0;i<=10;i++){
            p = new Passport(1000+i,"Indian");
            System.out.println("Enter id of person: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of person: ");
            String name = sc.nextLine();
            m.add(new Person(id, name, p));
        }
        System.out.println("Enter id for detail: ");
        int k = sc.nextInt();
        System.out.println("Name of kth Person:" + m.get(k).name);
        System.out.println("Passport of kth Person:" + m.get(k).pass.passportNo);
        System.out.println("Country of kth Person:" + m.get(k).pass.country);
    }
}
