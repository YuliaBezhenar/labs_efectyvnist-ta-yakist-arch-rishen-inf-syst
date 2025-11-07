package builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PostgreSQLQuery implements QueryBuilder{
    private String table;
    private List<String> fields = new ArrayList<>();
    private String where;
    private Integer limit;

    @Override
    public QueryBuilder select(String table, String... fields) {
        this.table = table;
        this.fields.addAll(Arrays.asList(fields));
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        this.where = condition;
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String getSQL() {
        StringBuilder sql = new StringBuilder("SELECT ");

        if (fields.isEmpty()) {
            sql.append("*");
        } else {
            sql.append(String.join(", ", fields));
        }

        sql.append(" FROM \"").append(table).append("\"");

        if (where != null) {
            sql.append(" WHERE ").append(where);
        }

        if (limit != null) {
            sql.append(" LIMIT ").append(limit);
        }

        sql.append(";");
        return sql.toString();
    }
}
