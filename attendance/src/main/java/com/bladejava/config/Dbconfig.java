package com.bladejava.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.jdbc.Base;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.github.biezhi.anima.Anima;
import lombok.extern.slf4j.Slf4j;

@Bean
@Slf4j
public class Dbconfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        /*
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/attendance?useSSL=false");
        config.setUsername("root");
        config.setPassword("1014");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);
        Base.open(ds);

*/
        // MySQL
       // Anima.open("jdbc:mysql://127.0.0.1:3306/attendance", "root", "1014");

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(blade.environment().getOrNull("jdbc.url"));
        dataSource.setUsername(blade.environment().getOrNull("jdbc.username"));
        dataSource.setPassword(blade.environment().getOrNull("jdbc.password"));

        Anima.open(dataSource);

     /*
// SQLite
        Anima.open("jdbc:sqlite:./attendance.db");
// H2
        Anima.open("jdbc:h2:file:~/attendance;FILE_LOCK=FS;PAGE_SIZE=1024;CACHE_SIZE=8192", "root", "1014");

// DataSource
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(blade.environment().getOrNull("jdbc.url"));
        dataSource.setUsername(blade.environment().getOrNull("jdbc.username"));
        dataSource.setPassword(blade.environment().getOrNull("jdbc.password"));
        Anima.open(dataSource);
        */
        log.info("database init success");
    }
}
