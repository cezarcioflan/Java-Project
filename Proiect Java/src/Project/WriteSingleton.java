package Project;

import java.io.*;
//import java.util.List;

public class WriteSingleton implements AutoCloseable {

    private static WriteSingleton writeSingleton = null;

    private BufferedWriter bufferedWriterAuthors = null;
    private BufferedWriter bufferedWriterLibraries = null;
    private BufferedWriter bufferedWriterCustomers = null;
    private BufferedWriter bufferedWriterEmployees = null;
    private BufferedWriter bufferedWriterSFBooks = null;
    private BufferedWriter bufferedWriterFantasyBooks = null;
    private BufferedWriter bufferedWriterNonFictionBooks = null;
    private BufferedWriter bufferedWriterPublishingHouses = null;


    public void output(Object o) {

        if(o.getClass().getSimpleName().toString() == Authors.class.getSimpleName().toString()) {
            try {

                if(bufferedWriterAuthors == null)
                    bufferedWriterAuthors = new BufferedWriter(new FileWriter("authors.csv"));

                bufferedWriterAuthors.write(o.toString() + "\n");


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == Libraries.class.getSimpleName().toString())
        {
                try {

                    if(bufferedWriterLibraries == null)
                        bufferedWriterLibraries = new BufferedWriter(new FileWriter("libraries.csv"));

                    bufferedWriterLibraries.write(o.toString() + "\n");


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        else if(o.getClass().getSimpleName().toString() == Customers.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterCustomers == null)
                    bufferedWriterCustomers = new BufferedWriter(new FileWriter("customers.csv"));

                bufferedWriterCustomers.write(o.toString() + "\n");


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == Employees.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterEmployees == null)
                    bufferedWriterEmployees = new BufferedWriter(new FileWriter("employees.csv"));

                bufferedWriterEmployees.write(o.toString() + "\n");


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == SFBooks.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterSFBooks == null)
                    bufferedWriterSFBooks = new BufferedWriter(new FileWriter("SFBooks.csv"));

                bufferedWriterSFBooks.write(o.toString() + "\n");


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == FantasyBooks.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterFantasyBooks == null)
                    bufferedWriterFantasyBooks = new BufferedWriter(new FileWriter("FantasyBooks.csv"));

                bufferedWriterFantasyBooks.write(o.toString() + "\n");


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == NonFictionBooks.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterNonFictionBooks == null)
                    bufferedWriterNonFictionBooks = new BufferedWriter(new FileWriter("NonFictionBooks.csv"));

                bufferedWriterNonFictionBooks.write(o.toString() + "\n");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(o.getClass().getSimpleName().toString() == PublishingHouses.class.getSimpleName().toString())
        {
            try {

                if(bufferedWriterPublishingHouses == null)
                    bufferedWriterPublishingHouses = new BufferedWriter(new FileWriter("PublishingHouse.csv"));

                bufferedWriterPublishingHouses.write(o.toString() + "\n");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void close() throws IOException {
        this.bufferedWriterAuthors.close();
        this.bufferedWriterLibraries.close();
        this.bufferedWriterCustomers.close();
        this.bufferedWriterEmployees.close();
        this.bufferedWriterSFBooks.close();
        this.bufferedWriterFantasyBooks.close();
        this.bufferedWriterNonFictionBooks.close();
        this.bufferedWriterPublishingHouses.close();
    }

    public static WriteSingleton getWriteSingleton() {

        if(writeSingleton == null)
            writeSingleton = new WriteSingleton();

        return writeSingleton;
    }
}
