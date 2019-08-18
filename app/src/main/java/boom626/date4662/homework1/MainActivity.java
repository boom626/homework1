package boom626.date4662.homework1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t =  Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT);  //obj toast
        t.show();

        Toast t2 =  Toast.makeText(MainActivity.this,"Android",Toast.LENGTH_SHORT);  //obj toast
        t2.show();
    }
}
