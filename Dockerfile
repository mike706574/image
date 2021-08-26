FROM maven:3.8.1-openjdk-16

WORKDIR /tmp/run

ADD . /tmp/run

RUN mvn compile

ENTRYPOINT ["./entrypoint.sh"]