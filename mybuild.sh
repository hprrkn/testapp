#!/bin/bash


BASEDIR=/data/testapp


cd $BASEDIR

rm -rf work
mkdir work

javac $BASEDIR/WEB-INF/src/*.java -classpath /usr/lib/tomcat/lib/servlet-api.jar

rm -rf $BASEDIR/WEB-INF/classes
mkdir $BASEDIR/WEB-INF/classes
mv $BASEDIR/WEB-INF/*.class $BASEDIR/WEB-INF/classes

