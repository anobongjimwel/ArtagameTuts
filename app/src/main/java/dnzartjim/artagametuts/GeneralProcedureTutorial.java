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
        MediaController mcVV = new MediaController(this);

        VideoView vvPreparingCables = findViewById(R.id.vvPreparingCables);
        Uri uriPreparingCables = Uri.parse("android.resource://" + getPackageName() + "/raw/preparecable");
        vvPreparingCables.setVideoURI(uriPreparingCables);
        vvPreparingCables.setMediaController(mcVV);
        mutePlayerAtFirst(vvPreparingCables);

        VideoView vvCutFirstSide = findViewById(R.id.vvCutFirstSide);
        Uri uriCutFirstSide = Uri.parse("android.resource://" + getPackageName() + "/raw/cutfirstside");
        vvCutFirstSide.setVideoURI(uriCutFirstSide);
        vvCutFirstSide.setMediaController(mcVV);
        mutePlayerAtFirst(vvCutFirstSide);
    }

    private void mutePlayerAtFirst(VideoView videoview) {
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f, 0f);
            }
        });
    }
}
