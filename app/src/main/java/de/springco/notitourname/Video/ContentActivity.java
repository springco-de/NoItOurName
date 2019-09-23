package de.springco.notitourname.Video;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

import de.springco.notitourname.R;
import de.springco.notitourname.YoutubeConfig;

public class ContentActivity extends YouTubeBaseActivity {

    TextView v_tag, v_title, v_content;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent = getIntent();

        final int index = intent.getIntExtra("index",0);
        final String intentTag = intent.getStringExtra("tag");
        final String intentTitle = intent.getStringExtra("title");
        final String intentContent = intent.getStringExtra("content");
        final String intentURL = intent.getStringExtra("url");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setAlpha(0.25f);
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
                List<String> videoList = new ArrayList<String>();
                videoList.add("oF0EvblRUq4"); //https://www.youtube.com/watch?v=oF0EvblRUq4&feature=youtu.be
                videoList.add("9cuR7UsR4ew"); //https://www.youtube.com/watch?v=9cuR7UsR4ew&feature=youtu.be
                videoList.add("as6lG3GTARc"); //https://www.youtube.com/watch?v=as6lG3GTARc&feature=youtu.be
                videoList.add("GaWXnOyQi1I"); //https://www.youtube.com/watch?v=GaWXnOyQi1I&feature=youtu.be
                videoList.add("9O0bj2GcF2E"); //https://www.youtube.com/watch?v=9O0bj2GcF2E&feature=youtu.be
                videoList.add("AeGpoTyzBrM"); //https://www.youtube.com/watch?v=AeGpoTyzBrM&feature=youtu.be
                videoList.add("HUvhnRwtsFU"); //https://www.youtube.com/watch?v=HUvhnRwtsFU&feature=youtu.be
                /*videoList.add("ncNNQPEM3s4");
                videoList.add("0H8f9EfylFU");
                videoList.add("eGGMqEhiNM8");*/
                youTubePlayer.loadVideo(videoList.get(index));
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        youTubePlayerView.initialize(YoutubeConfig.getApiKey(), listener);
    }
}
