package builder;

public class QueryDirector {
    private QueryBuilder builder;

    public QueryDirector(QueryBuilder builder) {
        this.builder = builder;
    }

//some basic query
    public String GetUsers(){
        return builder
                .select("users", "id", "name")
                .where("is_active = true")
                .limit(50)
                .getSQL();
    }

    public String GetUserById(String id){
        return builder
                .select("users", "id", "name", "email")
                .where("id = '" + id + "'")
                .limit(1)
                .getSQL();
    }
}
