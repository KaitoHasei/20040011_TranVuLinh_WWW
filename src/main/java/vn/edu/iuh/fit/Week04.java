package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.repositories.CandidateReponsitory;
import vn.edu.iuh.fit.repositories.CandidateSkillReponsitory;
import vn.edu.iuh.fit.repositories.JobRepository;
import vn.edu.iuh.fit.repositories.SkillReponsitory;

@SpringBootApplication(scanBasePackages = "vn.edu.iuh.fit")
public class Week04 {

    public static void main(String[] args) {
        SpringApplication.run(Week04.class, args);
    }

    @Autowired
    private CandidateReponsitory candidateReponsitory;
    @Autowired
    private CandidateSkillReponsitory candidateSkillReponsitory;
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private SkillReponsitory skillReponsitory;

    @Bean
    public CommandLineRunner lineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
            }
        };
    }
}
