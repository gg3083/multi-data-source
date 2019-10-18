package cn.gg3083.multidatasource.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DataSourceAop {

    @Pointcut("!@annotation(cn.gg3083.multidatasource.annotation.Master) " +
            "&& (execution(* cn.gg3083.multidatasource.service..*.select*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.get*(..)))")
    public void readPointcut() {
        log.info("read . . .");
    }

    @Pointcut("@annotation(cn.gg3083.multidatasource.annotation.Master) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.insert*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.add*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.update*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.edit*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.delete*(..)) " +
            "|| execution(* cn.gg3083.multidatasource.service..*.remove*(..))")
    public void writePointcut() {
        log.info("write . . .");
    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }


    /**
     * 另一种写法：if...else...  判断哪些需要读从数据库，其余的走主数据库
     */
//    @Before("execution(* cn.gg3083.multidatasource.service.impl.*.*(..))")
//    public void before(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//
//        if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
//            DBContextHolder.slave();
//        }else {
//            DBContextHolder.master();
//        }
//    }
}