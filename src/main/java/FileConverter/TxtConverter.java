package FileConverter;

import org.json.JSONObject;

import java.io.*;

public class TxtConverter implements Converter{

    @Override
    public JSONObject convertFile() {
        try {
            File file = new File("./test.txt");
            FileReader file_reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(file_reader);

            String line = "";
            String[] textList = {};
            JSONObject jsonObject = new JSONObject();

            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                textList = line.split(" ");
//                for (String s : list) {
//                    System.out.println(s);
//                }
            }

            for (String data : textList) {
                if (data.charAt(0) == '"') {
                    jsonObject.put("a2",data.substring(1,data.length()));
                } else {
                    jsonObject.put("a1",data);
                }
            }

            file_reader.close();
            return jsonObject;
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return null;
    }
}
