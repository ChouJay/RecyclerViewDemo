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
        // 创建一个View，简单起见直接使用系统提供的布局，就是一个TextView
        View view = View.inflate(parent.getContext(), android.R.layout.simple_list_item_1, null);
        // 创建一个ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 绑定数据到ViewHolder上

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
