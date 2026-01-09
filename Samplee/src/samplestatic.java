import java.util.Scanner;

public class samplestatic {
    static String uni = "SRMIST Ramapuram";
    String name;
    int age;
    samplestatic(String n,int a){
        this.name=n;
        this.age=a;
    }
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int a=sc.nextInt();
        samplestatic ssc = new samplestatic(n,a);
        ssc.display();
        if(a>50){
            System.out.println("Too old to Play");
        } else if (a<18) {
            System.out.println("Too young to Play");
        }
        else {
            System.out.println("Eligible to Play");
        }
    }
}
