package builder;

public interface QueryBuilder {
    QueryBuilder select(String table, String... fields);
    QueryBuilder where(String condition);
    QueryBuilder limit(int limit);
    String getSQL();
}
