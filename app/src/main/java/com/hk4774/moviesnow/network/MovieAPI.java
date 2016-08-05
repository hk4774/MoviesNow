package com.hk4774.moviesnow.network;

import com.hk4774.moviesnow.modal.movieGeneral;
import com.hk4774.moviesnow.modal.review.movieReview;
import com.hk4774.moviesnow.modal.trailer.movieYoutubeModal;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface MovieAPI {

    //this method is to fetch the ALL movies with specific sort
    @GET("/3/discover/movie")
    void fetchMovies(
            @Query("sort_by") String mSort,
            @Query("api_key") String mApiKey,
            @Query("language") String lang,
            Callback<movieGeneral> cb
    );

    @GET("/3/movie/{id}/reviews")
    void fetchReview(
            @Query("api_key") String mApiKey,
            @Path("id") String id,
            Callback<movieReview> cb
    );

    @GET("/3/movie/{id}/videos")
    void fetchVideos(
            @Query("api_key") String mApiKey,
            @Path("id") String id,
            Callback<movieYoutubeModal> cb
    );

}
