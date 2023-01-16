FROM amazoncorretto:17.0.5-alpine3.16
RUN apk add curl && apk add bind-tools
EXPOSE 8761/tcp
COPY build/libs/*.jar .
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser
ENTRYPOINT ["/bin/sh", "-c", "java -jar *.jar"]
