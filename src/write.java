import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class write implements Runnable{
    CList ob;
    write(CList ob){
        this.ob=ob;
    }
    @Override
    public void run() {
        try{
            FileOutputStream fout=new FileOutputStream("backup");
            ObjectOutputStream oos=new ObjectOutputStream(fout);
            oos.writeObject(ob);
        }
        catch(Exception e){
            System.out.println("Error in writing "+e);
        }
    }
}
