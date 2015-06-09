package com.qjay.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.qjay.recyclerviewdemo.adapter.VerticalAdapter;


public class MainActivity extends AppCompatActivity {

    private <T extends View> T findViewById2(int id) {

        return (T) findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        initRecyclerViewHorizontal();

        initRecyclerViewVertical();
    }

    private void initRecyclerViewVertical() {
        RecyclerView rv_vertical = findViewById2(R.id.rv_vertical);
        LinearLayoutManager mLayoutManager_vertical = new LinearLayoutManager(this);
        mLayoutManager_vertical.setOrientation(LinearLayoutManager.VERTICAL);//这里可以不设置,默认是垂直的
        rv_vertical.setLayoutManager(mLayoutManager_vertical);

        String[] items = new String[20];
        for (int i = 0; i < items.length; i++) {
            items[i] = "items" + i;
        }
        VerticalAdapter adapter = new VerticalAdapter(items);
        rv_vertical.setAdapter(adapter);
    }

    private void initRecyclerViewHorizontal() {
        RecyclerView rv_horizontal = findViewById2(R.id.rv_horizontal);
        LinearLayoutManager mLayoutManager_horizontal = new LinearLayoutManager(this);
        mLayoutManager_horizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_horizontal.setLayoutManager(mLayoutManager_horizontal);

        String[] items = new String[20];
        for (int i = 0; i < items.length; i++) {
            items[i] = "items" + i;
        }
        VerticalAdapter adapter = new VerticalAdapter(items);

        rv_horizontal.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
