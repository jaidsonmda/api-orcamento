package dev.jaidson.util;

import dev.jaidson.entity.BankAccount;
import dev.jaidson.entity.Expense;
import dev.jaidson.entity.Transaction;
import org.knowm.xchart.*;

import java.util.*;

// Classe para gerar gráficos com XChart
class ChartGenerator {
    public static void generateExpenseChart(BankAccount account) {
        Map<String, Double> categoryTotals = new HashMap<>();

        // Agrupar despesas por categoria
//        for (Transaction transaction : account.getTransactions()) {
//            if (transaction instanceof Expense) {
//                Expense expense = (Expense) transaction;
//                categoryTotals.put(
//                        expense.getCategory().getName(),
//                        categoryTotals.getOrDefault(expense.getCategory().getName(), 0.0) + expense.getAmount()
//                );
//            }
//        }

        // Criar gráfico de pizza
        PieChart chart = new PieChartBuilder()
                .width(600)
                .height(400)
                .title("Despesas por Categoria")
                .build();

        // Configuração do estilo
        chart.getStyler().setLegendVisible(true);
        chart.getStyler().setDefaultSeriesRenderStyle(PieSeries.PieSeriesRenderStyle.Pie);

        // Adicionar os dados ao gráfico
        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            chart.addSeries(entry.getKey(), entry.getValue());
        }

        // Exibir o gráfico
        new SwingWrapper<>(chart).displayChart();
    }
}
