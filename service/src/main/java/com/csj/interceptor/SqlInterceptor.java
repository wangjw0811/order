package com.csj.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.Properties;

/**
 * @author Jims Wang
 * @date 2019-05-01 21:43
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "query", args = { Statement.class, ResultHandler.class})})
@Component
@Slf4j
public class SqlInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        long startTime = System.currentTimeMillis();
        StatementHandler statementHandler = (StatementHandler)invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        log.info("获取执行的sql语句：" + sql);
        try{
            return invocation.proceed();
        }finally {
            log.info("执行耗时" + (System.currentTimeMillis() - startTime) +"ms");
        }

    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
