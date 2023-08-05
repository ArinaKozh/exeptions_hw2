public class task_2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        int d = 0;
        int n = 8;
        try {
            double catchedRes1 = intArray[n] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         } catch(IndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
         }
         
    }
}
