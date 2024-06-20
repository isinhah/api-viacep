package org.api;


import org.api.service.ApiService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();

        try {
            System.out.println(apiService.getAddress("01001000"));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}