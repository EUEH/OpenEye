package com.eueh.openeye.find;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Even on 16/12/19.
 */

public class FindAdapter extends BaseAdapter {
    private ArrayList<String>data;
    private Context context;

    public  static  final int TYPE_ONE = 0;
    public static final int TYPE_TWO = 1;
    public static final int TYPE_COUNT = 2;

    public FindAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
        notifyDataSetChanged();
    }

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
        return null;
    }
}
