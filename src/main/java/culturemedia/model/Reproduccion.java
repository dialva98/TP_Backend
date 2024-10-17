package culturemedia.model;
import java.time.LocalDateTime;

public record Reproduccion(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {}

