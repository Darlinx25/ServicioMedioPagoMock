# ServicioMedioPagoMock
Compilamos y levantamos server con:
```
mvn clean package wildfly:dev
```

cURL para probar api:
```
curl -X POST -v http://localhost:8180/ServicioMedioPagoMock/api/procesar-pago -H "Content-Type: application/json" -d '{"numeroTarjeta":"1111222233334444"}'
```

Los puertos son +100 (8180 y 10090)
