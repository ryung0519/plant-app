// User 클래스는 데이터베이스의 사용자 정보를 나타내는 엔티티입니다.

package com.example.myapp.model;

// AuthType 열거형을 임포트합니다.
import com.example.myapp.model.enumeration.AuthType;
// DataState 열거형을 임포트합니다.
import com.example.myapp.model.enumeration.DataState;
// 직렬화를 위해 Serializable 인터페이스를 임포트합니다.
import java.io.Serializable;
// 날짜를 다루기 위해 Date 클래스를 임포트합니다.
import java.util.Date;
// JPA 컬럼 어노테이션을 임포트합니다.
import javax.persistence.Column;
// JPA 엔티티 어노테이션을 임포트합니다.
import javax.persistence.Entity;
// JPA 열거형 타입 어노테이션을 임포트합니다.
import javax.persistence.EnumType;
// JPA 열거형 어노테이션을 임포트합니다.
import javax.persistence.Enumerated;
// JPA 자동 생성 전략 어노테이션을 임포트합니다.
import javax.persistence.GeneratedValue;
// JPA 자동 생성 전략 타입을 임포트합니다.
import javax.persistence.GenerationType;
// JPA ID 어노테이션을 임포트합니다.
import javax.persistence.Id;
// JPA 테이블 어노테이션을 임포트합니다.
import javax.persistence.Table;
// Lombok의 Data 어노테이션을 임포트합니다.
import lombok.Data;

// Lombok의 Data 어노테이션을 사용하여 getter, setter, toString 등의 메서드를 자동 생성합니다.
@Data
// JPA 엔티티로 표시합니다.
@Entity
// 이 엔티티가 매핑되는 데이터베이스 테이블의 이름을 지정합니다.
@Table(name = "USER")
public class User implements Serializable {

    // 기본 키로 사용되는 필드를 나타냅니다.
    @Id
    // 자동 생성 전략을 IDENTITY로 설정하여 기본 키 생성을 데이터베이스에 위임합니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // 이메일을 저장하는 필드입니다.
    private String email;

    // 데이터 상태를 나타내는 필드입니다.
    @Column
    // 열거형 타입으로 저장되도록 설정합니다.
    @Enumerated(EnumType.STRING)
    private DataState state;
    
    // 이름을 저장하는 필드입니다.
    private String name;
    
    // 닉네임을 저장하는 필드입니다.
    private String nickname;
    
    // 생일을 저장하는 필드입니다.
    private String birth;
    
    // 전화번호를 저장하는 필드입니다.
    private String phone;
    
    // OAuth 토큰을 저장하는 필드입니다.
    private String oauthToken;
    
    // 리프레시 토큰을 저장하는 필드입니다.
    private String refreshToken;
    
    // 인증 타입을 나타내는 필드입니다.
    private AuthType authType;
    
    // 생성 날짜를 저장하는 필드입니다.
    private Date createdAt;
    
    // 업데이트 날짜를 저장하는 필드입니다.
    private Date updatedAt;
}
