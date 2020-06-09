package dev.mufa.bahasapemrograman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import dev.mufa.bahasapemrograman.adapter.AdapterBhs;
import dev.mufa.bahasapemrograman.modal.BahasaPemrograman;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_bhs;
    private AdapterBhs adapterBhs;
    private List<BahasaPemrograman> bahasaPemrogramens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_bhs = findViewById(R.id.rv_bhs);

        BahasaPemrograman php = new BahasaPemrograman();
        php.setTitle("PHP");
        php.setDes(getResources().getString(R.string.php_des));
//        php.setImg(getResources().getDrawable(R.drawable.php));
        php.setImg(R.drawable.php);
        bahasaPemrogramens.add(php);

        BahasaPemrograman cPlus = new BahasaPemrograman();
        cPlus.setTitle("C++");
        cPlus.setDes(getResources().getString(R.string.c_plus));
//        cPlus.setImg(getResources().getDrawable(R.drawable.c));
        cPlus.setImg(R.drawable.c);
        bahasaPemrogramens.add(cPlus);

        BahasaPemrograman delphi = new BahasaPemrograman();
        delphi.setTitle("Delphi");
        delphi.setDes(getResources().getString(R.string.delphi));
//        delphi.setImg(getResources().getDrawable(R.drawable.delphi));
        delphi.setImg(R.drawable.delphi);
        bahasaPemrogramens.add(delphi);

        BahasaPemrograman html = new BahasaPemrograman();
        html.setTitle("HTML");
        html.setDes(getResources().getString(R.string.html));
//        html.setImg(getResources().getDrawable(R.drawable.html));
        html.setImg(R.drawable.html);
        bahasaPemrogramens.add(html);

        BahasaPemrograman java = new BahasaPemrograman();
        java.setTitle("Java");
        java.setDes(getResources().getString(R.string.java));
//        java.setImg(getResources().getDrawable(R.drawable.java));
        java.setImg(R.drawable.java);
        bahasaPemrogramens.add(java);

        BahasaPemrograman css = new BahasaPemrograman();
        css.setTitle("CSS");
        css.setDes(getResources().getString(R.string.css));
//        css.setImg(getResources().getDrawable(R.drawable.css));
        css.setImg(R.drawable.css);
        bahasaPemrogramens.add(css);

        BahasaPemrograman javascript = new BahasaPemrograman();
        javascript.setTitle("JavaScript");
        javascript.setDes(getResources().getString(R.string.javascript));
//        javascript.setImg(getResources().getDrawable(R.drawable.javascript));
        javascript.setImg(R.drawable.javascript);
        bahasaPemrogramens.add(javascript);

        BahasaPemrograman python = new BahasaPemrograman();
        python.setTitle("Python");
        python.setDes(getResources().getString(R.string.python));
//        python.setImg(getResources().getDrawable(R.drawable.python));
        python.setImg(R.drawable.python);
        bahasaPemrogramens.add(python);

        BahasaPemrograman ruby = new BahasaPemrograman();
        ruby.setTitle("Ruby");
        ruby.setDes(getResources().getString(R.string.ruby));
//        ruby.setImg(getResources().getDrawable(R.drawable.ruby));
        ruby.setImg(R.drawable.ruby);
        bahasaPemrogramens.add(ruby);

        BahasaPemrograman visual_basic = new BahasaPemrograman();
        visual_basic.setTitle("Visual Basic");
        visual_basic.setDes(getResources().getString(R.string.visual_basic));
//        visual_basic.setImg(getResources().getDrawable(R.drawable.visualbasic));
        visual_basic.setImg(R.drawable.visualbasic);
        bahasaPemrogramens.add(visual_basic);

        adapterBhs = new AdapterBhs(MainActivity.this,bahasaPemrogramens);
        rv_bhs.setAdapter(adapterBhs);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profil) {
//            Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this,ProfilActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
