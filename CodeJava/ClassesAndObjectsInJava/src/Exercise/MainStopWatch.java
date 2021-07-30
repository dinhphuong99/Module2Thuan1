package Exercise;

public class MainStopWatch {

    public static int[] selectionSort(int ...arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("\nTrước: ");
        for (int i = 0; i <10000; i++) {
            array[i] = (int)Math.floor(Math.random()*1000 + 10);
        }

        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.print("Bắt đầu: " );
        stopWatch.start();

        System.out.println("\nSau: ");
        for (int value : selectionSort(array)) {
            System.out.print(value + " ");
        }
        stopWatch.end();
        System.out.print("\nKết Thúc: ");
        System.out.println("\nLượng thời gian đã trôi qua: " + stopWatch.getElapsedTime(stopWatch.getStartTime(),
                stopWatch.getEndTime()));
    }
}
