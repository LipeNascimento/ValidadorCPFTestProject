# ValidadorCPFTestProject

Projeto simples em Java que demonstra a prática de **testes unitários** utilizando o framework **JUnit 5**. A aplicação consiste em uma classe responsável por validar strings que representam CPFs (Cadastro de Pessoa Física) testes que cobre cenários básicos.

## 📌 Objetivos

- Aplicar conceitos de testes unitários em Java
- Praticar o uso do JUnit 5
- Promover qualidade e confiabilidade no código
- Servir como exemplo para aprendizado de testes automatizados

## 🛠️ Tecnologias utilizadas

- Java
- Maven
- JUnit 5

## ✅ Funcionalidades testadas

O método `validarCPF` é testado para os seguintes casos:

- CPF com exatamente 11 dígitos
- CPF contendo letras (deve ser inválido)
- CPF com menos de 11 caracteres
- CPF nulo
- CPF com todos os dígitos iguais (ex: "11111111111")