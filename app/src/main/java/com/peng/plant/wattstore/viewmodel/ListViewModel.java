package com.peng.plant.wattstore.viewmodel;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.peng.plant.wattstore.model.AppData;

import java.util.ArrayList;


public class ListViewModel extends ViewModel {

   MutableLiveData<ArrayList<AppData>> appLiveData;
   ArrayList<AppData> appArrayList;

   public ListViewModel(){
       appLiveData = new MutableLiveData<>();

       init();
   }

   public MutableLiveData<ArrayList<AppData>> getAppMutableLiveData(){
       return appLiveData;
   }

    private void init() {

       appList();
       appLiveData.setValue(appArrayList);
    }

    private void appList() {

       AppData appData = new AppData();
       appData.set
    }


}
