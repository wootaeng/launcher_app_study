package com.peng.plant.wattstore;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.peng.plant.wattstore.databinding.ListItemBinding;

import java.util.ArrayList;

public class ListViewAdapter extends RecyclerView.Adapter<BindingViewHolder<ListItemBinding>> {

    private ArrayList<ListItemViewModel> listItemViewModels = new ArrayList<>();



    @Override
    public BindingViewHolder<ListItemBinding> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new BindingViewHolder<>(inflater.inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull  BindingViewHolder<ListItemBinding> holder, int position) {
        holder.binding().setViewModel(listItemViewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return listItemViewModels.size();
    }
}
