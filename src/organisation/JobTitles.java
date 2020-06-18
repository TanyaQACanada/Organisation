package organisation;

//Создайте перечисление JobTitles названий должностей, предусмотреть следующие должности:  
//	начальник подразделения (DepartmentBoss);
//	инженер (Engineer);
//	секретарь (Сlerk);
//	директор (BigBoss);
//	придумайте еще 2-3 должности.  

//Перечисления представляют набор логически связанных констант. 
//Объявление перечисления происходит с помощью оператора enum, после которого идет название перечисления.  
//Перечисление объявляют вне класса или в отдельном файле.
	
public enum JobTitles {
	BIG_BOSS,
	DEPARTMENT_BOSS,
	BUSINESS_ANALYST,
	ENGINEER,
	TESTER,
	СLERK,
	BARISTA
}