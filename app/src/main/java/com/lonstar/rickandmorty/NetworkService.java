package com.lonstar.rickandmorty;

public class NetworkService {

    public static final String BASE_URL = "https://rickandmortyapi.com/api/";
    JsonPlaceHolderApi holderApi;

    public NetworkService(JsonPlaceHolderApi holderApi) {
        this.holderApi = holderApi;
    }

}
