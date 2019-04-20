package cniao5.com.cniao5shop;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class CniaoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
