[![CI/CD Pipeline](https://github.com/<USUARIO>/<REPO>/actions/workflows/build.yml/badge.svg)](https://github.com/<USUARIO>/<REPO>/actions/workflows/build.yml)

# Faker API

Simple Spring Boot application that exposes random data generated with Datafaker.

## Endpoints

| Method | Path          | Description                  |
|--------|---------------|------------------------------|
| GET    | `/`           | Health check                 |
| GET    | `/version`    | Application version          |
| GET    | `/nations`    | 10 random nations            |
| GET    | `/currencies` | 20 random currencies         |
| GET    | `/aviation`   | 20 random aircraft and METAR |

## Stack

Java 17, Spring Boot 4.1.1, Maven, JUnit 5, JaCoCo, SonarCloud, GitHub Actions, Docker Hub, Render.

## Run locally

```shell
./mvnw spring-boot:run
```

## Test and coverage

```shell
./mvnw clean verify
```

The JaCoCo report is generated at `target/site/jacoco/index.html`.

## Docker

```shell
./mvnw package -DskipTests
docker build -t faker .
docker run -p 8080:8080 faker
```

## Pipeline

Jobs: tests, sonar, build, docker, deploy. The docker and deploy jobs only run on pushes to `main`.
