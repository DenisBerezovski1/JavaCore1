FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1

COPY ./src ./src

RUN mkdir ./out

RUN javac -encoding utf-8 -classpath ./src  -d out src/JC1/main/Main.java

CMD java -classpath ./out JC1/main/Main
