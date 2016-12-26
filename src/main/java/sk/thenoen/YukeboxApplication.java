package sk.thenoen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YukeboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(YukeboxApplication.class, args);

		new Tutorial().play("file:///path to file");

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}