package ua.kiev.prog;

import java.io.*;
import java.util.*;

public class FileOrdersDAO implements OrdersDAO {

    private String path; // path to source file

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> res = new ArrayList<Order>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            try {
                String line;
                String[] parts;

                while ((line = br.readLine()) != null) {
                    parts = line.split(";");

                    res.add(new Order(parts[0].trim(), parts[1].trim(),
                            parts[2].trim(), Double.parseDouble(parts[3].trim())));
                }
            } finally {
                br.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return res;
    }
}



