#!/bin/sh
set -e

repository=$(pwd)/distribution-repository

cd git-repo
./gradlew clean build
cp build/libs/reactive-helloworld-1.0.0-SNAPSHOT.jar repository

