# Microservicios-Cursos-Formacion
<p>El proyecto tiene una base de datos llamada <b>Cursos</b>,
  en la que utilizaremos los métodos CRUD para hacer operaciones en ella.</p>
<h3>Este proyecto consta de 2 partes:</h3>
<ol>
  <li><b>Cursos</b></li>
  <h4>Es el encargado de conectar con la tabla <i>cursos</i> de la base de datos.</h4>
  Tenemos una entity llamada Curso, que tiene unas variables:
  <ul>
    <li>codCurso: Es el identificador único para cada curso</li>
    <li>nombre: Es el nombre del curso</li>
    <li>duracion: La duración del curso</li>
    <li>precio: El precio del curso</li>
  </ul>
  <p>A su vez tiene un constructor con los parámetros de estas variables y sus getters y setters</p>
  <p>Tenemos el paquete <b>inicio</b> que es el punto de entrada</p>
  <p>También el paquete <b>dao</b> que es el encargado de conectar con JpaRepository para tener sus métodos de persistencia.</p>
  <p>Contamos con un paquete <b>controller</b> el cual es el encargado de definir las rutas y los métodos (<i>GET, POST, PUT y DELETE</i>)
    para obtener los datos de los cursos,insertar uno nuevo, actualizar los existentes o para borrar</p>
  <p>Tenemos 3 métodos get:</p>
  <ol>
    <li>buscarCurso: El cual recibe por parámetro el id del curso y lo retorna</li>
    <li>verCursosPorPrecio: El cual recivbe por parámetro el precio máximo y el precio mínimo,
    Estos nos sirven para determinar el rango de precios del curso, y si lo encuentra lo retorna en un ArrayList</li>
    <li>verCursos: Este método retorna un List de todos los cursos</li>
  </ol>
  <p>Por último tenemos el paquete <b>service</b> que es el encargado de implementar la lógica de los métodos y hacer las llamadas a la <i>BD</i></p>
  
  <li><b>Formacion</b></li>
  <h4>Es el encargado de conectarse con el microservicio <i>curso</i>y pedir datos de él</h4>
  Tenemos una entity llamada Formacion,es una clase espejo de Curso pero con una variable más, las variables que tiene son:
  <ul>
    <li>nombre: Es el nombre del curso</li>
    <li>duracion: La duración del curso</li>
    <li>precio: El precio del curso</li>
    <li>asignaturas: Estas se calculan en relación a la duración del curso</li>
  </ul>
  <p>Tiene un constructor con los parámetros de estas variables salvo el de asignaturas y sus getters y setters</p>
  <p>Tenemos el paquete <b>inicio</b> que es el punto de entrada</p>
  <p>Está el paquete <b>controller</b> que se ocupa de realizar el alta del curso (POST) y de obtener los cursos (GET)</p>
  <p>Por último tenemos el paquete <b>service</b> que se encarga de definir e implementar estos métodos de conexión</p>
  </ol>
