# 🎲 Juego de Dados
observación: el código no fue autogenerado con VP, ya que la licencia que entrega la universidad, ya no es válida y tuve complicaciones con el programa de Visual Paradigm. Adjunte la captura del Diagrama de clases hecho en VM online y el archivo adjuntado del diagrama fue exportado de este mismo.
## ✅ Identificación de clases del dominio

Para el caso del juego de dados se identifican tres clases principales:

- **Dado**: Representa un dado físico que puede ser lanzado y mostrar un valor aleatorio entre 1 y 6 en su cara superior.
- **Calculadora**: Se encarga de realizar operaciones aritméticas simples, en este caso la suma de dos números enteros.
- **Juego**: Controla la lógica principal del juego, lanzando los dados, usando la calculadora para sumar los resultados y determinando si el jugador gana o pierde.

---

## ✅ Atributos y métodos por clase

### 🔹 Dado

- **Atributo**:  
  - `caraSuperior` de tipo `int`, que almacena el valor visible del dado luego de ser lanzado.

- **Métodos**:
  - `lanzar()`: simula el lanzamiento del dado generando un número aleatorio entre 1 y 6.
  - `getCaraSuperior()`: devuelve el valor actual de la cara superior del dado.

---

### 🔹 Calculadora

- **Atributos**:  
  - No tiene atributos.

- **Métodos**:
  - `sumar(int a, int b)`: retorna la suma de los dos números enteros que recibe como parámetros.

---

### 🔹 Juego

- **Atributos**:
  - `dado1` y `dado2`, ambos de tipo `Dado`.
  - `calculadora`, de tipo `Calculadora`.

- **Métodos**:
  - `jugar()`: lanza ambos dados, obtiene el valor de sus caras superiores, utiliza la calculadora para sumar esos valores y retorna un mensaje indicando si el jugador ha ganado (cuando la suma es 7) o ha perdido.

---

## ✅ Relaciones entre clases

- **Asociación**:  
  La clase `Juego` está asociada a la clase `Dado`, ya que contiene dos objetos `Dado` como atributos. Estas instancias existen mientras el juego está activo.

- **Agregación**:  
  La clase `Juego` tiene una relación de agregación con la clase `Calculadora`, ya que la utiliza como herramienta para realizar la suma, pero la calculadora podría existir por separado y ser usada por otras clases.

- **Dependencia**:  
  La clase `Juego` depende de `Dado` y `Calculadora` para ejecutar su lógica. Sin estas clases, no podría realizar su funcionamiento principal.
