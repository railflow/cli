# RAILFLOW-CLI

# Demo CLI

The demo version of the Railflow CLI can be built using the following commands.

```bash
cd railflow-demo-cli
mvn clean package
```


The demo CLI can be executed as follows.

```bash
java -jar railflow-demo-cli-0.0.1.jar [-hV] [--url=<url>] <file>
```

Following options are available.

| Option        | Description                                   |
|---------------|-----------------------------------------------|
| -h, --help    | Show help information                         |
| --url=<url>   | Specify the connection URL for the ALM server |
| -V, --version | Show version information                      |
| \<file\>      | Test report file to be exported to ALM        |


The demo CLI can be published to Maven Central as follows.

```bash
cd railflow-demo-cli
mvn clean deploy
```

Note that this build process by default includes signing of the jars. In order to sign you must have PGP installed and a signing key generated. Configure the `pom.xml` to refer to the correct signing key in the `keyname` attribute.

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-gpg-plugin</artifactId>
    <version>3.1.0</version>
    <executions>
        <execution>
            <id>sign-artifacts</id>
            <phase>verify</phase>
            <goals>
                <goal>sign</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <keyname>0xC8D6FBDF98D2C3B8FFDC1EE229B95B5E1D7B49F0</keyname>
    </configuration>
</plugin>
```
