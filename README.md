# darculafx
[![Maven Central](https://img.shields.io/maven-central/v/com.github.mouse0w0/darculafx.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.mouse0w0%22%20AND%20a:%22darculafx%22)

JavaFX darcula theme.

## Usage

### 1 Add dependency

<details>
<summary>Maven</summary>

```xml
<dependency>
    <groupId>com.github.mouse0w0</groupId>
    <artifactId>darculafx</artifactId>
    <version>11.0.0</version>
</dependency>
```
	
</details>

<details>
<summary>Gradle</summary>

#### 1 Add the Central repository to your build file
```gradle
	repositories {
		mavenCentral()
	}
```

#### 2 Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.mouse0w0:darculafx:11.0.0'
	}
```

	
</details>

### 2 Apply theme

You can either apply the style to the scene…
```java
DarculaFX.applyDarculaStyle(scene);
```
…or apply the style to specific components.
```java
DarculaFX.applyDarculaStyle(button);
```

## Screenshots

![1](screenshots/1.png)
![2](screenshots/2.png)
![3](screenshots/3.png)
![4](screenshots/4.png)
