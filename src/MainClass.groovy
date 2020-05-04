
// Урок 1.

// Пункт 8. Проверка работы с конструкторами
println("\nПункт 8")
/*
//Создание экземпляра класса без создания конструктора
FirstClass personBoris = new FirstClass(name: "Boris", age: 55, gender: "Male");
*/

//Создание экземпляра класса при создании явного конструктора
FirstClass personBoris = new FirstClass(name = "Boris", age = 55, gender = "Male");
personBoris.printInfo();


//Пункт 9. При помощи экземпляра класса Binding задать значение переменных экземпляра класса FirstClass и получите это значение.
println("\nПункт 9")
Binding binding = new Binding();
binding = personBoris.getProperties(); //передача свойств класса FirstClass

// задание значений переменных
binding.setProperty("name", "Boriska");
binding.setProperty("age", 25);
binding.setVariable("age", 25)

//получение значений переменных
println("binding... name: " + binding.getVariable("name") + ", gender: " + binding.getVariable("gender") + ", age: " + binding.getVariable("age"))
personBoris.printInfo()


//Пункт 10. Различие между instanceof между java и groovy
println("\nПункт 10")
println(String instanceof Integer) //false
String str = "hmm"
println(str instanceof Integer) //false

// Пункт 11. Проверка необходимости оператора def и явного указания типа для «сокрытия» переменных уровня экземпляра.
println("\nПункт 11")
println(personBoris.name)
personBoris.birthDay()
personBoris.printInfo()

//Пункт 12. Создание метода с возвращаемым значением типа Integer, но без оператора return
println("\n Пункт 12")
Integer sum( a, b){
    c = a + b;
}

println(sum(20, 30))

