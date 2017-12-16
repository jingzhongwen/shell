package com.jzw.shell;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Created by jingzhongwen on 2017/12/16.
 */
public class App {
    public static void main(String[] args) throws ParseException {
        // ���� Options ����
        Options opts = new Options();

        // ��� -h ����
        opts.addOption("h", false, "Lists short help");

        // ��� -t ����
        opts.addOption("t", true, "Sets the HTTP communication protocol for CIM connection");

        BasicParser parser = new BasicParser();

        CommandLine cl = null;
        try {
            cl = parser.parse(opts, args);
            if (cl.getOptions().length > 0) {
                if (cl.hasOption('h')) {
                    HelpFormatter hf = new HelpFormatter();
                    hf.printHelp("Options", opts);
                } else {
                    // do process
                    System.out.println("hello");
                }
            } else {
                HelpFormatter hf = new HelpFormatter();
                hf.printHelp("Options", opts);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
