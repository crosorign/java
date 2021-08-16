public class ImmutableClassDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ImmutableClass immutableClass = new ImmutableClass("Mohan",new Age(10,12));
        System.out.println(immutableClass.toString());
        immutableClass.getAge().setMonth(11);
        immutableClass.getAge().setYear(13); // immutable object is getting into mutable on passing mutable object : steps to prevent ?
        System.out.println(immutableClass.toString());
        // hence on doing deep copy object is getting immutable even though passing mutable object

    }
}
// Making class as immutable
final class  ImmutableClass
{
    private final String name;
    private Age age;

    ImmutableClass(String name, Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Age getAge() throws CloneNotSupportedException {
        return (Age) age.clone();
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Age implements Cloneable
{
    private int month;
    private int year;

    public Age(int month, int year) {
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Age{" +
                "month=" + month +
                ", year=" + year +
                '}';
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
