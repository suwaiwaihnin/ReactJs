# プロダクト課題　CRUD処理

# 目標

このプロジェクトはプロダクトの名前、値段などの CRUD 処理の REST API をするレポジトリです。

# 前提

- Java 18
- Spring Boot 2.7.1
- Docker 20.10.17
- MySQL 

# Getting Started

- $ git clone https://github.com/suwaiwaihnin/Spring-Boot.git

- cd Spring-Boot

- $ docker-compose up -d

- $ ./mvnw spring-boot:run

 Postman　アプリに 
- http://localhost:8080/products にアクセスするとデータが表示されます。
- http://localhost:8080/products/1 を GET　Method でアクセスするとこの ID のデータが表示されます。
- http://localhost:8080/products/1 を変更したいデータと　PUT Method でアクセスすると前のデータは変更されます。
- http://localhost:8080/products/1 を DELETE Method　でアクセスするとデータが削除されます。
