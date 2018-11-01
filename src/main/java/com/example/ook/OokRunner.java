package com.example.ook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;


@Component
public class OokRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ok");
        /*OokEngine ookEngine = new OokEngine(1);
        ookEngine.interpret("I like sushi");*/

        OokEngine ookEngine = new OokEngine(30000);
        ookEngine.interpret(new File(
                "examples/ook/hello.ook"));
    }

}
