package com.example.sai.designs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class list_mainActivity extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "John",
            "Valter",
            "Eawine",
            "Teddy",
            "Ives",
            "Alajos",
            "Gianluca",
            "Sain Juan"
    };

    Integer[] imgid={
            R.drawable.roundshape,
            R.drawable.roundshape_a,
            R.drawable.roundshape_c,
            R.drawable.roundshape_d,
            R.drawable.roundshape,
            R.drawable.roundshape_a,
            R.drawable.roundshape_c,
            R.drawable.roundshape_d,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.List_view);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
