package java_study;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount(){
        return numInstances;
    }

    private static void addInstace(){
        numInstances++;
    }

    InstanceCounter(){
        InstanceCounter.addInstace();
    }

    public static void main(String[] arguments){
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 200; i++){
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
