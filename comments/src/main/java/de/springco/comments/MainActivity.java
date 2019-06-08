package de.springco.comments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    // This url contains the content of the article excluding web page's
    // header, footer, title, comments
    private static String url = "https://www.google.com";

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.web_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launching facebook comments activity
                Intent intent = new Intent(MainActivity.this, FbCommentsActivity.class);

                // passing the article url
                //intent.putExtra("url", "http://www.androidhive.info/2016/06/android-firebase-integrate-analytics/");
                intent.putExtra("url", "https://www.facebook.com/azattyk/videos/615215705542701/");
                startActivity(intent);
            }
        });

        // loading web page
        webView.loadUrl(url);
    }
}
