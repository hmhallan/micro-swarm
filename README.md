

## Dados
* Projeto que tem packaging "war" como tipo
* Possui um plugin para gerar o projeto em um JAR executável


## Build
* fazer o build normalmente (mvn clean package)

# Run (uma das opções abaixo)
* java -jar ./target/micro-swarm-swarm.jar
* mvn wildfly-swarm:run
* Rodar do eclipse: run class `org.wildfly.swarm.Swarm`


# Acessar:
http://localhost:8080/health