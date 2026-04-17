# Calculadora Java Swing (MVC + exp4j)

Proyecto de calculadora desarrollada en Java Swing, siguiendo el patrón de arquitectura MVC (Modelo–Vista–Controlador) e integrando la librería externa exp4j 0.4.8 para la evaluación de expresiones matemáticas.

---

## Características

- Interfaz gráfica con Java Swing
- Arquitectura MVC (Modelo–Vista–Controlador)
- Evaluación de expresiones matemáticas complejas
- Operaciones básicas: suma, resta, multiplicación, división
- Soporte para paréntesis y prioridades matemáticas
- Uso de la librería externa exp4j-0.4.8
- Código modular y mantenible

---

## Arquitectura del proyecto (MVC)

### Modelo (Model)
Responsable de la lógica de negocio y cálculos matemáticos.

- Uso de exp4j para evaluar expresiones
- Gestión de operaciones matemáticas

---

### Vista (View)
Interfaz gráfica construida con Java Swing.

- Botones numéricos (0–9)
- Operadores (+, -, *, /)
- Pantalla de resultados
- Diseño tipo calculadora estándar

---

### Controlador (Controller)
Conecta la vista con el modelo.

- Gestiona eventos de botones
- Envía expresiones al modelo
- Actualiza la interfaz con resultados

---

## Librería externa

Este proyecto utiliza exp4j 0.4.8.

Funcionalidades principales:
- Parsing de expresiones matemáticas
- Soporte para operadores matemáticos
- Evaluación precisa de expresiones

---

## Instalación y ejecución

### 1. Clonar el repositorio
```bash
git clone https://github.com/usuario/calculadora-mvc.git
