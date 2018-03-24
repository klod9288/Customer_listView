package srongklod.plantseconimic.customer_listview;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Customer ListView");
        setSupportActionBar(toolbar);

        FloatingActionButton fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,"Replace with your own action",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();

            }
        });

        this.setTitle("Customer ListView");

        String[] name = {"Stevegod","Stevegod2","Stevegod3","Stevegod4","Stevegod5","stevegod6"};
        String[] phones = {"0123456789","0123456789","0123456789","0123456789","0123456789","0123456789"};

        int[] icons = {R.drawable.female1,R.drawable.female2,R.drawable.female3,R.drawable.male1,
                R.drawable.male2,R.drawable.male3};

        ArrayList<MyItem> arrayList = new ArrayList<>();
        for (int i=0;i<name.length;i++) {
            arrayList.add(new MyItem(icons[i], name[i], phones[i], false));
        }

        ListView listView = findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(getBaseContext(), R.layout.item_layout,arrayList);
        listView.setAdapter(myAdapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = "";
                for (MyItem item : myAdapter.getCheckedItems()) {
                    if (item.ismIsChecked()) {
                        if (!str.equals("")) {
                            str += "\n";
                        }
                        str += item.getmTextLine1();
                    }

                }
                str = "รายการที่เลือก: \n"+str;
                Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG).show();

            }
        });

    }//Main Method


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_setting) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}//Main Class
