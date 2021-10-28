package com.example.buginstanceof;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.viewholder.BaseViewHolder;

public class JavaTestActivity extends AppCompatActivity {
    public void test() {
        BaseViewHolder baseViewHolder = new BaseViewHolder(getWindow().getDecorView());
        if (baseViewHolder instanceof RecyclerView.ViewHolder) {
            RecyclerView.ViewHolder viewHolder = (BaseViewHolder) baseViewHolder;
        }
    }
}
