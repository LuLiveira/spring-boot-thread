package dev.lucas;

import dev.lucas.services.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class SpringBootThreadsApplication implements CommandLineRunner {

	private final HelloService service;

	public SpringBootThreadsApplication(HelloService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThreadsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.start();
	}

	@Bean
	public Executor executor(){
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setThreadNamePrefix("ASYNC-");
		threadPoolTaskExecutor.initialize();
		return threadPoolTaskExecutor;
	}
}
