package com.lynnik.mvvmexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.lynnik.mvvmexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private MainActivityViewModel mViewModel = new MainActivityViewModel();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding binding = DataBindingUtil
        .setContentView(this, R.layout.activity_main);
    binding.setViewModel(mViewModel);
    mViewModel.onCreate();

    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  @Override
  protected void onPause() {
    super.onPause();
    mViewModel.onPause();
  }

  @Override
  protected void onResume() {
    super.onResume();
    mViewModel.onResume();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mViewModel.onDestroy();
  }
}
