package cn.edu.sdwu.android.classroom.sn170507180220;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class lwxActivity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lwx_layout01);

        Button button=(Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView) findViewById(R.id.lwx_iv);

        button.setOnClickListener(new MyClickListener());

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                WallpaperManager wallpaperManager=(WallpaperManager) getSystemService(WALLPAPER_SERVICE);
                try {
                    wallpaperManager.setResource(R.raw.img);
                }catch (Exception e){
                    Log.e(lwxActivity01.class.toString(),e.toString());
                }


                return true;
            }
        });


    }
    class MyClickListener implements View.OnClickListener{
        public void onClick(View view){
            Log.i(LwxActivity01.class.toString(),"button click");
        }
    }
}