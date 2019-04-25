package com.example.csci490_lab_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button taskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taskBtn = this.findViewById(R.id.taskBtn);
        WebView webview = new WebView(this);
        webview.setWebViewClient(new WebViewClient());
        setContentView(webview);
        webview.loadUrl("https://google.com");
        
    }
}
