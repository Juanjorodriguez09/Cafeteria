# Cafeteria
# Observer
## Pregunta de Discusión
**¿Qué pasa si queremos agregar más observadores (ej: repartidor)?**

Si queremos agregar más observadores, como un Repartidor, el diseño del patrón Observer permite hacerlo de manera sencilla y flexible. Basta con crear una nueva clase Repartidor que implemente la interfaz Observador y suscribirla al Pedido mediante el método agregarObservador. Esto no requiere modificar la clase Pedido ni la lógica existente, ya que el patrón está diseñado para manejar una relación uno-a-muchos. Por ejemplo, después de agregar un Repartidor, al cambiar el estado del Pedido (como "Listo"), tanto el Cliente, la Cocina como el Repartidor recibirán la notificación automáticamente. Esto demuestra la escalabilidad y el desacoplamiento que ofrece el patrón.


# Mediator
## Pregunta de Discusión
**¿Cómo afecta esto la escalabilidad si añadimos más roles?**

la clase MediatorPedidos tiene atributos explícitos para cada rol (Cajero, Barista, Repartidor) y la lógica de envío de mensajes está codificada de forma rígida en el método enviar. Significa que cada vez que se agregue un nuevo rol, se tendrá que:

Añadir un nuevo atributo en MediatorPedidos para ese rol.
Modificar el constructor para recibir el nuevo rol.
Modificar el método enviar para manejar los nuevos casos con más condicionales if o else if.

Esto afecta negativamente la escalabilidad porque el código se vuelve más difícil de mantener y entender a medida que crecen los roles y cada cambio requiere modificar varias partes del mediador, aumentando el riesgo de errores., por ende no es flexible: agregar o quitar roles implica cambios estructurales en la clase ya que afecta la escabilidad

# Memento
## Pregunta de Discusión
**¿Qué información debe guardarse en el memento?**

El memento debe guardar el estado del pedido (por ejemplo, "EnEspera") como mínimo para cumplir el objetivo. Además, se recomienda incluir la lista de productos, la fecha y hora del estado, y detalles del cliente si están disponibles, para garantizar una restauración completa y adaptable a futuras necesidades.

# State
## Pregunta de Discusión
**¿Cómo simplifica esto el código en comparación con usar condicionales?**

El patrón State simplifica el código al encapsular la lógica de cada estado (En espera, En preparación, Listo, Entregado) en clases separadas, eliminando condicionales complejos en `Pedido`. Sin este patrón, tendríamos que usar estructuras como `if-else` o `switch` para manejar las transiciones y comportamientos de cada estado dentro de `Pedido`, lo que haría el código difícil de mantener y propenso a errores. Por ejemplo, un método como `siguienteEstado()` tendría múltiples condicionales para determinar el próximo estado. Con el patrón State, cada clase concreta (`EnEsperaState`, etc.) define su propia lógica, y `Pedido` simplemente delega el comportamiento al estado actual (`estadoActual.siguienteEstado(this)`). Esto hace que el código sea más modular, escalable (por ejemplo, añadir un estado "En pausa" solo requiere una nueva clase), legible y menos propenso a errores, ya que las transiciones y reglas están claramente definidas en cada estado.