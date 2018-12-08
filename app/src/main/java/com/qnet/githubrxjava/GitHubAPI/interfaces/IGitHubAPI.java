package com.qnet.githubrxjava.GitHubAPI.interfaces;

import com.qnet.githubrxjava.GitHubAPI.APIModels.GitHubRepoModel;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IGitHubAPI {
    @GET("repositories")
    Observable<List<GitHubRepoModel>> getRepoFromRemote();
}
