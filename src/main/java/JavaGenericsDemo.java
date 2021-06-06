public class JavaGenericsDemo {

    public static void main(String[] args) {
        ModelClass<Integer> integerModelClass = new ModelClass<>(10);
        ModelClass<String> stringModelClass = new ModelClass<>("String value");
        System.out.println(integerModelClass.getValue());
        System.out.println(stringModelClass.getValue());
    }

}

class ModelClass<T> {

    T value ;

    public ModelClass(T value) {
        this.value = value;
    }

    T getValue()
    {
        System.out.println(value.getClass());
        return value;
    }

}
