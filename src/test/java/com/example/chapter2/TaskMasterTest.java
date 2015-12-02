package com.example.chapter2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apovarkov on 02.12.15.
 */
public class TaskMasterTest extends TestCase {
    private TaskMaster taskMaster;

    @Before
    public void setUp() {
        taskMaster = new TaskMaster();
    }

    @Test
    public void testAssignWorkAuthor() {
        Worker worker = new AuthorWorker();
        assertTrue(taskMaster.assignWork(worker));
    }

    @Test
    public void testAssignWorkQA() {
        Worker worker = new QAWorker();
        assertFalse(taskMaster.assignWork(worker));
    }

    @Test
    public void testAssignWorkDirector() {
        Worker worker = new DirectorWorker();
        assertTrue(taskMaster.assignWork(worker));
    }

    @After
    public void tesrDown() {
        taskMaster = null;
    }
}
