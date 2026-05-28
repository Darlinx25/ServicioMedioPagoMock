# ServicioMedioPagoMock
Compilamos y levantamos server con:
```
mvn clean package wildfly:dev
```
Levantamos con esto para exponer la IP que necesitamos al encontrarse el servidor principal corriendo por docker 
```
target/server/bin/standalone.sh -Djboss.socket.binding.port-offset=100 -b 0.0.0.0
```


cURL para probar api:
```
curl -X POST -v http://localhost:8180/ServicioMedioPagoMock/api/procesar-pago -H "Content-Type: application/json" -d '{"numeroTarjeta":"1111222233334444"}'
```

Los puertos son +100 (8180 y 10090)
