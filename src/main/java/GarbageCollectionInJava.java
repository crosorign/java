public class GarbageCollectionInJava {
    // finalize method will be invoked by GC before collecting object
    public void finalize(){System.out.println("object is garbage collected");}

    public static void main(String[] args) {

        GarbageCollectionInJava object1  = new GarbageCollectionInJava();
        GarbageCollectionInJava object2 = new GarbageCollectionInJava();
        object1 = null;
        object2 = null;
        System.gc(); // Performing garbage collection java
    }

}
