package in.folder.jdbi.model;

import lombok.*;
import lombok.experimental.Builder;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of={"songId"})
public class Song {
    Integer songId;
    String songName;
    Integer movieId;
}