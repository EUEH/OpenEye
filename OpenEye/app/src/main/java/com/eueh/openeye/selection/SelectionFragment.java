package com.eueh.openeye.selection;

import android.widget.ListView;

import com.eueh.openeye.R;
import com.eueh.openeye.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/19.
 */

public class SelectionFragment extends BaseFragment {
    private ListView ls ;
    private SelectionAdapter myAdapter ;
    private ArrayList<String> data ;

    @Override
    public int setLayout() {
        return R.layout.fragment_selection;
    }


    @Override
    public void initView() {
        

    }

    @Override
    public void initData() {

    }
}
