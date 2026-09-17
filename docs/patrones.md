a. Singleton permite tener una instancia unica de un objeto, 
pero puede tener un problema fuerte de acoplamiento porque las 
clases generalmente acceden directamente a Singleton. Para solucionar esto 
se puede crear una interfaz y hacer que las clases de alto nivel 
dependan de esa abstraccion.

b. Dentro de este esjercico aparece dos veces; En ConsecutivoFacrura donde
se define el metodo y en la parte de taquilla que necesita usar el consecutivo.
Pero a la hora de trabajar en un proyecto mas grande realmente no esxite un
numero fijo de veces que aparezca getInstancia().

c. En Singleton se utiliza para impedir que se se creen otros objetos desde 
fuera con new, de esta manera solo existe una unica instancia.
En Builder se usa para que no se cree el objeto final directamente sino que 
tenga que pasar primero por el Builder, donde se configuran y validan los datos.

d. De las cuatro clases la que podria necesitar un Builder seria Funcion, ya que 
puede tener muchos datos y estos pueden variar dependiendo del servicio, mientras 
que las demas se pueden manejar con un constructor simple.

e. El Builder no deberia llamar directamente a ConfiguracionCine ya que esto crea 
un acomplamiento fuerte entre Compra y el Singleton. En lugar de eso el Builder debe 
recibir dierctamente el IVA, para evitar el acoplamiento y respetar el DIP.