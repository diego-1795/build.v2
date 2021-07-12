# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM openjdk:8-jdk-alpine
RUN addgroup -S diego && adduser -S admin -G diego
USER admin:diego
VOLUME /tmp
ARG JAR_FILE=TARGET/*.jar
ADD target/${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ] 

CMD ["/bin/sh"]
