package com.example.sai.designs;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.example.sai.designs.R.id.activity_list_main;
import static com.example.sai.designs.R.id.button;

public class ListActivity extends AppCompatActivity {

    /*AlertDialog alertDialog1;
    CharSequence[] values = {" Red "," Green "," Blue "," Yellow","Light grey","Grey","Cyan"};*/

    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        relativeLayout=(RelativeLayout)findViewById(R.id.vi);

    }


    public void conClick(View view) {
            Intent intent=new Intent(ListActivity.this,list_mainActivity.class);
            startActivity(intent);
        }


    public void ambClick(View v) {

        StatusActivity c=new StatusActivity();
        c.show(getFragmentManager(),"Dialog");
        /*StatusActivity c=new StatusActivity(ListActivity.this);
        c.show();*/
    }

    public void onclick(View V)
    {
        CreateAlertDialog() ;

    }


    public void CreateAlertDialog(){



        AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

        builder.setTitle("Phone Ringtones");



        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("None");
        arrayAdapter.add("Callisto");
        arrayAdapter.add("Ganymade");
        arrayAdapter.add("Luna");

        builder.setPositiveButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(ListActivity.this);
                builderInner.setMessage(strName);
                builderInner.setTitle("Your Ringtone is");
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {
                        Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builder.show();

       /* //No Button
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Canceled",Toast.LENGTH_LONG).show();
                           }
        });*/


        /*builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {

                switch(item)
                {
                    case 0:

                        relativeLayout.setBackgroundColor(Color.RED);
                        break;
                    case 1:

                        relativeLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:

                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;

                    case 3:
                        relativeLayout.setBackgroundColor(Color.YELLOW);
                        break;

                    case 4:
                        relativeLayout.setBackgroundColor(Color.LTGRAY);
                        break;

                    case 5:
                        relativeLayout.setBackgroundColor(Color.GRAY);
                        break;

                    case 6:

                        relativeLayout.setBackgroundColor(Color.CYAN);
                        break;


                }


                          alertDialog1.dismiss();

            }

        });
        alertDialog1 = builder.create();
        alertDialog1.show();
*/
    }
}
//select_dialog_singlechoice