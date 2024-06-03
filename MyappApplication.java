// 이 클래스는 Spring Boot 애플리케이션의 진입점입니다.

package com.example.myapp;

// Apache Commons의 로깅 라이브러리를 임포트합니다.
import org.apache.commons.logging.Log;
// 로그 인스턴스를 생성하기 위해 LogFactory 클래스를 임포트합니다.
import org.apache.commons.logging.LogFactory;
// 의존성 주입을 위해 Autowired 어노테이션을 임포트합니다.
import org.springframework.beans.factory.annotation.Autowired;
// Spring Boot 애플리케이션을 실행하기 위해 SpringApplication 클래스를 임포트합니다.
import org.springframework.boot.SpringApplication;
// 이 클래스를 Spring Boot 애플리케이션으로 표시하기 위해 SpringBootApplication 어노테이션을 임포트합니다.
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 주석된 컴포넌트를 찾기 위해 기본 패키지를 지정하기 위해 ComponentScan 어노테이션을 임포트합니다.
import org.springframework.context.annotation.ComponentScan;
// 애플리케이션의 환경에 로드할 프로퍼티 파일을 지정하기 위해 PropertySource 어노테이션을 임포트합니다.
import org.springframework.context.annotation.PropertySource;
// 애플리케이션의 환경에서 프로퍼티에 접근하기 위해 Environment 인터페이스를 임포트합니다.
import org.springframework.core.env.Environment;

// 이 클래스를 Spring Boot 애플리케이션으로 표시합니다.
@SpringBootApplication
public class MyappApplication {

  // 애플리케이션의 진입점 역할을 하는 메인 메서드입니다.
  public static void main(String[] args) {
    // 지정된 클래스를 사용하여 Spring Boot 애플리케이션을 실행합니다.
    SpringApplication.run(MyappApplication.class, args);
  }
}
