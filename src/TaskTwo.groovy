import groovy.time.TimeCategory

// Пункт 1. Сравнение методов типа Integer и int
Integer methodInteger(Integer a) {
    return a;
}

int methodInt(Integer a) {
    return a;
}

//methodInteger(null);
//methodInt(null);

// Пункт 2. Сравнение двух экзмепляров класс BigDecimal
println("Пункт 2")
BigDecimal decimal1 = new BigDecimal(1.5);
BigDecimal decimal2 = new BigDecimal(1.5);
println(decimal1.is(decimal2)); //false
println(decimal1 == decimal2); //true
println(decimal1.equals(decimal2)); //true
println(decimal1<=>decimal2);
println(decimal1.compareTo(decimal2));

//Пункт 3. Сравнение работы методов add, divide и multiply и обычных операндов +, / и *
println("Пункт 3")
println("\tusing methods\n" + decimal1 + "/" + decimal2 + " = " + decimal1.divide(decimal2))
println(decimal1 + " * " + decimal2 + " = " + decimal1.multiply(decimal2))
println(decimal1 + " + " + decimal2 + " = " + decimal1.add(decimal2))
println("\tusing operators\n" + decimal1 + "/" + decimal2 + " = " + decimal1 / decimal2);
println(decimal1 + " * " + decimal2 + " = " + decimal1 * decimal2)
println(decimal1 + " + " + decimal2 + " = " + (decimal1 + decimal2))

//Пункт 4.	Создайте переменную без указания типа и присвойте ей значение 10. Получится ли присвоить этой же переменной значение ‘f’ или значение ‘First’. Проверьте тип этой переменной при помощи метода getClass().getName().
// Попробуйте поменять последовательность этих присвоений – сперва ‘f’, потом ‘First’, потом 10 и т.д.
println("Пункт 4")
def newVar = 10;
println('\n10 is ' + newVar.getClass().getName());
newVar = 'f';
println('"f" is ' + newVar.getClass().getName());
newVar = 'First';
println('"First" is ' + newVar.getClass().getName());

def newVar2 = 'f';
println('\n"f" is ' + newVar2.getClass().getName());
newVar2 = 'First';
println('"First" is ' + newVar2.getClass().getName());
newVar2 = 10;
println('10 is ' + newVar2.getClass().getName());

//Пункт 5. Создать переменные типа Date, вычесть одну дату из другой.
println("Пункт 5")
Date date1 = new Date("02/28/15");
Date date2 = new Date("01/31/2015");
println("\n28.02.2015 - 31.01.2015 = " + (date1 - date2));

use (TimeCategory){
    date1 = date1 - 1.month;
    println("28.02.2015 - 1 month = " + date1);
    println("28.02.2015 + 1 month - 1 day = " + (date1 + 1.month + 1.day));
}






