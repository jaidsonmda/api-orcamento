package dev.jaidson.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "income")
public class Income extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bankAccount")
    private BankAccount bankAccount;
    private double amount;
    private String description;
//    public Income(double amount, String description) {
//        super(amount, description);
//    }
}
