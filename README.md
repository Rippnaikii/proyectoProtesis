# Sistema de Análisis de Marcha - Prótesis Inteligente 
Un sistema integral de software y hardware diseñado para medir, analizar y registrar el impacto de la marcha (Fuerza de Reacción del Suelo - GRF) en pacientes con prótesis de miembro inferior. 

El objetivo de este proyecto es capturar datos físicos a través de sensores, procesarlos mediante un microcontrolador y visualizarlos en una aplicación de escritorio para facilitar el ajuste y la calibración médica de la prótesis.

## Estado del Proyecto: En Desarrollo (Fase 1 completada)

Actualmente, el proyecto se encuentra construyendo la arquitectura de software. La lógica de negocio y la interfaz de usuario están funcionales y preparadas para recibir el hardware físico.

### Características Actuales (Software):
* **Arquitectura POO:** Estructura orientada a objetos desarrollada en Java.
* **Interfaz Gráfica (GUI):** Formulario clínico interactivo construido con `javax.swing` para el registro ágil de pacientes (Nombre, Edad, Nivel de Amputación, Peso).
* **Generación de Reportes:** Módulo de persistencia de datos que exporta el historial de pasos críticos a un archivo `.csv` (compatible con Excel).
* **Validación de Datos:** Control de errores y validación de tipos de entrada en tiempo real.

## Roadmap (Hoja de Ruta)

- [x] **Fase 1:** Lógica de análisis en consola (Java) y exportación de datos.
- [x] **Fase 2:** Construcción de la Interfaz Gráfica de Usuario (GUI) con Java Swing.
- [ ] **Fase 3:** Programación del microcontrolador ESP32 (C/C++) para lectura analógica (ADC).
- [ ] **Fase 4:** Integración de hardware: Sensores de Fuerza (FSR) y circuito divisor de voltaje.
- [ ] **Fase 5:** Puente de comunicación: Transmisión de datos en tiempo real vía Serial/USB desde el ESP32 hacia la aplicación Java.

## Tecnologías Utilizadas

**Software de Escritorio:**
* Lenguaje: **Java** (JDK 21+)
* Interfaz Visual: **Java Swing**
* Entorno: **Eclipse IDE**

**Hardware y Microcontroladores (Próximamente):**
* Lenguaje: **C++**
* Placa: **ESP32 DevKit V1**
* Entorno: **Arduino IDE**
* Sensores: Resistencias Sensibles a la Fuerza (FSR)

---
*Desarrollado como proyecto personal de ingeniería.*
