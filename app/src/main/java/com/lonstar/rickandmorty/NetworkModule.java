package com.lonstar.rickandmorty;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    Retrofit provideCall() {
        return new Retrofit.Builder()
                .baseUrl(NetworkService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    JsonPlaceHolderApi provideHolderApi(Retrofit retrofit) {
        return retrofit.create(JsonPlaceHolderApi.class);
    }

    @Provides
    @Singleton
    NetworkService provideNetworkService(JsonPlaceHolderApi holderApi) {
        return new NetworkService(holderApi);
    }



}
