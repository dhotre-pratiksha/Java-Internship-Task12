import java.io.*;

public class StudentSerializationApp {

    public static void main(String[] args) {

        String fileName = "student.ser";

        Student student = new Student(
                101,
                "Pratiksha",
                "MCA",
                "mypassword123"
        );

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(student);
            System.out.println("Student object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Serialization error : " + e.getMessage());
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            Student restoredStudent = (Student) ois.readObject();

            System.out.println("\nDeserialized Student Object :");
            restoredStudent.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error : " + e.getMessage());
        }
    }
}
