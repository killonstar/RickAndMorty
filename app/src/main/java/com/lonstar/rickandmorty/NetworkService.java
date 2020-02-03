package com.lonstar.rickandmorty;


import retrofit2.Retrofit;

public class NetworkService {

    public static final String BASE_URL = "https://rickandmortyapi.com/api/";
    JSONPlaceHolderApi holderApi;

    public NetworkService(JSONPlaceHolderApi holderApi) {
        this.holderApi = holderApi;
    }



}
