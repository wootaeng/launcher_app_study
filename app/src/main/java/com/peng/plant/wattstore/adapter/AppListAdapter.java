package com.peng.plant.wattstore.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.peng.plant.wattstore.R;
import com.peng.plant.wattstore.model.AppModel;

import java.util.ArrayList;
import java.util.List;

public class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.ListViewHolder>{

    private Context context;
    private List<AppModel> appList;

    public AppListAdapter(Activity context, List<AppModel> appList){
        this.context = context;
        this.appList = appList;
    }


    public void setAppList(List<AppModel> appList){
        this.appList = appList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AppListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppListAdapter.ListViewHolder holder, int position) {
        holder.appName.setText(this.appList.get(position).getAppName().toString());
        Glide.with(context).load(this.appList.get(position).getAppIcon()).apply(RequestOptions.centerCropTransform()).into(holder.appIcon);




    }

    @Override
    public int getItemCount() {
        if(this.appList != null){
            return this.appList.size();
        }

        return 0;
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
