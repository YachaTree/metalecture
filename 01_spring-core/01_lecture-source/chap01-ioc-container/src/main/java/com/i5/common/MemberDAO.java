package com.i5.common;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

//Database Access Object
@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;
    //final 키워드는 대문자로 쓰는게 관례. 성격이 상수가 아니라 필드라 대문자 안쓰고 소문자 사용한거임.
    // 한번 생성되면 변경 불가능하기 때문에 초기화시켜주지않으면 안됨. So 아래 생성자 이용해서 초기화 진행.

    public MemberDAO() {
        memberMap = new HashMap<Integer, MemberDTO>();
        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));
    }

    public MemberDTO findMemberBySeq(int seq) {
        return memberMap.get(seq);
    }

    public boolean save(MemberDTO member) {

        int before = memberMap.size();

        memberMap.put(member.getSequence(), member);

        int after = memberMap.size();

        return after > before; //SAVE 성공여부 확인하기 위해
    }

}
