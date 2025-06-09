public class InstanceVar {
    // it is instance variable
    // within the class but outside method
    int number = 10;
    void see()
    {
        System.out.println("see this side " + number);
    }
    public static void main(String[] args) {
        InstanceVar obj1 = new InstanceVar();
        obj1.see();

        InstanceVar obj2 = new InstanceVar();
        obj2.number=100;
        obj2.see();
    }
}
