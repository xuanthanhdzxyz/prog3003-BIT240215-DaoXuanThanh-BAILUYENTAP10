package bai4_calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bii4_Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Tao GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        // So thu nhat
        Label label1 = new Label("So thu nhat:");
        grid.add(label1, 0, 0);
        
        TextField input1 = new TextField();
        input1.setPromptText("Nhap so thu nhat");
        grid.add(input1, 1, 0);
        
        // So thu hai
        Label label2 = new Label("So thu hai:");
        grid.add(label2, 0, 1);
        
        TextField input2 = new TextField();
        input2.setPromptText("Nhap so thu hai");
        grid.add(input2, 1, 1);
        
        // Nut tinh
        Button btnCalculate = new Button("Tinh tong");
        grid.add(btnCalculate, 1, 2);
        
        // Ket qua
        Label resultLabel = new Label("Ket qua: ");
        grid.add(resultLabel, 1, 3);
        
        // Xu ly su kien
        btnCalculate.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(input1.getText());
                double num2 = Double.parseDouble(input2.getText());
                double sum = num1 + num2;
                resultLabel.setText("Ket qua: " + sum);
            } catch (NumberFormatException e) {
                resultLabel.setText("Loi! Vui long nhap so hop le");
            }
        });
        
        // Tao Scene
        Scene scene = new Scene(grid, 400, 250);
        
        // Hien thi
        primaryStage.setTitle("May Tinh Cong Hai So");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}