## Belajar Maven

Projek latihan membuat projek java menggunakan maven dan implementasi projek multimodul + dependency management.

### Membuat projek dengan maven

```shell
mvn archetype:generate
# cari maven-archetype-quickstart
```

### Command line
Contoh command line di maven

Melakukan kompilasi kode program
```shell
mvn compile
```

Melakukan test kompilasi kode program
```shell
mvn test-compile
```

Menjalankan unit test
```shell
mvn test
```

Melakukan bundling kode program (tanpa dependency)
```shell
mvn package
```

Melakukan bundling kode program (dengan dependency)
```shell
mvn package assembly:single
```

Cleanup hasil kompilasi
```shell
mvn clean
```

### Multimodul projek
Siapkan file `pom.xml` di setiap modul projek lalu konfigurasikan seperti dibawah ini

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>parent-group-id</groupId>
        <artifactId>parent-artifact-id</artifactId>
        <version>parent-project-version</version>
    </parent>

    <artifactId>nama-modul</artifactId>

    <dependencies>
        <dependency>
            <groupId>nama-group-id</groupId>
            <artifactId>nama-modul-lain</artifactId>
        </dependency>
    </dependencies>
</project>

```

Sedangkan di bagian root `pom.xml` set bagian packaging dan modules menjadi seperti ini

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  ...
  <packaging>pom</packaging>

  <modules>
    <module>nama-modul-a</module>
    <module>nama-modul-b</module>
  </modules>

  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>nama-group-id</groupId>
        <artifactId>nama-modul</artifactId>
        <version>${project.version}</version>
      </dependency>
    </dependencies>
  </dependencyManagement>

  ...
</project>

```

## Referensi

Programmer Zaman Now (section: Apache Maven)