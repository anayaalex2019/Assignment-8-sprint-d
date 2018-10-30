public class Main {

    public static double workEffort;

    public static void main(String[] args) {
        //add up effort values on chart

        workEffort = 1590.0;

        calcCap(8,3,30);
        calcCap(9,3,30);
        calcCap(10,3,30);
        calcCap(11,3,30);
        calcCap(8,4,30);;
        calcCap(8,5,30);
        calcCap(8,6,30);
        System.out.println(" ");
        calcCap(8,3,35);
        calcCap(9,3,35);
        calcCap(10,3,35);
        calcCap(11,3,35);
        calcCap(8,4,35);
        calcCap(8,5,35);
        calcCap(8,6,35);
        System.out.println(" ");
        calcCap(8,3,40);
        calcCap(9,3,40);
        calcCap(10,3,40);
        calcCap(11,3,40);
        calcCap(8,4,40);
        calcCap(8,5,40);
        calcCap(8,6,40);

    }

    public static void calcCap(int devs, int weeks, int hrswk) {
        double capacity = (workEffort) / (devs * weeks * hrswk);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %.2f%% of capacity.\n" ,devs,weeks,hrswk,(capacity*100));

    }
}
