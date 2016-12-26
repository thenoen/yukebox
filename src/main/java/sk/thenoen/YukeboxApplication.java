package sk.thenoen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YukeboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(YukeboxApplication.class, args);

		//new Tutorial().play("file:///home/pi/Music/10 - The Crow, the Owl and the Dove.mp3");
		//new Tutorial().play("file:///home/pi/Projects/Saint Deamon - Run For Your Life (HQ)-DW1NRWO-IEY.m4a");
		new Tutorial().play("file:///home/pi/Projects/Saint Deamon - Run For Your Life (HQ)-DW1NRWO-IEY.webm");		
		//new Tutorial().play("http://www.youtube.com/watch?v=DW1NRWO-IEY");

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
