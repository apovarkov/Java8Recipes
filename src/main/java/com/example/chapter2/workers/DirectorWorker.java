package com.example.chapter2.workers;

import com.example.chapter2.annotations.Role;

/**
 * Created by apovarkov on 02.12.15.
 */
@Role(name = "AUTHOR")
@Role(name = "REVIEWER")
@Role(name = "QA")
public class DirectorWorker implements Worker {
}
