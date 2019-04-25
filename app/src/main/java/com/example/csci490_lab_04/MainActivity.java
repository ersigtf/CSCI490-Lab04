package com.example.csci490_lab_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    //private Button taskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("url" , urlMethod("https://jsonplaceholder.typicode.com/users"));




    }
    public String urlMethod(String url){
        try {
            URL website = new URL(url);
            URLConnection connection = website.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()
            ));
            return reader.readLine();

        }
        catch(MalformedURLException mue) {

        }
        catch(IOException io) {

        }


        return null;
    }
}
