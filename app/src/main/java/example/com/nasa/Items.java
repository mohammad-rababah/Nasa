package example.com.nasa;

import android.support.annotation.DrawableRes;

/**
 * Created by Mohammad on 22/04/2016.
 */
public class Items {
    @DrawableRes
    int image;
    String title;

    public Items(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
