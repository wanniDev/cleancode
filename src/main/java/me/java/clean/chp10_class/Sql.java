package me.java.clean.chp10_class;

public abstract class Sql {
	public Sql(String table, Column[] columns) {}
	abstract public String generate();
}

class CreateSql extends Sql {
	public CreateSql(String table, Column[] columns) {
		super(table, columns);
	}

	@Override
	public String generate() {
		return "";
	}
}
