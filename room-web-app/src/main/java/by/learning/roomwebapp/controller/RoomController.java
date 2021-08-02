package by.learning.roomwebapp.controller;

import by.learning.roomwebapp.model.Room;
import by.learning.roomwebapp.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    public String getAllRooms(Model model) {
        List<Room> rooms = Optional.ofNullable(roomService.getAllRooms()).orElse(Collections.emptyList());
        model.addAttribute("rooms", rooms);

        return "rooms"; // name of specific html template
    }

}
