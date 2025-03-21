💪 Fitly - Calculadora de Calorías y IMC
Este es un proyecto de escritorio desarrollado con Java Swing y JPA para la gestión de una base de datos MySQL. La aplicación tiene como objetivo ayudar a los usuarios a calcular sus calorías diarias y su Índice de Masa Corporal (IMC), además de permitirles llevar un historial de registros con la opción de crear, modificar y eliminar los datos guardados.

🚀 Funcionalidades
Cálculo de calorías diarias: Basado en tus datos personales (peso, altura, edad) y el nivel de actividad física, la aplicación te ayudará a calcular la cantidad de calorías necesarias para:
Mantener tu peso
Bajar de peso
Aumentar masa muscular
Cálculo de IMC: Te permite saber si tu IMC está en un rango saludable o no, basándose en tus datos.
Historial de registros: Guarda todos tus cálculos e históricos de manera persistente en una base de datos MySQL, permitiéndote ver, modificar y eliminar registros cuando desees.
⚙️ Tecnologías utilizadas
Java 17
Swing (para la interfaz gráfica de usuario)
JPA (Java Persistence API) con Hibernate (para la conexión y gestión de la base de datos MySQL)
MySQL (Base de datos local)
Arquitectura por capas (Igu - Controladora - Persistencia)
🛠️ Instalación y configuración
Clonar el repositorio:

bash
Copiar
Editar
git clone https://github.com/emi-pereyra17/Fitly.git
Configurar la base de datos MySQL:

Crea una base de datos llamada fitly en MySQL (si aún no lo has hecho).

Configura la conexión a la base de datos en el archivo application.properties (en el paquete de configuración, si lo tienes), con los siguientes parámetros:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/fitly
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
Ejecutar la aplicación:

Compilá y ejecutá la aplicación desde tu IDE preferido (como IntelliJ IDEA o Eclipse).
Si preferís compilarla en un archivo .jar, podés usar el comando mvn clean install si usás Maven, o el equivalente si usas Gradle.
👨‍💻 Autor
Emiliano Pereyra
📧 [Email: emiacebal2012@hotmail.com]
💼 [LinkedIn: www.linkedin.com/in/emiliano-pereyra-52164a29b]
