package sistemaCaptura.conexao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class ConexãoSql {
    private JdbcTemplate connection;

    public ConexãoSql() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        dataSource.setUrl("jdbc:sqlserver://servidor-magister.database.windows.net:1433;database=bd-magister;user=sa@servidor-magister;password=Magister123@;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");

        dataSource.setUsername("sa");

        dataSource.setPassword("Magister123@");


        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
}