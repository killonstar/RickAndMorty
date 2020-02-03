package com.lonstar.rickandmorty;

import com.lonstar.rickandmorty.pojo.CharacterRAM;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {

    @GET("character/{id}")
    Call<CharacterRAM> getCharacterWithId(@Path("id") int id);

}
