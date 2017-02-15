package com.example.sai.designs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 9/2/17.
 */

public class CustomListAdapter extends ArrayAdapter {

        private final Activity context;
        private final String[] itemname;
        private final Integer[] imgid;

        public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
            super(context, R.layout.list_contacts, itemname);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.itemname=itemname;
            this.imgid=imgid;
        }

        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.list_contacts, null,true);

            TextView txtTitle = (TextView) rowView.findViewById(R.id.number);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
            TextView extratxt = (TextView) rowView.findViewById(R.id.name);

            txtTitle.setText(itemname[position]);
            imageView.setImageResource(imgid[position]);
            extratxt.setText("+01 123456789");
            return rowView;

        };
    }
