# Criptografia de Mensagens

Projeto Java Spring Boot para criptografar e descriptografar mensagens usando AES.

## Funcionalidades

- Criptografa mensagens recebidas via API REST
- Descriptografa mensagens criptografadas
- Retorna respostas em formato JSON

## Como executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Compile e rode o projeto:**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Endpoints disponíveis:**

   - `POST /mensagem`  
     Envia uma mensagem para ser criptografada.  
     Exemplo de corpo:
     ```json
     {
       "mensagem": "texto a ser criptografado"
     }
     ```

   - `GET /mensagem/descriptografar`  
     Retorna a mensagem descriptografada em JSON:
     ```json
     {
       "mensagem": "texto original"
     }
     ```

## Requisitos

- Java 17+
- Maven 3.9+

## Licença

Este projeto está licenciado sob a [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
