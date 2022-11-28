import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Product {
    String date;
    String size;
    String Receiver;
    String ProductName;

    public Product(String Receiver, String size,  String ProductName) {
        //something unnecessary but fun to know:
        Date getdate = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date = formatter.format(getdate);
        this.Receiver = Receiver;
        this.size = size;
        this.ProductName = ProductName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "date='" + date + '\'' +
                ", size='" + size + '\'' +
                ", Receiver='" + Receiver + '\'' +
                ", ProductName='" + ProductName + '\'' +
                '}';
    }
}

