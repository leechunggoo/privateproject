package privit.project.domain.login.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.flogger.Flogger;
import org.springframework.stereotype.Component;
import privit.project.util.LoggerSqlSession;
import privit.project.domain.login.dto.LoginDto;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LoginDao {

    private final LoggerSqlSession loggersql;

    public Optional<LoginDto> requestuser(String userid) {
        LoginDto logindto = loggersql.selectOne("privit.project.domain.login.dao.LoginDao.findByUsername",userid);
        return logindto != null ? Optional.of(logindto) : Optional.empty();
    }
}
