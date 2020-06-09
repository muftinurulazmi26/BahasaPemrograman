package dev.mufa.bahasapemrograman;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView img;
    private TextView tv_des,tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.img);
        tv_title = findViewById(R.id.tv_title);
        tv_des = findViewById(R.id.tv_des);

        Bundle bundle = this.getIntent().getExtras();

        if(bundle !=null)
        {
            //Do something here if data  received
            System.out.println("data ada");
//            byte[] b = bundle.getByteArray("img");
//            Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
//            img.setImageBitmap(bmp);
            tv_title.setText(bundle.getString("title"));
            tv_des.setText(bundle.getString("des"));
            if (tv_title.getText().toString().equals("PHP")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.php);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("C++")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.c);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("Delphi")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.delphi);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("HTML")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.html);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("Java")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.java);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("CSS")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.css);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("JavaScript")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.javascript);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("Python")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.python);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("Ruby")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ruby);
                img.setImageBitmap(bitmap);
            } else if (tv_title.getText().toString().equals("Visual Basic")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.visualbasic);
                img.setImageBitmap(bitmap);
            }
        }
        else
        {
            //Do something here if data not received
        }
    }
}
