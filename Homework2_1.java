// Дана строка sql-запроса:

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
//Если значение null, то параметр не должен попадать в запрос.

// Напишите свой код в методе answer класса Answer. 
//Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами



class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder();
        

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework2_1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}