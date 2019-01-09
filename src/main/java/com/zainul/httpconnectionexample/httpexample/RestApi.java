package com.zainul.httpconnectionexample.httpexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author user-root
 */
public interface RestApi {
    @POST("/v1/events")
    Call<Void> createEvent(@Body Event event);
    
    @GET("/v1/events")
    Call<List<Event>> getEvent();
    
    @DELETE("/v1/events/{id}")
    Call<Void> deleteEvents(@Path("id") String id);
    
}
