import builder.*;

public class Main {
    public static void main(String[] args) {

        //MySQL Query
        QueryBuilder mysqlB = new MySQLQuery();
        QueryDirector mysqlDirector = new QueryDirector(mysqlB);

        String mysqlQuery = mysqlDirector.GetUsers(); //using only function from director
        System.out.println("MySQL Query:\n" + mysqlQuery);

        //PostgreSQL Query
        QueryBuilder postgresB = new PostgreSQLQuery();
        QueryDirector postgresDirector = new QueryDirector(postgresB);

        String postgresQuery = postgresDirector.GetUserById("111");
        System.out.println("PostgreSQL Query:\n" + postgresQuery);

        }
    }