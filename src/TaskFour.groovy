import groovy.sql.Sql

def db = [url: 'jdbc:mysql://localhost:3306/world?serverTimezone=UTC', user: 'root', password: '2020', driver: 'com.mysql.cj.jdbc.Driver']
def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)
def resultList = new ArrayList()
sql.eachRow("SELECT ID, Name, CountryCode, Population FROM city")
        { resultSet ->
            resultList.add(resultSet.ID - 1,
                    [name: "${resultSet.Name}",
                     countryCode: "${resultSet.CountryCode}",
                     population: resultSet.Population])
        }

resultList.each {
    println(it)
}

println(resultList.size())