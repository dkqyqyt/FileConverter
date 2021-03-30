import FileConverter.TxtConverter;
import org.apache.poi.ss.formula.functions.T;

public class Main {
    public static void main(String[] args) {
        TxtConverter txtConverter = new TxtConverter();

        System.out.println(txtConverter.convertFile());
    }

}
