FROM 100.125.0.36:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/ctctest-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]