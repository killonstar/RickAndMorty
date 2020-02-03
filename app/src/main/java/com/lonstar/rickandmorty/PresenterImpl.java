package com.lonstar.rickandmorty;

public class PresenterImpl implements Contract.IPresenter {

    MainActivity mView;
    ModelImpl mModel;

    public PresenterImpl(MainActivity mView) {
        this.mView = mView;
        this.mModel = new ModelImpl();
    }

    @Override
    public void onClick() {

    }
}
