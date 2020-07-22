#!/bin/bash

cd cityapp

mvn compile
mvn package -DskipTests

docker build -t quincycheng/cityapp:springboot-0.1 .

docker login -u _ -p $(oc whoami -t) default-route-openshift-image-registry.apps-crc.testing
docker tag quincycheng/cityapp:springboot-0.1  default-route-openshift-image-registry.apps-crc.testing/cityapp/cityapp:springboot-0.1
docker push default-route-openshift-image-registry.apps-crc.testing/cityapp/cityapp:springboot-0.1

cd ..
