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
        Date getdate = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date = formatter.format(getdate);
        this.Receiver = Receiver;
        this.ProductName = ProductName;
        this.size = size;
    }
Product(){}
    @Override
    public String toString() {
        return " Package {" +
                " Receiver :'" + Receiver + '\'' +
                ", ProductName :'" + ProductName + '\'' +
                ", size :'" + size + '\'' +
                ", date :'" + date + '\'' +
                '}';
    }
}

