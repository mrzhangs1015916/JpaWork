package com.zs.work.learnjpa.dao;

import com.zs.work.learnjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserInfoDAO extends JpaRepository<User,Long> {
    List<User> findByPartid(int partid);
    User findByName(String name);
    @Query(value = "select u from User u where u.name=:name and u.age=:age")
    User getAllInfo(@Param("name") String name,@Param("age") int age);
    @Query(nativeQuery = true,value = "select a.*,b.partname from userinfo a left join partment b on a.partid=b.partid " +
            "where a.name=?1")
    Object getUserPartInfo(String name);
    @Query(value = "select new User(p,a) from User p,Partment a where p.partid=a.partid and p.name=:name")
    User getOtherUserPartInfo(@Param("name") String name);
    void deleteByName(String name);
}
