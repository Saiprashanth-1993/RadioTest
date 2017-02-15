package com.example.sai.designs;

import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.LayoutInflater;
import android.support.annotation.Nullable;
import android.view.ViewGroup;

public class StatusActivity extends DialogFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.activity_status, container, false);
        Button btn = (Button) v.findViewById(R.id.okbtn);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dismiss();
            }
        });
        return v;
    }
}
    // calling method


     /*Activity c;

    Button ok;

    public StatusActivity(Activity a){
        super(a);
        this.c = a;
    }*/

        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_status);


        ok=(Button)findViewById(R.id.okbtn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }*/

