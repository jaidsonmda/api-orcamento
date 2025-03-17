package dev.jaidson.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "expense")
public class Expense extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Category category;
    @ManyToOne(optional = true)
    private BankAccount bankAccount;
    @ManyToOne(optional = true)
    private Card card;
    protected double amount;
    protected String description;



//    public Expense(double amount, String description, Category category) {
//        super(amount, description);
//        this.category = category;
//    }

    public Category getCategory() {
        return category;
    }
}
