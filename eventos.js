const EventEmitter = require('events');
class eventoUno extends EventEmitter{}
var instanciaEventoUno = new eventoUno();
instanciaEventoUno.on('saludar',respuesta =>{
console.logg('hola');
});
instanciaEventoUno.emit('saludar','Ginger');
 
 