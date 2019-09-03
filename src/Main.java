public class Main {
    public static void sortSelection(double[] array){
        double max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        double[] arrayNumber = new double[100000];
        for(int i = 0; i < arrayNumber.length; i++){
            arrayNumber[i] = Math.random()*100000;
        }
        stopWatch.start();
        sortSelection(arrayNumber);
        stopWatch.stop();
        System.out.print("Time = " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
