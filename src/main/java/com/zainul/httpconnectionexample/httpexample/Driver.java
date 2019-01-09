package com.zainul.httpconnectionexample.httpexample;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import retrofit2.Call;

/**
 *
 * @author user-root
 */
public class Driver {
    private static RetrofitService retrofitService = new RetrofitService();
    
    public static void main(String args[]) throws IOException{
        
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan HTTP Method");
        System.out.println("1. GET");
        System.out.println("2. POST");
        System.out.println("3. DELETE");
        System.out.println("4. Exit");
        System.out.print("Pilihan [1/2/3/4] : ");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                getEvent();
                break;
            case 2:
                String id = String.valueOf(Math.random());
                Event event = new Event("id", "Contoh", "2019-01-03");
                createEvent(event);
                break;
            case 3:
                deleteEvent("00000001");
                break;
            default:
                System.exit(0);
        }
        
    }
    
    private static void getEvent() throws IOException{
        Call<List<Event>> call = retrofitService.getEvent();
        
        List<Event> events = call.execute().body();
        for (Event event : events) {
            System.out.println("id: " + event.getId());
            System.out.println("kode: " + event.getKode());
            System.out.println("nama: " + event.getNama());
            System.out.println("tanggal: " + event.getTanggal());
            System.out.println("");
        }
        
    }
    
    private static void createEvent(Event event) throws IOException{
        retrofitService.createEvent(event).execute();
        
        System.out.println("Create Finish");
    }
    
    private static void deleteEvent(String id) throws IOException{
        retrofitService.deleteEvent(id).execute();
        System.out.println("Delete Success");
    }
    
}
