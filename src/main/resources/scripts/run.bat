@ECHO OFF  
for %%F IN (lib\*.jar) do call :AddClassPath %%F  
goto RunApp  
  
:AddClassPath  
  SET CLASSPATH=%CLASSPATH%;%1  
goto :EOF  
  
:RunApp
java com.jzw.shell.App