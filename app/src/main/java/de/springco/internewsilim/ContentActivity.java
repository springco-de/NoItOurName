package de.springco.internewsilim;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends YouTubeBaseActivity {

    private static final String TAG = "MainActivity";
    TextView v_tag, v_title, v_content;

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Log.d(TAG, "onCreate: Starting");

        Intent intent = getIntent();

        final int index = intent.getIntExtra("index",0);
        final String intentTag = intent.getStringExtra("tag");
        final String intentTitle = intent.getStringExtra("title");
        final String intentContent = intent.getStringExtra("content");
        final String intentURL = intent.getStringExtra("url");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setAlpha(0.25f);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, intentURL);
                startActivity(Intent.createChooser(shareIntent, "Поделиться..."));
            }
        });



        v_tag = (TextView) findViewById(R.id.v_tags);
        v_title = (TextView) findViewById(R.id.v_title);
        v_content = (TextView) findViewById(R.id.v_content);

        v_tag.setText(intentTag);
        v_title.setText(intentTitle);
        v_content.setText(intentContent);

        v_content.setMovementMethod(new ScrollingMovementMethod());

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "Done initializing.");
                List<String> videoList = new ArrayList<String>();
                videoList.add("TJ2Eg8M6oN4");
                videoList.add("HsPZhEjhqjs");
                videoList.add("YjN7kiPNBE8");
                videoList.add("9IcWCoBhA6Q");
                videoList.add("Ukr-2jPP2b4");
                videoList.add("Lu_ndka-Kr0");
                videoList.add("-bm5IZ2Fg8c");
                videoList.add("ncNNQPEM3s4");
                videoList.add("0H8f9EfylFU");
                videoList.add("eGGMqEhiNM8");
                youTubePlayer.loadVideo(videoList.get(index));
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "Failed to initialize .");
            }
        };

        Log.d(TAG, "Initializing Youtube Player");
        youTubePlayerView.initialize(YoutubeConfig.getApiKey(), listener);
    }
}
