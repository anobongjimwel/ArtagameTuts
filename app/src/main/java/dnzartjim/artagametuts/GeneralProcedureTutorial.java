package dnzartjim.artagametuts;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        VideoView vvCutSecondSide = findViewById(R.id.vvCutSecondSide);
        Uri uriCutSecondSide = Uri.parse("android.resource://" + getPackageName() + "/raw/cutfirstside");
        vvCutSecondSide.setVideoURI(uriCutSecondSide);
        vvCutSecondSide.setMediaController(mcVV);
        mutePlayerAtFirst(vvCutSecondSide);


        VideoView vvPutIntoRJ45 = findViewById(R.id.vvPutIntoRJ45);
        Uri uriPutIntoRJ45 = Uri.parse("android.resource://" + getPackageName() + "/raw/putintorj45");
        vvPutIntoRJ45.setVideoURI(uriPutIntoRJ45);
        vvPutIntoRJ45.setMediaController(mcVV);
        mutePlayerAtFirst(vvPutIntoRJ45);

        VideoView vvCrimpBothSides = findViewById(R.id.vvCrimpBothSides);
        Uri uriCrimpBothSides = Uri.parse("android.resource://" + getPackageName() + "/raw/putintorj45");
        vvCrimpBothSides.setVideoURI(uriCrimpBothSides);
        vvCrimpBothSides.setMediaController(mcVV);
        mutePlayerAtFirst(vvCrimpBothSides);

        VideoView vvTestCable = findViewById(R.id.vvTestCable);
        Uri uriTestCable = Uri.parse("android.resource://" + getPackageName() + "/raw/putintorj45");
        vvTestCable.setVideoURI(uriTestCable);
        vvTestCable.setMediaController(mcVV);
        mutePlayerAtFirst(vvTestCable);

        Button btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
