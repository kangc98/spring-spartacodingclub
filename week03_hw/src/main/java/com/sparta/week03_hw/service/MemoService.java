package com.sparta.week03_hw.service;

import com.sparta.week03_hw.domain.Memo;
import com.sparta.week03_hw.domain.MemoRepository;
import com.sparta.week03_hw.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 없습니다.")
        );
        memo.update(requestDto);
        return id;
    }
}
