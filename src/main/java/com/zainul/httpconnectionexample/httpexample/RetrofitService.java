package com.zainul.httpconnectionexample.httpexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 *
 * @author user-root
 */
public class RetrofitService {
    private static RestApi restApi;
    private static final String BASE_URL = "https://ems-api-demo.herokuapp.com";
     
    public RetrofitService(){
        Retrofit retrofit  = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
        
        restApi = retrofit.create(RestApi.class);
    }
    
    public Call<Void> createEvent(Event event){
        return restApi.createEvent(event);
    }
    
    public Call<List<Event>> getEvent(){
        return restApi.getEvent();
    }
    
    public Call<Void> deleteEvent(String id){
        return restApi.deleteEvents(id);
    }
}
