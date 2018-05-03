package software.addigma.chooseyourtheather;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnXXI;
    Button mBtnCGV;
    Button mBtnMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnXXI = (Button) findViewById(R.id.btn_xxi);
        mBtnCGV = (Button) findViewById(R.id.btn_cgv);
        mBtnMovie = (Button) findViewById(R.id.btn_choose_your_movie);

        mBtnXXI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openXXI("http://www.21cineplex.com/");
            }
        });
        mBtnCGV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCGV("https://www.cgv.id/");
            }
        });
        mBtnMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Movie.class);
                startActivity(i);
            }
        });
    }

    private void openXXI(String url){
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
    private void openCGV(String url){
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}
