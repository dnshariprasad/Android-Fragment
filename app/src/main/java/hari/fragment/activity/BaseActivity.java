package hari.fragment.activity;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kvanadev5 on 26/01/16.
 */
public class BaseActivity extends AppCompatActivity {


    public int getColorWrapper(int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return getColor(id);
        } else {
            return getResources().getColor(id);
        }
    }
}
