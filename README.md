# apijson-orm  [![](https://jitpack.io/v/APIJSON/apijson-orm.svg)](https://jitpack.io/#APIJSON/apijson-orm)
APIJSON ORM 库，可通过 Maven, Gradle 等远程依赖。<br />
APIJSON ORM library for remote dependencies with Maven, Gradle, etc.

### Maven
#### 步骤 1. 在 pom.xml 中添加 JitPack 仓库
#### Step 1. Add the JitPack repository to pom.xml
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
#### 步骤 2. 在 pom.xml 中添加 apijson-orm 依赖
#### Step 2. Add the apijson-orm dependency to pom.xml
```xml
	<dependency>
	    <groupId>com.github.APIJSON</groupId>
	    <artifactId>apijson-orm</artifactId>
	    <version>LATEST</version>
	</dependency>
```

### Gradle
#### 步骤 1. 在项目根目录 build.gradle 中最后添加 JitPack 仓库
#### Step 1. Add the JitPack repository in your root build.gradle at the end of repositories
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
#### 步骤 1. 在项目某个 module 目录(例如 `app`) build.gradle 中添加 apijson-orm 依赖
#### Step 2. Add the apijson-orm dependency in your one of the modules(such as `app`)
```gradle
	dependencies {
	        implementation 'com.github.APIJSON:apijson-orm:latest'
	}
```
