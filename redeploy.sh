#!/bin/bash

oc delete deploymentconfig cityapp-secret --wait=true
oc apply -f openshift/cityapp-secret.yaml
