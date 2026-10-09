package impl.spring_security.Model;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int score;
}
