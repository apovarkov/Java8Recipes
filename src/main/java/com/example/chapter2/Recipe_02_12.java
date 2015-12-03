package com.example.chapter2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by apovarkov on 03.12.15.
 */
public class Recipe_02_12 {

    private static final String JS_ENGINE = "nashorn";

    public static void loadInlineJs() {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine nashorn = engineManager.getEngineByName(JS_ENGINE);
        try {
            nashorn.eval("print('This is being printed with JavaScript');");
        } catch (ScriptException ex) {
            System.err.print(ex.getMessage());
        }
    }
}
