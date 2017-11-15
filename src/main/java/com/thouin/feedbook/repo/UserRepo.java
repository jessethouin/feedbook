package com.thouin.feedbook.repo;

import com.thouin.feedbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jessethouin on 11/14/17.
 */
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
