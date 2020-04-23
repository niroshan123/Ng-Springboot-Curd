package io.niroshan.curd;

import io.niroshan.curd.entities.User;
import io.niroshan.curd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendCurdApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args)
	{

		SpringApplication.run(BackendCurdApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		userRepository.save(new User("one","one"));
		userRepository.save(new User("two","two"));
		userRepository.save(new User("three","three"));

	}
}
