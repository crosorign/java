public class JavaPolymorphism {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        BaseClass baseClass1 = new DerivedClass(); // runtime polymorphism is achieved  
        System.out.println(baseClass.getValue());
        System.out.println(baseClass1.getValue());
    }
}


class BaseClass
{
    int getValue()
    {
        return 10;
    }
}

class DerivedClass extends BaseClass
{
    int getValue()
    {
        return 20;
    }
}

