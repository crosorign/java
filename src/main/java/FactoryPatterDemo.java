public class FactoryPatterDemo {
    public static final String JAVA = "JAVA";
    public static final String PYTHON = "PYTHON";

    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("JAVA");
        System.out.println(plan.getRate()); // assinging rate via factory object
        System.out.println(plan.calculateRate(10)); // calculating the service fee

        Plan pythonPlan = planFactory.getPlan("PYTHON");
        System.out.println(pythonPlan.getRate()); // assinging rate via factory object
        System.out.println(pythonPlan.calculateRate(10)); // calculating the service fee
    }
}


// Factory Pattern

class PlanFactory {

    Plan getPlan(String courseName) {
        if (courseName.equals("JAVA")) {
            return new JavaPlan();
        } else {
            return new PythonPlan();
        }
    }
}

abstract class Plan {

    int rate;

    abstract int getRate();

    public int calculateRate(int units) {
        return rate * units;
    }

}

class JavaPlan extends Plan {

    @Override
    int getRate() {
        rate = 100;
        return 100;
    }
}

class PythonPlan extends Plan {

    @Override
    int getRate() {
        rate = 75;
        return 75;
    }
}


