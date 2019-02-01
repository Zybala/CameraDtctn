package wtk.cameradtctn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class Main extends AppCompatActivity {

    private static String TAG= "LogActivity";

    static{
        if(OpenCVLoader.initDebug()){
            Log.d(TAG, "OK");
        }
        else{
            Log.d(TAG, "NOT OK");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
