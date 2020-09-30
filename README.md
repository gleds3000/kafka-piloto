# kafka-piloto

para utilizar 
start zookeeper 
start kafka 

---- Procedimento  na minha maquina
'''  
Users/taghbr/Ambiente/springboot/KafkaGleds
  kafka-topics.sh --bootstrap-server localhost:9092 --create --topic piloto
  kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic piloto --from-beginning
'''
