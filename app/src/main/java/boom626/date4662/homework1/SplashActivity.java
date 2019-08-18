package boom626.date4662.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //todo: โค้ดที่ต้องการให้ทำงานหลังจาก delay ครบ 3 วินาที
                Intent intent = new Intent(SplashActivity.this ,  MainActivity.class); //เชื่อมไปหน้าอื่น
                // Context=บริบท เอาชื่อคลาสที่ทำงานยุ ที่เปนActivityใส่ไป
                startActivity(intent);
                finish();  //เทียบเท่ากับการกด back สั่งที่หน้าใหนปิดหน้านั้น(SplashActivity) ไปหน้าที่สั่งไว้ให้ไป(MainActivity)

            }
        }, 3000); //3000 ms.=3s.


    }
}
