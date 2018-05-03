package software.addigma.chooseyourtheather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import software.addigma.chooseyourtheather.fragment.fragment1;

public class Movie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().
                    add(R.id.framecontainer, new fragment1(), fragment1.class.getSimpleName()).commit();
        }
    }
}
