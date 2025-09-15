import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class PredictiveAnalysisSystem {

    public static class DataPoint {
        private double year;
        private double gdp;
        

        public DataPoint(double year, double gdp) {
            this.year = year;
            this.gdp = gdp;
        }

        public double getYear() {
            return year;
        }

        public double getGdp() {
            return gdp;
        }
    }

    public static class LinearRegressionModel {
        private double slope;
        private double intercept;

        public LinearRegressionModel(double slope, double intercept) {
            this.slope = slope;
            this.intercept = intercept;
        }

        public double predict(double x) {
            return slope * x + intercept;
        }

        public double getSlope() {
            return slope;
        }

        public double getIntercept() {
            return intercept;
        }
    }

    public static LinearRegressionModel trainModel(List<DataPoint> data) {
        int n = data.size();
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;

        for (DataPoint point : data) {
            double x = point.getYear();
            double y = point.getGdp();
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumXX += x * x;
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumXX - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        return new LinearRegressionModel(slope, intercept);
    }

    public static List<DataPoint> loadDataset() {
        List<DataPoint> dataset = new ArrayList<>();
        dataset.add(new DataPoint(2015, 270.0));
        dataset.add(new DataPoint(2016, 283.0));
        dataset.add(new DataPoint(2017, 305.0));
        dataset.add(new DataPoint(2018, 314.0));
        dataset.add(new DataPoint(2019, 320.0));
        dataset.add(new DataPoint(2020, 300.0));
        dataset.add(new DataPoint(2021, 346.0));
        dataset.add(new DataPoint(2022, 376.0));
        return dataset;
    }

    public static void createAndShowGUI(LinearRegressionModel model) {
        JFrame frame = new JFrame("Pakistan GDP Predictor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(new GridLayout(4, 1));

        JLabel titleLabel = new JLabel("Enter a future year to predict Pakistan's GDP:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField inputField = new JTextField();
        JLabel resultLabel = new JLabel("Prediction will appear here");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton predictButton = new JButton("Predict");

        predictButton.addActionListener(e -> {
            try {
                double year = Double.parseDouble(inputField.getText());
                double prediction = model.predict(year);
                resultLabel.setText(String.format("Predicted GDP for %.0f: %.2f billion USD", year, prediction));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter a numeric year.");
            }
        });

        frame.add(titleLabel);
        frame.add(inputField);
        frame.add(predictButton);
        frame.add(resultLabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        List<DataPoint> dataset = loadDataset();
        LinearRegressionModel model = trainModel(dataset);
        SwingUtilities.invokeLater(() -> createAndShowGUI(model));
    }
}