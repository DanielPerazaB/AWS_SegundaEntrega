package com.estudiantes.APIRestAWS.repositories;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SNSRepository {
    @Autowired
    private AmazonSNS amazonSNS;

    public void sendEmailToTopic(String text, String topicName){
        PublishResult result = amazonSNS.publish(new PublishRequest()
                .withTopicArn("arn:aws:sns:us-east-1:623360648674:sicei-sns-topic-daniel-peraza")
                .withMessage(text)
        );
        System.out.println(result);
    }
}
