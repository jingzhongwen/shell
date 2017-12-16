#!/bin/sh  
  
#PWD=`pwd`  
#for i in lib/*;  
#do CLASSPATH=$PWD/$i:"$CLASSPATH";  
#done  
  
CLASSPATH=`find lib -name *.jar|xargs|sed "s/ /:/g"`  
export CLASSPATH=".:$CLASSPATH"  

java com.jzw.shell.App $1