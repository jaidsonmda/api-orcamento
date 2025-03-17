package dev.jaidson.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;



    public String getName() {
        return name;
    }
}
