package com.sparta.week08_hw.repository;

import com.sparta.week08_hw.model.User;
import com.sparta.week08_hw.model.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}
