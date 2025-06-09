class Localvar
{
    void bark()
    {
        int a = 10;
        System.out.println("Dog is barking " + a + " times");
    }
    public static void main(String[] args) {
        Localvar obj = new Localvar();
        obj.bark();
    }
}
