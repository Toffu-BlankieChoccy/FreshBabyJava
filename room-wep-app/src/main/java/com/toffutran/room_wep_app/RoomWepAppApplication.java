package com.toffutran.room_wep_app;

import com.toffutran.room_wep_app.data.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomWepAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomWepAppApplication.class, args);
	}
    @Bean
    CommandLineRunner run(RoomRepository roomRepository) {
        return args -> {
            roomRepository.findAll().forEach(System.out::println);
        };
    }
}
