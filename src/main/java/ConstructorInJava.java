public class ConstructorInJava {

    Integer a;

    // default constructor

    ConstructorInJava() {
        System.out.println("default constructor");
    }

    // parameterised constructor

    public ConstructorInJava(int a) {
        this.a = a;
    }


    public static void main(String[] args) {
        ConstructorInJava constructorInJava = new ConstructorInJava();
        System.out.println(constructorInJava.a); // a is null since not initialised
        ConstructorInJava constructorInJava1 = new ConstructorInJava(10);
        System.out.println(constructorInJava1.a); // a has value since initialised in parameterised constructor
    }
}
