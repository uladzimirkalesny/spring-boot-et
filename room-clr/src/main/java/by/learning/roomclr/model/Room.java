package by.learning.roomclr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {
    private long id;
    private String number;
    private String name;
    private String info;
}
