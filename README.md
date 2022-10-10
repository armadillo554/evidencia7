Actividades a realizar:
1.- Este problema cuenta con dos clases, “Calculadora”, la cual representa las 
operaciones matemáticas a ocupar en la otra clase, “CarroCompra”, que se encarga 
de administrar un carro de compras simple y calcula el total de la compra 
resultante del carro.

2.- En lo que respecta a los atributos de las clases, en ambos casos sus atributos 
tienen un nivel de encapsulamiento “private”, por lo que estos atributos solamente
son modificables por medio de sus clases correspondientes. Se puede ver también
que existe una relación de dependencia entre la clase CarroCompra y la clase 
Calculadora, ya que en el método “subtotal” de la clase CarroCompra se instancia 
un objeto Calculadora, para luego utilizar uno de los metodos en el objeto creado.

