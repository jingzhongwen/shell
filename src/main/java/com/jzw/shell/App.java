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
        // ���� Options ����
        Options options = new Options();

        // ��� -h ����
        options.addOption("h", false, "Lists short help");

        // ��� -t ����
        options.addOption("t", true, "Sets the HTTP communication protocol for CIM connection");

        CommandLineParser commandLineParser = new PosixParser();
        final CommandLine cmd = commandLineParser.parse(options, args);
        if (cmd.hasOption("t")) {
            System.out.println("this is a simple help code.hello " + cmd.getOptionValue("t"));
        }
        System.out.println("hello");
    }
}
