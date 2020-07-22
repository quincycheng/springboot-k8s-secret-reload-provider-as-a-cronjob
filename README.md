# springboot-k8s-secret-reload-mysql
Springboot Demo with reloading k8s secrets of mysql database without restarting app container


# Demo Procedure

1. Login to OpenShift using oc
2. oc new-project cityapp
3. 1-init.sh t setup MySQL, springboot
4. 2-NewPassword.sh to update mysql password & k8s secret
5. 3-Cyberark1.sh to update mysql password & k8s secret
