package com.peng.plant.wattstore.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.peng.plant.wattstore.R;
import com.peng.plant.wattstore.model.AppData;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ListViewHolder>{

    Activity context;
    ArrayList<AppData> appArrayList;

    public ListViewAdapter(Activity context, ArrayList<AppData> appArrayList){
        this.context = context;
        this.appArrayList = appArrayList;
    }


    @NonNull
    @Override
    public ListViewAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAdapter.ListViewHolder holder, int position) {
        AppData appData = appArrayList.get(position);
        ListViewHolder viewHolder = (ListViewHolder)holder;

        viewHolder.appName.setText(appData.getAppName());




    }

    @Override
    public int getItemCount() {
        return appArrayList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView appIcon;
        TextView appName;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            appIcon = itemView.findViewById(R.id.app_icon);
            appName = itemView.findViewById(R.id.app_name);
        }


    }
}
