package com.qnet.githubrxjava.root;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qnet.githubrxjava.GitHubAPI.APIModels.GitHubRepoModel;
import com.qnet.githubrxjava.GitHubAPI.interfaces.IGitHubAPI;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    }
    public Observable<List<GitHubRepoModel>> getGitRepo (Retrofit retrofit) {
        IGitHubAPI iGitHubAPI = retrofit.create(IGitHubAPI.class);
        Observable<List<GitHubRepoModel>> call = iGitHubAPI.getRepoFromRemote();
        return call;
    }
}
