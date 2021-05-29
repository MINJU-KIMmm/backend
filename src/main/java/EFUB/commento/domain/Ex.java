package EFUB.commento.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
@Table(name = "ex")
public class Ex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="country", nullable = false)
    private String country;
}
