package se.patrikerdes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HostFromUrl {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = in.readLine()) != null) {
            try {
                String host = new URL(s).getHost();
                System.out.println(host);
            }
            catch(MalformedURLException ex) {
                // Ignore lines that are not URLs
            }
        }
    }
}
