package main;

public class Main {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(5);
        FiveObjectClass obj1 = objectPool.acquireObject();
//        OneObjectClass obj2 = objectPool.acquireObject();
//        OneObjectClass obj3 = objectPool.acquireObject();
//        OneObjectClass obj4 = objectPool.acquireObject();
//        OneObjectClass obj5 = objectPool.acquireObject();
        FiveObjectClass nullObject = objectPool.acquireObject();
        System.out.println(nullObject);

        objectPool.releaseObject(obj1);
//        objectPool.releaseObject(obj2);
//        objectPool.releaseObject(obj3);
//        objectPool.releaseObject(obj4);
//        objectPool.releaseObject(obj5);
    }
}
