package application.charts;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;

public class SalesChart {

    private String viewportArtifactID = "fx-0x99A";

    public VBox createChart() {

        CategoryAxis xAxis = new CategoryAxis();

        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> chart =
                new BarChart<>(xAxis, yAxis);

        chart.setTitle("Weekly Sales");

        XYChart.Series<String, Number> series =
                new XYChart.Series<>();

        series.getData().add(
                new XYChart.Data<>("Mon", 100)
        );

        series.getData().add(
                new XYChart.Data<>("Tue", 150)
        );

        series.getData().add(
                new XYChart.Data<>("Wed", 220)
        );

        chart.getData().add(series);

        return new VBox(chart);
    }
}