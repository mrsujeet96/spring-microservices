package com.image;

import com.image.repository.DocRepository;
import com.image.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ImageApplication  implements CommandLineRunner {

	@Autowired
	private DocRepository docRepository;
	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(ImageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
