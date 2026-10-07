#Lab2

[![CI/CD Pipeline](https://github.com/JuanjEC/JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker/actions/workflows/build.yml/badge.svg)](https://github.com/JuanjEC/JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker/actions/workflows/build.yml)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

[![Known Vulnerabilities](https://snyk.io/test/github/JuanjEC/JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker/badge.svg)](https://snyk.io/test/github/JuanjEC/JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=JuanjEC_JuanJeronimoEcheverry-ArqdeSoft-Laboratorio2-Faker)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```

### Evidences

El paso a paso del laboratorio, con las evidencias del pipeline y del despliegue, está en [PASOS_SEGUIDOS.md](PASOS_SEGUIDOS.md).