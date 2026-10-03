# Continuous Delivery Lab

A small Java/Spring Boot API built to demonstrate a practical CI/CD workflow from source code to a container-ready artifact.

## What this project demonstrates

- Automated tests on every pull request
- Maven packaging in CI
- Docker image validation
- Spring Boot health checks
- Environment-driven application versioning
- A simple REST API that is easy to deploy anywhere

## API

### Application status

```http
GET /api/status
```

Example response:

```json
{
  "status": "UP",
  "version": "dev",
  "timestamp": "2026-10-03T00:00:00Z"
}
```

### Delivery message

```http
GET /api/message
```

### Actuator health

```http
GET /actuator/health
```

## Run locally

```bash
mvn spring-boot:run
```

Then open:

```text
http://localhost:8080/api/status
```

Set a version value:

```bash
APP_VERSION=1.2.0 mvn spring-boot:run
```

## Tests

```bash
mvn test
```

## Docker

```bash
docker build -t continuous-delivery-lab .
docker run -p 8080:8080 -e APP_VERSION=1.0.0 continuous-delivery-lab
```

## CI/CD

Two GitHub Actions workflows are included:

- **CI** — runs tests and packages the application
- **Docker Build** — verifies that the container image builds successfully

## Tech Stack

Java 17 · Spring Boot · Spring Actuator · Maven · JUnit · Docker · GitHub Actions
