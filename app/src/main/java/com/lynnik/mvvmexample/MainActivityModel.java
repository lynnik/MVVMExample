package com.lynnik.mvvmexample;

public class MainActivityModel {

  private boolean isListEmpty = true;

  public void setListEmpty(boolean listEmpty) {
    isListEmpty = listEmpty;
  }

  public boolean isListEmpty() {
    return isListEmpty;
  }
}
