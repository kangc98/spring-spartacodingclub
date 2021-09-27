package com.sparta.week03_hw.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime startDatetime, LocalDateTime endDatetime);
    //조회 시간으로부터 24시간 이내에 작성된 메모만 조회
}
