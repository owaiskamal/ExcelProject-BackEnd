package com.example.excelProj.Repository;

import com.example.excelProj.Model.ActivityLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ActivityLogsRepository extends JpaRepository<ActivityLogs,Long> {
    public List<ActivityLogs> findByUserDataId(Long id);

}
