var arreglo=[
    {nombre:'Ginger',
apellido: 'Muñoz',
edad: 19},
{nombre:'Juan',
apellido:'Jimenes',
ediad:45}
];
 var buscarUnUsuario=(arreglo,usuarioaBuscar)=>{
     var usuarioEncontrado=arreglo.find(usuario=>{
         return usuario.nombre === usuarioaBuscar;
     });
     console.log(usuarioEncontrado);

 };
 buscarUnUsuario(arreglo,('Ginger'));

 var agregarUsuario=(arreglo,nombre,apellido,edad)=>{
     arreglo.unshift({nombre,apellido,edad});
     console.log(arreglo);
 };
 agregarUsuario(arreglo,'Paola','ASD',20);

 var buscarUnUsuarioyagregar=(arreglo,nombre)=>{
     var usuarioEncontrado =arreglo.find(usuario=>{
return usuario.nombre === nombre;
     });

     if(usuarioEncontrado===undefined){
         console.log('El usuario no existe');
         agregarUsuario(arreglo,nombre,'asdf','aff',21);
     }else{
         console.log(usuarioEncontrado);
     }       
     };
     buscarUnUsuarioyagregar(arreglo,'ASDDF');
     var eliminarUusario=(arreglo,nombre)=>{
         var usuarioEncontrado=arreglo.filter(usuario=>{
             return usuario.nombre !==nombre;
         });
         console.log(usuarioEncontrado);
     };
     eliminarUusario(arreglo,'ASDDF')
 

