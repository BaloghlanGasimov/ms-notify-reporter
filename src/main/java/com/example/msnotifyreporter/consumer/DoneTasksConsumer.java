package com.example.msnotifyreporter.consumer;

import com.example.msnotifyreporter.model.TaskShortDto;
import com.example.msnotifyreporter.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DoneTasksConsumer {
    private final EmailService emailService;
    @RabbitListener(queues = "done-tasks")
    public void consumeMessageFromQueue(TaskShortDto taskShortDto){
        emailService.postEmail(
                taskShortDto.getReporter().getEmail(),
            "Task is done",
                "Task which you created id : "+taskShortDto.getId()+ " is finished by "+ taskShortDto.getAssignee().getName()
                );
    }
}