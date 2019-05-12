package by.tryputs.bookssharing.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SharingCard extends IdentifiableEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private SharingStatus status;

    @OneToMany(mappedBy = "sharingCard")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<SharingRecord> records = new ArrayList<>();
}
