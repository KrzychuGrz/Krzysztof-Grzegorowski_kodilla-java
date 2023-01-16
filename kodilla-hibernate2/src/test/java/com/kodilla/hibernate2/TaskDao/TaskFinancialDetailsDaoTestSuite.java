package com.kodilla.hibernate2.TaskDao;

import com.kodilla.hibernate2.task.TaskFinancialDetails;
import com.kodilla.hibernate2.task.dao.TaskFinancialDetailsDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    void testFindByPaid() {
        //
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //when
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);

        //then
        assertEquals(1, resultList.size());

        //cleanUp
        taskFinancialDetailsDao.deleteAll();
    }
}

