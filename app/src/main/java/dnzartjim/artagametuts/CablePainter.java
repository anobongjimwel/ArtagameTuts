package dnzartjim.artagametuts;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.Spinner;

public class CablePainter {
    public static void paintCable(final Spinner spinner,ImageView imvCable) {
        final Bitmap black = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.black);
        final Bitmap brown = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.brown);
        final Bitmap whitebrown = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.whitebrown);
        final Bitmap green = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.green);
        final Bitmap whitegreen = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.whitegreen);
        final Bitmap orange = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.orange);
        final Bitmap whiteorange = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.whiteorange);
        final Bitmap blue = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.blue);
        final Bitmap whiteblue = BitmapFactory.decodeResource(spinner.getContext().getResources(), R.drawable.whiteblue);
        String cableColor = spinner.getSelectedItem().toString();
        switch (cableColor) {
            case "NA":
                imvCable.setImageBitmap(black);
                break;

            case "Brn":
                imvCable.setImageBitmap(brown);
                break;

            case "WBrn":
                imvCable.setImageBitmap(whitebrown);
                break;

            case "G":
                imvCable.setImageBitmap(green);
                break;

            case "WG":
                imvCable.setImageBitmap(whitegreen);
                break;

            case "O":
                imvCable.setImageBitmap(orange);
                break;

            case "WO":
                imvCable.setImageBitmap(whiteorange);
                break;

            case "Blu":
                imvCable.setImageBitmap(blue);
                break;

            case "WBlu":
                imvCable.setImageBitmap(whiteblue);
                break;

            default:
                break;
        }
    }
}
