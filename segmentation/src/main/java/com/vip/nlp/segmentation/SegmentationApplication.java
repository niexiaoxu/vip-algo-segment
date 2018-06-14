package com.vip.nlp.segmentation;


import com.vip.nlp.database.segment.model.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SegmentationApplication {

    private static final Logger logger = LoggerFactory.getLogger(SegmentationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SegmentationApplication.class, args);
        logger.info(" this is sprint boot server ...");
        AppUser appUser = new AppUser();
    }
}
