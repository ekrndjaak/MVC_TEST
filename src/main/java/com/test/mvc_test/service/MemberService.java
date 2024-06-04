//package com.test.mvc_test.service;
//
//import com.test.mvc_test.domain.Member;
//import com.test.mvc_test.repository.MemberRepository;
//import com.test.mvc_test.repository.Support;
//
//import java.util.List;
//import java.util.Optional;
//
//public class MemberService {
//    private final MemberRepository memberRepository = new Support();
//
//    public Long join(Member member){
//        validateDuplicateMember(member);
//        memberRepository.save(member);
//        return member.getId();
//    }
//
//    private void validateDuplicateMember(Member member) {
//        memberRepository.findByName(member.getName())
//                .ifPresent(m -> {
//                    throw new IllegalStateException("이미 존재하는 회원입니다.");
//                });
//    }
//    public List<Member> findMembers() {
//        return memberRepository.findAll();
//    }
//    public Optional<Member> findOne(Long memberId) {
//        return memberRepository.findById(memberId);
//    }
//}
