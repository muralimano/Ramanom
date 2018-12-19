package com.muralimanohar.ramanom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    Button registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerbtn = findViewById(R.id.reister_id);
        registerForContextMenu(registerbtn);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webView.loadUrl("http://ramanom.com/");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater infalter = getMenuInflater();
        infalter.inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

//        MenuInflater inflater1 = getMenuInflater();
////        inflater1.inflate(R.menu.context_menu,menu);

        getMenuInflater().inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home_id:
                Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
                break;
            case R.id.about_id:
                Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
                break;
            case R.id.gallery_id:
//                Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show();
//                String url = "http://www.google.com";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
                Intent i = new Intent(MainActivity.this, oceansoftware.class);
                startActivity(i);
                break;
        }

        return super.onContextItemSelected(item);
    }
}
