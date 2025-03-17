package dev.jaidson.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<BankAccount> accounts;

//    public User(String name) {
//        this.name = name;
//        this.accounts = new ArrayList<>();
//    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}

