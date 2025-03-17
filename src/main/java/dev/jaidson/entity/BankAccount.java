package dev.jaidson.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma conta bancária do usuário.
@Entity
@Table(name = "bank_account")
public class BankAccount extends PanacheEntityBase {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankName;
    private double balance;
    @OneToMany()
    @JoinColumn(name = "incomes")
    private List<Income> incomes;
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "expenses")
    private List<Expense> expenses;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
//    public BankAccount(String bankName, double balance) {
//        this.bankName = bankName;
//        this.balance = balance;
//        this.transactions = new ArrayList<>();
//    }

    public void addIncome(Income income) {
        incomes.add(income);



    }
    public void addExpense(Expense expense) {
        expenses.add(expense);



    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public double getBalance() {
        return balance;
    }
}
