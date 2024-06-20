# Consumo da API ViaCEP

![NPM](https://img.shields.io/npm/l/react)

Aplicação desenvolvida usando **Java, Maven e Jackson Databind.**

Este projeto em Java consome a API do ViaCEP para obter informações detalhadas de endereços brasileiros com base no CEP fornecido.

## Configuração

Pré-requisito: Java 17

Clone o repositório:
```bash
git clone https://github.com/isinhah/api-viacep.git
```

## Execução

1. Instale as dependências com Maven

2. Insira o CEP desejado no arquivo `Main.java`

3. Execute o arquivo `Main.java`

## Exemplo de dados retornados

```
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "unidade": "",
  "ibge": "3550308",
  "gia": "1004"
}
```

## Autor

Isabel Henrique

https://www.linkedin.com/in/isabel-henrique/