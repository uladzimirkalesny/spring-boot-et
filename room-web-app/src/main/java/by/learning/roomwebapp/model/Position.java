package by.learning.roomwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

@AllArgsConstructor
@Getter
public enum Position {

    CONCIERGE("concierge"),
    SECURITY("security"),
    HOUSEKEEPING("housekeeping"),
    FRONT_DESK("front desk");

    private final String description;

    @Override
    public String toString() {
        return StringUtils.capitalize(getDescription());
    }

}
