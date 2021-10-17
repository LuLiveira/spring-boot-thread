# Obervações 
- O método assincrono não pode fazer parte da classe a qual esta sendo chamado
- É possivel configurar um bean da classe `ThreadPoolTaskExecutor` para colocar configurações personalizadas
- É preciso habilitar a função através da anotação `@EnableAsync` podendo ser feita na classe `Application.class` ou em uma class de configuração