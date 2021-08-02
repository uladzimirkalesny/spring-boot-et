package by.learning.roomwebapp.async;

import by.learning.roomwebapp.model.Room;
import by.learning.roomwebapp.service.RoomService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor

@Component
public class RoomCleanerListener {
    private final ObjectMapper objectMapper;
    private final RoomService roomService;

    public void receiveMessage(String message) {
        try {
            AsyncPayload payload = objectMapper.readValue(message, AsyncPayload.class);
            if ("ROOM".equals(payload.getModel())) {
                Room room = roomService.getById(payload.getId());
                log.info("ROOM {} : {} needs to be cleaned", room.getNumber(), room.getName());
            } else {
                log.warn("Unknown model type");
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
