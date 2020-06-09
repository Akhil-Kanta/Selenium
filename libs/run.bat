set projectLocation=D:\seleniumTrg_ws\Akhil_Modular_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml