package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Alc_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_page);

        WebView view=(WebView)findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        String url= "https://andela.com/alc/";
        view.setWebViewClient(new myWebViewClient());
        view.loadUrl(url);

    }

    private class myWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return false;
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
            handler.proceed();
        }


    }



}
