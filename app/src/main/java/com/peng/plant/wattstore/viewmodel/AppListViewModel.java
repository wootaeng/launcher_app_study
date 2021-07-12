package com.peng.plant.wattstore.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.peng.plant.wattstore.model.AppModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AppListViewModel extends ViewModel {

   private MutableLiveData<List<AppModel>> appsList;


   public AppListViewModel(){
       appsList = new MutableLiveData<>();


   }

   public MutableLiveData<List<AppModel>> getAppsListObserver(){
       return appsList;
   }









}
