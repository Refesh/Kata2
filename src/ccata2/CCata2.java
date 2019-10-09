package ccata2;

public class CCata2 {

    public static void main(String[] args) {
        Histogram hist = new Histogram(1,2,3,-7,1,2,-4,3,3,2,-3);
        new ConsoleHistogramDisplay().show(hist);
    }
    
}
