package com.peng.plant.wattstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatCallback;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.peng.plant.wattstore.adapter.AppListAdapter;
import com.peng.plant.wattstore.databinding.ActivityMainBinding;
import com.peng.plant.wattstore.model.AppModel;
import com.peng.plant.wattstore.viewmodel.AppListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MaingActivity";


    private List<AppModel> appModelList;
    private AppListAdapter adapter;
    private AppListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //DataBinding 사용
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        RecyclerView recyclerView = binding.recyclerV;

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 4);

        recyclerView.setLayoutManager(layoutManager);
        adapter = new AppListAdapter(this,appModelList);
        recyclerView.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(AppListViewModel.class);
        viewModel.getAppsListObserver().observe(this, new Observer<List<AppModel>>() {
            @Override
            public void onChanged(List<AppModel> appModels) {
                if (appModels != null){
                    appModelList = appModels;
                    adapter.setAppList(appModels);
                }
            }
        });


    }


}