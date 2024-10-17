package culturemedia.model;
import java.time.LocalDateTime;
import culturemedia.model.Video;

public record Reproduccion(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {}

