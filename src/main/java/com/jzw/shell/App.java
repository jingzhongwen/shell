package com.jzw.shell;

import com.jzw.shell.conf.SpirngContextConfig;
import com.jzw.shell.handler.Handler;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by jingzhongwen on 2017/12/16.
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws ParseException {

        Options opts = new Options();


        opts.addOption("h", false, "Lists short help");


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
                    logger.info("start process");
                    AnnotationConfigApplicationContext context =
                            new AnnotationConfigApplicationContext(SpirngContextConfig.class);
                    Handler handler = context.getBean("handler", Handler.class);
                    handler.handle();
                }
            } else {
                HelpFormatter hf = new HelpFormatter();
                hf.printHelp("Options", opts);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }
}
