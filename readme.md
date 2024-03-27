Below are the commands to run and generate native image
1. Generate the application jar
mvn clean install -DskipTests

2. Run the app
mvn spring-boot:run

3. Generate reachability metadata files
java -agentlib:native-image-agent=config-output-dir=./src/main/resources/META-INF/native-image -jar ./target/native-mapper-1.0.0.jar NativeMapperApplication

4. Create native image
mvn -Pnative native:compile

5. Below is the test data to run
curl --location 'http://localhost:8080/native-mapper/test' \
--header 'Content-Type: application/json' \
--data '{
    "inputField1": "value1",
    "inputField2": "value2"
}'
