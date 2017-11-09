package com.lynnik.mvvmexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

public class MainActivityViewModel extends BaseObservable
    implements ViewModel {

  private MainActivityModel mModel;

  public MainActivityViewModel() {
    mModel = new MainActivityModel();
  }

  @Override
  public void onCreate() {

  }

  @Override
  public void onPause() {

  }

  @Override
  public void onResume() {

  }

  @Override
  public void onDestroy() {

  }

  public View.OnClickListener inverse() {
    return new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mModel.setListEmpty(!mModel.isListEmpty());
      }
    };
  }

  @Bindable
  public boolean isListEmpty() {
    notifyPropertyChanged(BR.listEmpty);
    return mModel.isListEmpty();
  }
}
