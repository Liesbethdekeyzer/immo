# Spring GCP: Real estate projects Rest Service
**About**

The project integrates Spring boot, Hibernate, GCP Cloud Sql, GCP Secret Manager, GCP App Engine. 
Circleci is used to run te the test and deploy on the GCP platform

## Overview
This demo is built with Spring Cloud, Spring GCP and Maven. The app is a simple Real estate manager API endpoint 
and should be accessible on

    TBD
    curl https://{url}/projects/1
    curl https://{url}/projects/2/units

The app will bootstrap a database using Spring Hibernate and should access the data over the rest API endpoint.

## Bill of Materials
**Dependencies**
| Dependency                             | Version |
|----------------------------------------|---------|
| spring-boot-starter-parent             | 2.2.6   |
| Java                                   | 1.8     |
| spring-boot-starter-data-rest          | 1.2.3   |
| spring-boot-starter-data-jpa           | 1.2.3   |
| mysql-connector-java                   | 1.2.3   |
| spring-cloud-gcp-starter               | 1.2.3   |
| spring-cloud-gcp-starter-sql-mysql     | 1.2.3   |
| spring-cloud-gcp-starter-secretmanager | 1.2.3   |

**Plugins**
| Plugin                   | Version |
|--------------------------|---------|
| spring-boot-maven-plugin |         |
| maven-dependency-plugin  | 2.0     |
| appengine-maven-plugin   | 2.2.0   |