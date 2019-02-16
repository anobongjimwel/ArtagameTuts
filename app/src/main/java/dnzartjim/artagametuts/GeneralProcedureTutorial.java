package dnzartjim.artagametuts;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

public class GeneralProcedureTutorial extends AppCompatActivity {
    MediaController mc[] = new MediaController[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int l=0; l<6; l++) {
            mc[l] = new MediaController(GeneralProcedureTutorial.this);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_procedure_tutorial);
        final VideoView vvPreparingCables = findViewById(R.id.vvPreparingCables);
        Uri uriPreparingCables = Uri.parse("android.resource://" + getPackageName() + "/raw/preparecable");
        vvPreparingCables.setVideoURI(uriPreparingCables);
        setControls(vvPreparingCables, mc[0]);

        VideoView vvCutFirstSide = findViewById(R.id.vvCutFirstSide);
        Uri uriCutFirstSide = Uri.parse("android.resource://" + getPackageName() + "/raw/cutfirstside");
        vvCutFirstSide.setVideoURI(uriCutFirstSide);
        setControls(vvCutFirstSide, mc[1]);

        VideoView vvCutSecondSide = findViewById(R.id.vvCutSecondSide);
        Uri uriCutSecondSide = Uri.parse("android.resource://" + getPackageName() + "/raw/cutsecondside");
        vvCutSecondSide.setVideoURI(uriCutSecondSide);
        setControls(vvCutFirstSide, mc[2]);


        VideoView vvPutIntoRJ45 = findViewById(R.id.vvPutIntoRJ45);
        Uri uriPutIntoRJ45 = Uri.parse("android.resource://" + getPackageName() + "/raw/putintorj45");
        vvPutIntoRJ45.setVideoURI(uriPutIntoRJ45);
        setControls(vvPutIntoRJ45, mc[3]);

        VideoView vvCrimpBothSides = findViewById(R.id.vvCrimpBothSides);
        Uri uriCrimpBothSides = Uri.parse("android.resource://" + getPackageName() + "/raw/crimpbothsides");
        vvCrimpBothSides.setVideoURI(uriCrimpBothSides);
        vvCrimpBothSides.setVideoPath("android.resource://" + getPackageName() + "/raw/crimpbothsides");
        setControls(vvCrimpBothSides, mc[4]);

        VideoView vvTestCable = findViewById(R.id.vvTestCable);
        Uri uriTestCable = Uri.parse("android.resource://" + getPackageName() + "/raw/putintorj45");
        vvTestCable.setVideoURI(uriTestCable);
        setControls(vvTestCable, mc[5]);

        Button btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setControls(final VideoView videoView, final MediaController mc) {
        videoView.setMediaController(mc);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mc.setAnchorView(videoView);
                mp.setVolume(0f, 0f);
            }
        });
    }
}
