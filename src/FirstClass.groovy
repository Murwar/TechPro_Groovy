// Создание класса Person для выполнения пунктов из Урока 1. Проверка работы с конструкторами
class FirstClass {
    private Integer age;
    private def name;
    def gender;

    def hiddenFields = {
        def nationality = 'global citizen'
    }

    //Явный конструктор
    FirstClass(name, age, gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Вывод основной информации о человеке
    def printInfo(){
        println("name: " + this.name + ", gender: " + this.gender + ", age: " + this.age);
    }

    private def birthDay(){
        ++age;
    }
}
