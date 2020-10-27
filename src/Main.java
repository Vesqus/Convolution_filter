import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Image img = new Image("F.pbm");
        img.printImageProperties();
        int[] arr = {1, 0, 0,
                     0, 0, 0,
                     0, 0, 0};
        Filter filter = new Filter(arr);
        ConvolutionFiltering cf1 = new ConvolutionFiltering(img, filter);
        cf1.filter();
    }
}
