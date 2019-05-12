package by.tryputs.bookssharing.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class IdentifiableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
