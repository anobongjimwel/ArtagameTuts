package dnzartjim.artagametuts;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Spinner;

public class CableTester {
    private Spinner cableChooser;
    private ImageView LEDindicator;
    Bitmap activeLEDbtmp;
    Bitmap inactiveLEDbtmp;
    public CableTester(final Spinner cableChooser, final ImageView LEDindicator) {
        this.cableChooser = cableChooser;
        this.LEDindicator = LEDindicator;
        activeLEDbtmp = BitmapFactory.decodeResource(cableChooser.getContext().getResources(), R.drawable.tled_a);
        inactiveLEDbtmp = BitmapFactory.decodeResource(cableChooser.getContext().getResources(), R.drawable.tled_ia);
    }


    public void activateLED() {
        LEDindicator.setImageBitmap(activeLEDbtmp);
    }

    public void deactivateLED() {
        LEDindicator.setImageBitmap(inactiveLEDbtmp);
    }

    public String getCableColor() {
        if (cableChooser.getSelectedItem().toString().equals("NA") ||
                cableChooser.getSelectedItem().toString().equals("Brn") ||
                cableChooser.getSelectedItem().toString().equals("WBrn") ||
                cableChooser.getSelectedItem().toString().equals("O") ||
                cableChooser.getSelectedItem().toString().equals("WO") ||
                cableChooser.getSelectedItem().toString().equals("Blu") ||
                cableChooser.getSelectedItem().toString().equals("WBlu") ||
                cableChooser.getSelectedItem().toString().equals("G") ||
                cableChooser.getSelectedItem().toString().equals("WG")
                ) {
            return cableChooser.getSelectedItem().toString();
        } else {
            return null;
        }
    }

    public static void deactivateLEDS(CableTester[][] cableTesters) {
        for (CableTester[] rj45 : cableTesters) {
            for (CableTester pin : rj45) {
                pin.deactivateLED();
            }
        }
    }

    public static void activateLEDS(CableTester[][] cableTesters) {
        for (CableTester[] rj45 : cableTesters) {
            for (CableTester pin : rj45) {
                pin.activateLED();
            }
        }
    }

    public static void testPin(CableTester basePin, CableTester[] pinsTofind) {
        if (!basePin.getCableColor().equals("NA")) {
            for (CableTester pin : pinsTofind) {
                if (pin.getCableColor()==basePin.getCableColor()) {
                    basePin.activateLED();
                    pin.activateLED();
                }
            }
        }
    }

    public static boolean checkDuplicateCables(CableTester RJ45A[], CableTester RJ45B[], String cableColor) {
        Boolean duplicatesPresent = false;
        if (!cableColor.equals("NA")) {

            int aCounter = 0;
            int bCounter = 0;
            for (CableTester pin : RJ45A) {
                if (pin.getCableColor().equals(cableColor)) {
                    aCounter += 1;
                }
            }
            for (CableTester pin : RJ45B) {
                if (pin.getCableColor().equals(cableColor)) {
                    bCounter += 1;
                }
            }
            if (aCounter > 1 || bCounter > 1) {
                duplicatesPresent = true;
            } else {
                duplicatesPresent = false;
            }
        }
        return duplicatesPresent;
    }
}
