package dev.jaidson.util;

import dev.jaidson.entity.*;

class ReportGenerator {
    public static void generateReport(User user) {
        System.out.println("\n===== Relatório Financeiro de " + user.getName() + " =====");

//        for (BankAccount account : user.getAccounts()) {
//            System.out.println("\n📌 Conta: " + account.getTransactions().size() + " transações registradas");
//            double totalIncome = 0, totalExpense = 0;
//
//            for (Transaction transaction : account.getTransactions()) {
//                if (transaction instanceof Income) {
//                    totalIncome += transaction.getAmount();
//                } else if (transaction instanceof Expense) {
//                    totalExpense += transaction.getAmount();
//                }
//            }
//
//            System.out.println("💰 Total de Receitas: R$ " + totalIncome);
//            System.out.println("💸 Total de Despesas: R$ " + totalExpense);
//            System.out.println("💳 Saldo Atual: R$ " + account.getBalance());
//        }
    }
}
