package vn.edu.ntu.quocvuong.ngoquocvuong_59133174_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate called");

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","onStart called");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf=new SimpleDateFormat("HH:mm:ss");
        String StrDate =spf.format(new Date());
        txtTG.setText(StrDate);
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle","onResume called");
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","onPause called");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","onStop called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","onRestart called");
        Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
    
}
