#The FROM instruction initializes a new build stage and sets the Base Image for subsequent instructions.
#As such, a valid Dockerfile must start with a FROM instruction.
#The image can be any valid image – it is especially easy to start by pulling an image from the Public Repositories.
#ARG is the only instruction that may precede FROM in the Dockerfile.
ARG MAVEN_VERSION=3.6.3
ARG JAVA_VERSION=11.0.8
FROM maven:${MAVEN_VERSION}-openjdk-11-slim as BUILDER
ARG APP_VERSION=0.0.1-SNAPSHOT

#The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
#If the WORKDIR doesn’t exist, it will be created even if it’s not used in any subsequent Dockerfile instruction.
#The WORKDIR instruction can be used multiple times in a Dockerfile.
#If a relative path is provided, it will be relative to the path of the previous WORKDIR instruction.
WORKDIR /build/

#The COPY instruction copies new files or directories from <src> and adds them to the filesystem of the container at the path <dest>.
COPY pom.xml /build/
COPY src /build/src/

#The RUN instruction will execute any commands in a new layer on top of the current image and commit the results.
#The resulting committed image will be used for the next step in the Dockerfile.
RUN mvn clean package
COPY target/booting-web-${APP_VERSION}.jar target/application.jar

FROM openjdk:${JAVA_VERSION}-jre-slim
WORKDIR /app/
#Optionally a name can be given to a new build stage by adding (for example above - as BUILDER) AS name to the FROM instruction.
#The name can be used in subsequent FROM and COPY --from=<name> instructions to refer to the image built in this stage.
COPY --from=BUILDER /build/target/application.jar /app/

#There can only be one CMD instruction in a Dockerfile. If you list more than one CMD then only the last CMD will take effect.
#The main purpose of a CMD is to provide defaults for an executing container. These defaults can include an executable, or they can omit the executable, in which case you must specify an ENTRYPOINT instruction as well.
#If you would like your container to run the same executable every time, then you should consider using ENTRYPOINT in combination with CMD. See ENTRYPOINT.
#If the user specifies arguments to docker run then they will override the default specified in CMD.
CMD java -jar -Dspring.profiles.active=dev /app/application.jar