package com.lonstar.rickandmorty;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class BaseApp  extends AppCompatActivity {
    NetworkComponent component;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        component = DaggerNetworkComponent.builder().networkModule(new NetworkModule()).build();

    }

    public NetworkComponent getNetworkComponent() {
        return component;
    }
}
