package ccata2;

public class ConsoleHistogramDisplay implements HistogramDisplay{

    @Override
    public void show(Histogram hist) {
        for (Integer value : hist) {
            System.out.println(value + " " + hist.getCount(value));
        }
    }
    
}
