package com.kivitool.currencyend;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit retrofit;

    public static  final String BASE_URL = "https://openexchangerates.org/api/";

    public static  Retrofit getRetrofit()
    {

        if (retrofit == null)
        {

            retrofit = new Retrofit.Builder()

                    .baseUrl(BASE_URL)

                    .addConverterFactory(GsonConverterFactory.create())

                    .build();

        }

        return retrofit;

    }


}
