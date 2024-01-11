# Email Microservice
## Desafio Backend da Uber

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é a construção de uma API utilizando as stacks **Java, Java Spring e AWS Simple Email Service.**

Realizei o desenvolvimento do Microservice com base no vídeo [Youtube Channel](https://youtu.be/eFgeO9M9lLw?si=uyhUXrR-NLEpBW6p), o qual foi demonstrado a resolução do [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Aprendizado

Foi de grande importância realizar a resolução desse desafio backend, pois consegui compreender como funciona um teste técnico de uma empresa e também obter novos conhecimentos sobre mensageria via email service com AWS através de um profissional que já atua na área que desejo ingressar.

## Sumário

- [Instalação](#installation)
- [Configuração](#configuration)
- [Uso](#usage)
- [API Endpoints](#api-endpoints)
- [Banco de dados](#database)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/JaasielAntunes/uber-email-service.git
```

2. Instale as dependências com o Maven

3. Atualize o `application.properties` inserindo suas credenciais do AWS

```yaml
aws.region=us-east-1
aws.accessKeyId=
aws.secretKey=
```
## Uso

1. Inicie a aplicação com o Maven
2. A API é acessível na porta http://localhost:8080

## API Endpoints
A API fornece o endpoint:

**GET EMAIL**
```markdown
POST /api/email - Enviar o e-mail do remetente para o destinatário
```

**BODY da requisição**
```json
{
  "to": "exemplo@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```
