//Пункт 1. Создать Closure для деления двух чисел (a/b)
def division = { a, b -> a / b }

//Пункт 2. Создать Closure для вычитания двух чисел (d-c)
def subtraction = { d, c -> d - c }

//Пункт 3. Создать Closure для выполнения операции a/b –c, используя две предыдущих Closure.
def finalFunction = { a, b, c ->
    println("${a}/${b} - ${c} = "
            + subtraction(division(a, b), c))
}

finalFunction(9, 3, 2)