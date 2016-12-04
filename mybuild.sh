#!/bin/bash

TOM=/usr/lib/tomcat
BASE=/data/testapp
WEB_INF=$BASE/WEB-INF

cd $BASE

git checkout .
git pull

rm -rf $BASE/work
mkdir $BASE/work

javac $WEB_INF/src/*.java -classpath $TOM/lib/servlet-api.jar

rm -rf $WEB_INF/classes
mkdir $WEB_INF/classes
mv $WEB_INF/src/*.class $WEB_INF/classes

$TOM/bin/shutdown.sh
$TOM/bin/startup.sh
