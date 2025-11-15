🇵🇰 Predictive Analysis System — Pakistan GDP Predictor
📘 Overview

This project is a Java-based Predictive Analysis System that uses a Simple Linear Regression model to forecast Pakistan’s GDP for any future year.
It includes a clean and interactive GUI built with Java Swing, allowing users to enter a year and instantly get the predicted GDP value.

⚙️ Features

📊 Linear Regression model implemented from scratch

🖥️ User-friendly Swing GUI

📂 Preloaded Pakistan GDP dataset (2015–2022)

🔢 Predicts future GDP values for any user-input year

🧱 Object-Oriented design (classes, encapsulation, models)

🧠 Technologies & Concepts Used

Java Swing (GUI development)

Linear Regression (Slope, Intercept, Prediction)

OOP Principles

Class modeling

Encapsulation

Static factory method (trainModel)

Event handling for button actions

ArrayList for dataset storage

🏗️ Project Structure
PredictiveAnalysisSystem/
│
├── src/
│   └── PredictiveAnalysisSystem.java
│
├── docs/
│   ├── Project_Report.pdf
│   ├── 1_SystemOverview.png
│   ├── 2_AlgorithmDiagram.png
│   ├── 3_GUIInterface.png
│   └── 4_OutputScreenshot.png
│
└── README.md

🚀 How to Run the Project
1. Compile

Open terminal inside the src/ folder:

javac PredictiveAnalysisSystem.java

2. Run
java PredictiveAnalysisSystem


The GUI window will open.

🧩 Dataset Used

The GDP dataset used to train the regression model:

Year	GDP (Billion USD)
2015	270
2016	283
2017	305
2018	314
2019	320
2020	300
2021	346
2022	376

The model computes:

Slope

Intercept

And predicts:
GDP = slope × year + intercept

🖼️ Screenshots
GUI Interface

Sample Prediction

📄 Documentation

Detailed explanation of:

System design

Diagrams

Flow

Algorithm working

Calculations

…is available in:

📄 docs/Project_Report.pdf

🧑‍💻 Author

Syed Aqdas Munir
2nd Semester — Artificial Intelligence
PAF IAST, Pakistan
