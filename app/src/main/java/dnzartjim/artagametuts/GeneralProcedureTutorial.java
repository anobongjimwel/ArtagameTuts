package dnzartjim.artagametuts;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class GeneralProcedureTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_procedure_tutorial);

        VideoView vvPreparingCables = findViewById(R.id.vvPreparingCables);
        MediaController mcVV = new MediaController(this);
        Uri uriPreparingCables = Uri.parse("android.resource://" + getPackageName() + "/raw/preparecable");
        vvPreparingCables.setVideoURI(uriPreparingCables);
        vvPreparingCables.setMediaController(mcVV);
        vvPreparingCables.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f, 0f);
            }
        });
        vvPreparingCables.start();
    }
}
