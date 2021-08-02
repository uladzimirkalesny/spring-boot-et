package by.learning.roomwebapp.repository;

import by.learning.roomwebapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
