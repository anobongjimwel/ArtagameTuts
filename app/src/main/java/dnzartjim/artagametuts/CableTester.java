package dnzartjim.artagametuts;

import android.util.Log;
import android.widget.ImageView;
import android.widget.Spinner;

public class CableTester {
    private Spinner cableChooser;
    private ImageView LEDindicator;
    private int activeLED = R.drawable.tled_a;
    private int inactiveLED = R.drawable.tled_ia;
    public CableTester(final Spinner cableChooser, final ImageView LEDindicator) {
        this.cableChooser = cableChooser;
        this.LEDindicator = LEDindicator;
    }


    public void activateLED() {
        LEDindicator.setImageResource(activeLED);
    }

    public void deactivateLED() {
        LEDindicator.setImageResource(inactiveLED);
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
