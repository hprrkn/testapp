#!/bin/bash

TOMCAT_HOME=/usr/lib/tomcat
BASEDIR=/data/testapp

cd $BASEDIR

git checkout .
git pull

rm -rf work
mkdir work

javac $BASEDIR/WEB-INF/src/*.java -classpath /usr/lib/tomcat/lib/servlet-api.jar

rm -rf $BASEDIR/WEB-INF/classes
mkdir $BASEDIR/WEB-INF/classes
mv $BASEDIR/WEB-INF/src/*.class $BASEDIR/WEB-INF/classes

$TOMCAT_HOME/bin/shutdown.sh
$TOMCAT_HOME/bin/startup.sh
