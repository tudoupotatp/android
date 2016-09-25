package es.source.code.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class SCOSEntry extends AppCompatActivity {
//        private ImageView first_img=null;
    float x1=0;
    float x2=0;
    float y1=0;
    float y2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo);
        setContentView(R.layout.entry);

//        first_img=(ImageView)findViewById(R.id.first_img);
//        first_img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SCOSEntry.this,MainScreen.class);
//                startActivity(intent);
//            }
//        })
       }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            x1=event.getX();
            y1=event.getY();
        }
        if (event.getAction()==MotionEvent.ACTION_UP){
            x2=event.getX();
            y2=event.getY();
            if (x1-x2>50){
                Intent intent=new Intent(SCOSEntry.this,MainScreen.class);
                intent.putExtra("key1","FromEntry");
                startActivity(intent);
            }
        }

        return super.onTouchEvent(event);
    }
}
