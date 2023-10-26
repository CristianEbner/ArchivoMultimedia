package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = findViewById(R.id.videoView);

        String videoUrl = "https://drive.google.com/uc?export=download&id=15h-OQsLdoh9-Lv11TdWLtOSjWwYnjFfl";



        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);

        video.setVideoURI(Uri.parse(videoUrl));

        video.start();

    }
}