package com.qjay.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Q.Jay on 2015/6/8 0008.
 */
public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    private static final String TAG = "VerticalAdapter";
    private final String[] items;

    public VerticalAdapter(String[] items){
        this.items = items;
        Log.d(TAG, "items.length = "+items.length);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // ����һ��View�������ֱ��ʹ��ϵͳ�ṩ�Ĳ��֣�����һ��TextView
        View view = View.inflate(parent.getContext(), android.R.layout.simple_list_item_1, null);
        // ����һ��ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // �����ݵ�ViewHolder��

        holder.mTextView.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }

    }
}
