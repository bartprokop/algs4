:: this is how to deploy to remote directory, please adjust url parameter
:: mvn deploy:deploy-file -DgroupId=3rd.ibm.mq -DartifactId=jms -Dversion=7.1.0.2 -Dpackaging=jar -Dfile=jms.jar -Durl=file://repo

call mvn install:install-file -DgroupId=3rd.algs4 -DartifactId=stdlib -Dversion=4 -Dpackaging=jar -Dfile=stdlib.jar
call mvn install:install-file -DgroupId=3rd.algs4 -DartifactId=algs -Dversion=4 -Dpackaging=jar -Dfile=algs4.jar
