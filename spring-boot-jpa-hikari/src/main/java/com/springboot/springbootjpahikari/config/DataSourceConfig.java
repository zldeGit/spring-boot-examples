package com.springboot.springbootjpahikari.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author 张璐
 * @description &{description} TODO 璐哥 写点注释吧 !!!!!
 * @date 2019/10/16
 */
public class DataSourceConfig {
	@Bean
	@ConfigurationProperties("zl.first.datasource")
	@Primary
	public DataSourceProperties firstDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	public DataSource firstDataSource() {
		return firstDataSourceProperties().initializeDataSourceBuilder().build();
	}


	@Bean
	@ConfigurationProperties("zl.second.datasource")
	@Primary
	public DataSourceProperties secondDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean
	public DataSource secondDataSource() {
		return firstDataSourceProperties().initializeDataSourceBuilder().build();
	}
}
