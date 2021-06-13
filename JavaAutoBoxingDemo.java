public class JavaAutoBoxingDemo {
    public static void main(String[] args) {

        // Autoboxing Wrapper to primitive data type
        Integer wrapperClassValue =10;
        int primitiveValue = wrapperClassValue;
        System.out.println(primitiveValue);
//        wrapperClassValue = null;
        primitiveValue = wrapperClassValue; // here autoboxing will fail since it cannot dereference null value
        // Lets unboxing the autoboxed value
        System.out.println(wrapperClassValue.intValue());
    }
}
