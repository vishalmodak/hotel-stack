#FROM java:8-alpine (Refer to https://issues.apache.org/jira/browse/KAFKA-4988)
FROM anapsix/alpine-java:8
MAINTAINER vishal

ENV SPRING_PROFILE=docker \
    KAFKA_BROKER_HOST=localhost \
    KAFKA_BROKER_PORT=9092 \
    appDir=/usr/src/app

ARG COLLECTOR_IP

RUN mkdir -p $appDir
WORKDIR $appDir

ADD pinpoint/pinpoint-agent-1.6.0.tar.gz pinpoint
RUN sed -i "s/profiler.collector.ip=127.0.0.1/profiler.collector.ip=${COLLECTOR_IP}/g" pinpoint/pinpoint.config
RUN sed -i "s/profiler.sampling.rate=2/profiler.sampling.rate=1/g" pinpoint/pinpoint.config

ADD build/libs/svc-search.jar .

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dspring.profiles.active=${SPRING_PROFILE}", \
            "-Dspring.cloud.consul.host=${CONSUL_HOST}", \
            "-Dspring.kafka.bootstrap-servers=${KAFKA_BROKER_HOST}:${KAFKA_BROKER_PORT}", \
            "-Dbroker.list=${KAFKA_BROKER_HOST}:${KAFKA_BROKER_PORT}", \
            "-javaagent:./pinpoint/pinpoint-bootstrap-1.6.0.jar", \
            "-Dpinpoint.agentId=search-vm", \
            "-Dpinpoint.applicationName=hotel-search", \
            "-jar", \
            "svc-search.jar" \
           ]
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=${SPRING_PROFILE}", "-Dspring.cloud.consul.host=${CONSUL_HOST}", "-jar", "svc-search"]

EXPOSE 10005