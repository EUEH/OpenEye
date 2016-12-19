package com.eueh.openeye.selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eueh.openeye.R;

import java.util.ArrayList;

/**
 * Created by 陈焕栋 on 16/12/19.
 */

public class SelectionAdapter extends BaseAdapter {
    private ArrayList<String> data ;
    private Context context ;

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_fragment_selection , viewGroup , false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv.setText(data.get(i));
        return view;
    }

    class ViewHolder {
        private TextView tv ;
        public ViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.item_fragment_selection_tv);
        }
    }
}
