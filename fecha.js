const moment = require("moment");
moment.locale('es');
var fecha = new Date();
console.log(fecha);
console.log(fecha.getDate(),fecha.getMonth()+1,fecha.getFullYear());
console.log(moment().format('MMM Do YYYY,h:mm:ss a'));
console.log(moment().format('dddd'));
console.log(moment().format('h:mm:ss a'));