package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialisationMain {

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream stream = new FileOutputStream("done.ser");
            objectOutputStream = new ObjectOutputStream(stream);
            Employee employee = new Employee();
//            employee.setFun("funny");
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                assert objectOutputStream != null;
                objectOutputStream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("done.ser");
            ObjectInputStream inputStream = new ObjectInputStream(
                    fileInputStream);
            Object readObject = inputStream.readObject();
            Employee employee = (Employee) readObject;
            System.out.println(employee.getOne() + " " + employee.getOnew() + " " + employee.getFun());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
