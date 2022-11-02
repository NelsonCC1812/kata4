package kata4;

import java.io.File;

public class Kata4 {
    public static void main(String[] args) {

        Histogram<String> histogram = new Histogram<String>();
        Iterable<String> items = new EmailLoader(new FileLoader(new File("email.txt"))).items();

        for (String email : items)
            histogram.increment(email);

        HistogramDisplay hDisplay = new HistogramDisplay(histogram, "Histograma");
        hDisplay.execute();
    }
}