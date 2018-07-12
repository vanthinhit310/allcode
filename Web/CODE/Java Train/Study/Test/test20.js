// var obj = {};
// //
// // obj.name = 'thinh'; // gán name
// //
// // console.log(obj.name);


function Person(name, age) {
    this.name = name;
    this.age = age;

    this.getName = function () {
        return this.name;
    }
}

Person.prototype.getAge = function () {
  return this.age;
};

function SV() {
    this.getName = function () {
        return this.name;
    }
}

SV.prototype = Person;


var p1 = new Person('thinh',18);
console.log(p1.getAge());