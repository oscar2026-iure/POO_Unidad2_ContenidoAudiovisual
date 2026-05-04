# POO_Unidad2_ContenidoAudiovisual

## 1. Descripción del Proyecto
### Propósito y Objetivos
Este proyecto es una aplicación de consola desarrollada en Java bajo el paradigma de **Programación Orientada a Objetos**. El objetivo principal es gestionar y catalogar diversos formatos de contenidos audiovisuales aplicando conceptos avanzados como herencia, polimorfismo dinámico y relaciones de agregación/asociación.

### Problema que resuelve
La aplicación centraliza información técnica de diferentes formatos de video en un sistema extensible. En esta versión, se ha integrado contenido especializado de **Ciberseguridad** para organizar recursos educativos sobre respuesta a incidentes (CSIRT) y aprendizaje técnico, resolviendo la dispersión de información en entornos de capacitación técnica.

---

## 2. Nuevas Clases y Funcionalidades
Se han integrado las siguientes clases para cumplir con los requerimientos de modelado avanzado:
*   **Actor e Investigador:** Implementadas mediante relaciones de **Asociación** con Película y Documental respectivamente.
*   **Temporada:** Integrada mediante **Agregación** en la clase Serie de TV.
*   **CSIRT y VideoCiberseguridad:** Subclases originales que heredan de la clase abstracta, permitiendo gestionar niveles de alerta y organismos responsables.

---

## 3. Instrucciones para Clonar y Ejecutar
Para utilizar este proyecto localmente, siga estos pasos:

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/oscar2026-iure/POO_Unidad2_ContenidoAudiovisual.git](https://github.com/oscar2026-iure/POO_Unidad2_ContenidoAudiovisual.git)
