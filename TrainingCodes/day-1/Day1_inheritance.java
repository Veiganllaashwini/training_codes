class superior{
    void print(){
        System.out.println("Im a parent");
    }
}
class inferior extends superior{
    void print1(){
        System.out.println("Im a child");
    }
}
public class Day1_inheritance {
    public static void main(String[] args) {
        inferior i=new inferior();
        i.print();
        i.print1();
    }
}
