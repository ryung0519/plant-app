// ChangePassword 클래스는 사용자의 비밀번호 변경 요청을 처리하는 데이터 클래스입니다.

package com.example.myapp.context.request.user;

// Jackson 라이브러리의 JsonIgnoreProperties 어노테이션을 임포트합니다.
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// Jackson 라이브러리의 JsonProperty 어노테이션을 임포트합니다.
import com.fasterxml.jackson.annotation.JsonProperty;
// Lombok 라이브러리의 AllArgsConstructor 어노테이션을 임포트합니다.
import lombok.AllArgsConstructor;
// Lombok 라이브러리의 Data 어노테이션을 임포트합니다.
import lombok.Data;
// Lombok 라이브러리의 NoArgsConstructor 어노테이션을 임포트합니다.
import lombok.NoArgsConstructor;

// Lombok의 Data 어노테이션을 사용하여 getter, setter, toString 등의 메서드를 자동 생성합니다.
@Data
// Jackson 라이브러리의 JsonIgnoreProperties 어노테이션을 사용하여 알려지지 않은 속성을 무시합니다.
@JsonIgnoreProperties(ignoreUnknown = true)
// Lombok의 NoArgsConstructor 어노테이션을 사용하여 기본 생성자를 자동 생성합니다.
@NoArgsConstructor
// Lombok의 AllArgsConstructor 어노테이션을 사용하여 모든 필드를 매개변수로 받는 생성자를 자동 생성합니다.
@AllArgsConstructor
public class ChangePassword {

  // Jackson 라이브러리의 JsonProperty 어노테이션을 사용하여 email 필드를 JSON 속성과 매핑합니다.
  @JsonProperty("email")
  private String email;

  // Jackson 라이브러리의 JsonProperty 어노테이션을 사용하여 newPassword 필드를 JSON 속성과 매핑합니다.
  @JsonProperty("newPassword")
  private String newPassword;

}
