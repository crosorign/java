public class SingletonDesignPattern {

    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance().hashCode());
        System.out.println(Singleton2.getInstance().hashCode());
        System.out.println(Singleton3.getInstance().hashCode());
        System.out.println(Singleton4.getInstance().hashCode());
        System.out.println(Singleton5.getInstance().hashCode());
        System.out.println(Singleton6.getInstance().hashCode());
    }
}


// Eager initialisation

class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    public Singleton1() {

    }

    public static Singleton1 getInstance() {
        return SINGLETON;
    }
}

//Using static block

class Singleton2 {
    private static final Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    public Singleton2() {

    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}

// Lazy initialisation

class Singleton3 {
    private static Singleton3 singleton;


    public Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}

// Thread safe initialisation

class Singleton4 {
    private static Singleton4 singleton;


    public Singleton4() {

    }

    public synchronized static Singleton4 getInstance() {
        if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}


// Lazy initialisation Thread safe with double check

class Singleton5 {
    private static Singleton5 singleton;


    public Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                if (singleton == null) {
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }
}


// Optimal solution

class Singleton6 {
    public static Singleton6 getInstance() {
        return InnerClass.SINGLETON;
    }

    private static class InnerClass {
        public static final Singleton6 SINGLETON = new Singleton6();
    }
}

