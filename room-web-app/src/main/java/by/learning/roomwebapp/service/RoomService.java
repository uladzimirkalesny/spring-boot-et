package by.learning.roomwebapp.service;

import by.learning.roomwebapp.model.Room;
import by.learning.roomwebapp.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
