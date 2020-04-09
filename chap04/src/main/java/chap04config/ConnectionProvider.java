package chap04config;

import java.sql.Connection;

public interface ConnectionProvider {
	public Connection getConnection();

}
