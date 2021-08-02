package by.learning.roomcleanernotifier.async;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsyncPayload {
    private long id;
    private String model;
}
