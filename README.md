# 📦 POO Interfaces y Repositorios en Java

> **Ejemplo práctico de Programación Orientada a Objetos (POO)** implementando **interfaces** y el patrón **Repositorio** en Java.

---

## 🚀 Descripción

Este proyecto demuestra cómo implementar un sistema de gestión de datos utilizando **interfaces** y el patrón **Repositorio** en Java.  
Se aplican principios clave de la **POO** como:

- Abstracción
- Polimorfismo
- Encapsulación

El resultado es una solución **flexible, modular y fácil de mantener**.

---

## 🛠 Tecnologías utilizadas

- ☕ **Java 11+**
- 💻 **IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans
- 🌱 **Control de versiones:** Git

---

## 📂 Estructura del proyecto

```
src/
├── modelo/               # Clases de dominio (Producto, Cliente, etc.)
├── repositorio/          # Interfaces para operaciones CRUD
├── repositorio/lista/    # Implementaciones concretas basadas en listas
└── app/                  # Clase principal con ejemplos de uso
```

---

## ⚙️ Funcionalidades principales

✅ Interfaces genéricas para operaciones **CRUD**  
✅ Implementación de repositorios en memoria con listas  
✅ Polimorfismo para manejar distintos tipos de objetos  
✅ Métodos de paginación, ordenación y filtrado  
✅ Uso de genéricos para **reutilización de código** y **tipado seguro**

---

## 🏃 Ejecución

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tuusuario/poo_interfaces_repositorio.git
   ```
2. **Abrir el proyecto** en tu IDE preferido.
3. **Ejecutar la clase principal** `EjemploRepositorioProducto` para ver un demo básico.

---

## 💡 Ejemplo rápido

```java
Repositorio<Producto> repo = new ProductoListRepositorio();

repo.crear(new Producto("Laptop", 1200.00));
repo.crear(new Producto("Smartphone", 700.00));

repo.listar().forEach(p ->
    System.out.println(p.getNombre() + " - $" + p.getPrecio())
);
```

---

## 🤝 Contribuciones

Las contribuciones son bienvenidas.  
Puedes abrir un **issue** o enviar un **pull request** con mejoras o correcciones.

---

## 📄 Licencia

MIT License © 2025  
**Ismael García Aquino**

---

## 📬 Contacto

- ✉ **Email:** [ismaelgar336@gmail.com](mailto:ismaelgar336@gmail.com)  
- 🔗 **LinkedIn:** [linkedin.com/in/ismael-garcía-aquino](https://linkedin.com/in/ismael-garcía-aquino)
