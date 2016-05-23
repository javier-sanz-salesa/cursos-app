package org.jsanz.cursosapp.config;

import org.hsqldb.util.DatabaseManagerSwing;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Embedded database and datasource configuration.
 */
@Configuration
@MapperScan("org.jsanz.cursosapp.mapper")
public class DataConfiguration {

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(embeddedDataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(embeddedDataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage("org.jsanz.cursosapp.domain");

        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource embeddedDataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).addScripts("classpath:courses_database.sql", "classpath:test_data.sql").build();
    }

    //default username : sa, password : ''
    @PostConstruct
    public void getDbManager() {
        DatabaseManagerSwing.main(new String[]{"--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", ""});
    }
}
