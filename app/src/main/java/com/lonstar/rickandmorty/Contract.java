package com.lonstar.rickandmorty;

import com.lonstar.rickandmorty.pojo.Location;
import com.lonstar.rickandmorty.pojo.Origin;

public interface Contract {

    interface IView {
        void onShowCharacter(String name, String status, String species,
                             String type, String gender, Origin origin,
                             Location location, String image);
    }

    interface IPresenter {
        void onClick(int button);
    }
}
