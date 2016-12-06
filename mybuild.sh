#!/bin/bash

ANT=/bin/ant
PATH=$PATH:/bin/ant
export PATH

TOM=/usr/lib/tomcat
BASE=/data/testapp
WEB_INF=$BASE/WEB-INF

cd $BASE

git checkout .
git pull

ant -f build.xml build.compile

$TOM/bin/shutdown.sh
$TOM/bin/startup.sh
