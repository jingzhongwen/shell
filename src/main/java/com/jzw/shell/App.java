package com.jzw.shell;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Created by jingzhongwen on 2017/12/16.
 */
public class App {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        CommandLineParser commandLineParser = new DefaultParser();
        commandLineParser.parse(options,args);
        System.out.println("hello");
    }
}
