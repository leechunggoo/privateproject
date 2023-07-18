package privit.project.util;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.springframework.core.io.support.SpringFactoriesLoader.FailureHandler.logging;

@Component
@RequiredArgsConstructor
public class LoggerSqlSession {

    private final SqlSession sqlsession;

    public SqlSession getSqlsession() {
        return sqlsession;
    }

    public <T> T selectOne(String statement) {

        return sqlsession.selectOne(statement);
    }

    public <T> T selectOne(String statement,Object parameter) {

        return sqlsession.selectOne(statement,parameter);
    }

    public <E> List<E> selectList(String statement) {
        return sqlsession.selectList(statement);
    }

    public <E> List<E> selectList(String statement, Object parameter) {

        return sqlsession.selectList(statement, parameter);
    }

    public int insert(String statement) {
        return sqlsession.insert(statement);
    }

    public int insert(String statement,Object parameter) {
        return sqlsession.insert(statement,parameter);
    }

    public int update(String statement) {
        return sqlsession.insert(statement);
    }

    public int update(String statement,Object parameter) {
        return sqlsession.insert(statement,parameter);
    }

    public int delete(String statement) {
        return sqlsession.insert(statement);
    }

    public int delete(String statement,Object parameter) {
        return sqlsession.insert(statement,parameter);
    }
}
