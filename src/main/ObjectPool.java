package main;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    private List<FiveObjectClass> availableObjects;
    private List<FiveObjectClass> inUseObjects;
    private int maxPoolSize;

    public ObjectPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        this.availableObjects= new ArrayList<>();
        this.inUseObjects= new ArrayList<>();
        this.initializePool();
    }

    private void initializePool(){
        for (int i = 0; i < this.maxPoolSize; i++)
            this.availableObjects.add(new FiveObjectClass());
    }

    public synchronized FiveObjectClass acquireObject(){
        if(this.availableObjects.isEmpty())
            return null;
        FiveObjectClass object = this.availableObjects.remove(this.availableObjects.size() - 1);
        this.inUseObjects.add(object);
        return object;
    }

    public synchronized void releaseObject(FiveObjectClass object){
        object.reset();
        this.inUseObjects.remove(object);
        this.availableObjects.add(object);
    }
}
