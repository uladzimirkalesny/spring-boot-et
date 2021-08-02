package by.learning.roomwebapp.controller;

import by.learning.roomwebapp.model.Room;
import by.learning.roomwebapp.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

    private final RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms() {
        return Optional.ofNullable(roomService.getAllRooms()).orElse(Collections.emptyList());
    }

}
