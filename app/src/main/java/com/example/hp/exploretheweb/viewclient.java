package com.example.hp.exploretheweb;

import android.webkit.WebView;
import android.webkit.WebViewClient;



public class viewclient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return  true;
    }
}
