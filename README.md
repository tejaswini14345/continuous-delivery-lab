# DevOps Lab 1 – Introduction to Continuous Delivery (CD) and CI/CD Pipelines

This project is part of a lab series focused on **Continuous Delivery and DevOps** practices. Lab 1 explores the foundational concepts of setting up a basic CI/CD pipeline and understanding the automation lifecycle in modern software development.

🎯 Objective

- Understand the core principles of Continuous Integration and Continuous Delivery (CI/CD)
- Build a basic pipeline using industry-standard tools
- Automate application builds, tests, and deployments

🔧 Technologies Used

- **Git** – Version control
- **GitHub Actions / Jenkins / GitLab CI** – CI/CD pipeline (whichever you used)
- **Docker** – Containerization (if applicable)
- **Shell Scripts / YAML** – Automation configuration
- **Node.js / Java / Python** – (update this to match your code stack)
- **AWS / GCP / Azure** – (if any cloud deployment is involved)

📁 Project Structure

cdd-lab-1/ ├── .github/workflows/ # GitHub Actions CI/CD workflows ├── src/ # Source code ├── Dockerfile # Docker configuration (if used) ├── scripts/ # Custom automation scripts ├── README.md # Project documentation └── Jenkinsfile # If Jenkins is used instead of GitHub Actions

bash
Copy
Edit

🚀 Getting Started

1. **Clone the Repository**

```bash
git clone https://github.com/tejaswini14345/cdd-lab-1.git
cd cdd-lab-1
View or Modify CI/CD Pipeline

For GitHub Actions:

Navigate to .github/workflows/

Edit the .yml files to customize steps

For Jenkins:

Edit the Jenkinsfile

Trigger the Pipeline

Push a new commit or create a pull request to see the automation in action.

🔄 What This Pipeline Does
Checks out code from the repository

Installs dependencies

Runs automated tests

Builds the application

Optionally deploys to a staging or production server

📸 Sample Workflow YAML (GitHub Actions)
yaml
Copy
Edit
name: CI/CD Pipeline

on:
  push:
    branches: [ main ]

jobs:
  build-and-test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Run tests
        run: echo "Add your test scripts here"
📚 Learning Outcomes
Understand YAML configuration for CI/CD

Practice DevOps tools and workflows

Learn how to containerize and automate builds

Deploy applications with minimal manual steps

📬 Contact
Sai Venkata Tejaswini Betina
📧 bsvteju@umich.edu
🔗 GitHub

