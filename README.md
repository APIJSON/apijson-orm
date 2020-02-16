# apijson-orm
APIJSON ORM remote dependencies.

### Maven
#### Step 1. Add the JitPack repository to your build file
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
#### Step 2. Add the dependency
```xml
	<dependency>
	    <groupId>com.github.APIJSON</groupId>
	    <artifactId>apijson-orm</artifactId>
	    <version>3.9.0</version>
	</dependency>
```

### Gradle
#### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
#### Step 2. Add the dependency
```gradle
	dependencies {
	        implementation 'com.github.APIJSON:apijson-orm:3.9.0'
	}
```
