package com.gujo.stackoverflow.member.repository;

import com.gujo.stackoverflow.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByDisplayName(String displayName);

}
