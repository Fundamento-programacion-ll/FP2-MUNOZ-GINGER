var json1 = {
    nombre: "Ginger",
    edad: 19,
    casado: false,
    mascota: ['cachetes'],
    colegio: {nombrecolegio:'AFC'},
    telefono: 0996013653
};

console.log(json1);
console.log('hola');
var jsong ={
    nombre:"Ginger",
    apellido:"Muñoz",
    edad:"19"
};
console.log(json1+jsong);
var nu=null;
console.log(typeof nu);
var numero = 1;
console.log(json1+numero);

var mifuncion = function(){

    console.log('funcion 1');
    return 123;
};


var mifuncion=function(n1,n2){
    return n1+n2;
};
var mifuncion2=(n1,n2)=>{
    return n1+n2;
};

console.log(mifuncion2(4,5));
console.log(mifuncion(5,4));