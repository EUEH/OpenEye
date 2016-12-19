package com.eueh.openeye.concern;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 陈小飞 on 16/12/19.
 */

public class ConcernAdapter extends RecyclerView.Adapter<ConcernAdapter.ConcernViewHolder>{

    @Override
    public ConcernViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ConcernViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ConcernViewHolder extends RecyclerView.ViewHolder {
        public ConcernViewHolder(View itemView) {
            super(itemView);
        }
    }
}
