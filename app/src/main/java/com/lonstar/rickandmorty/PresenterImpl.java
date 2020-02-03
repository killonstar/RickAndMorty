package com.lonstar.rickandmorty;

import android.util.Log;

import com.lonstar.rickandmorty.pojo.CharacterRAM;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PresenterImpl implements Contract.IPresenter {

    Contract.IView mView;
    NetworkService mService;

    public PresenterImpl(Contract.IView view, NetworkService service) {
        mView = view;
        mService = service;
    }

    @Override
    public void onClick() {
        mService.holderApi.getCharacterWithId(1).enqueue(new Callback<CharacterRAM>() {
            @Override
            public void onResponse(Call<CharacterRAM> call, Response<CharacterRAM> response) {
                CharacterRAM character = response.body();
                Log.e(Const.TAG, "onResponse: " + response.body());
                mView.onShowCharacter(character.getName(), character.getStatus(), character.getSpecies(),
                        character.getType(), character.getGender(), character.getOrigin(),
                        character.getLocation(), character.getImage());
            }

            @Override
            public void onFailure(Call<CharacterRAM> call, Throwable t) {
                Log.e(Const.TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
