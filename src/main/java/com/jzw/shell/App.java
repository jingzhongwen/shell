package com.jzw.shell;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

/**
 * Created by jingzhongwen on 2017/12/16.
 */
public class App {
    public static void main(String[] args) throws ParseException {
        // 创建 Options 对象
        Options options = new Options();

        // 添加 -h 参数
        options.addOption("h", false, "Lists short help");

        // 添加 -t 参数
        options.addOption("t", true, "Sets the HTTP communication protocol for CIM connection");

        CommandLineParser commandLineParser = new PosixParser();
        final CommandLine cmd = commandLineParser.parse(options, args);
        if (cmd.hasOption("t")) {
            System.out.println("this is a simple help code.hello " + cmd.getOptionValue("t"));
        }
        System.out.println("hello");
    }
}
