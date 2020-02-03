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
    JSONPlaceHolderApi provideHolderApi(Retrofit retrofit) {
        return retrofit.create(JSONPlaceHolderApi.class);
    }

    @Provides
    @Singleton
    NetworkService provideNetworkService(JSONPlaceHolderApi holderApi) {
        return new NetworkService(holderApi);
    }



}
