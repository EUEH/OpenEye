package com.eueh.openeye.find;

import android.view.View;
import android.widget.ListView;

import com.eueh.openeye.R;
import com.eueh.openeye.base.BaseFragment;

/**
 * Created by dllo on 16/12/19.
 */

public class FindFragment extends BaseFragment {
    private ListView lvFindG;

    @Override
    public int setLayout() {
        return R.layout.fragment_find;
    }

    @Override
    public void initView(View view) {
        lvFindG = (ListView) lvFindG.findViewById(R.id.lv_find_g);
    }


    @Override
    public void initData() {

    }
}
