package PracticePrograms;//Reading data from .CSV file
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputCSVFileHandling {
    public static void main(String[] args) {
            String csvFile = "G:\\Study\\Reader.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try
            {
                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null)
                {
                    // use comma as separator
                    String[] country = line.split(cvsSplitBy);
                    System.out.println();
                    for(int i=0;i< country.length;i++)
                    {
                      System.out.print(country[i]+ " ");
                    }

                }

            }

            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }


