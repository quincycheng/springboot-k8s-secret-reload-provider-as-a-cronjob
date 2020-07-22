#!/bin/bash

oc apply -f openshift/role.yaml

#oc policy add-role-to-user view system:serviceaccount:cityapp:cityapp-secret
#oc policy add-role-to-user edit system:serviceaccount:cityapp:cityapp-secret
