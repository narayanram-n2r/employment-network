SonarQube is a popular open-source platform for continuous code quality inspection.

## Prerequisites

Before getting started, ensure you have the following in place:

-   A Spring Boot Maven application hosted on GitHub.
-   A SonarQube server set up and running.

## Setting up SonarQube Server

1.  Install and configure the SonarQube server by following the official documentation: [SonarQube Installation Guide](https://docs.sonarqube.org/latest/setup/install-server/)
    
2.  Once the SonarQube server is running, note down the server URL and access token. You will need these for configuring GitHub Actions.
    

## Configuring SonarQube for Maven

1.  Open the `pom.xml` file of your Spring Boot Maven application.
    
2.  Add the SonarQube plugin configuration inside the `<build>` section of the `pom.xml` file:
    

```xml
<build>
	<plugins>
		<plugin>
			<groupId>org.sonarsource.scanner.maven</groupId>
			<artifactId>sonar-maven-plugin</artifactId> 
			<version>3.9.0.2155</version>
        </plugin>
    </plugins>
</build>
```

3.  Configure the SonarQube plugin properties by adding the following code snippet below the `<build>` section:
```xml
<properties>
	<sonar.host.url>http://your-sonarqube-server-url</sonar.host.url>
	<sonar.login>your-sonarqube-access-token</sonar.login>
</properties>
```

Replace `http://your-sonarqube-server-url` with the URL of your SonarQube server, and `your-sonarqube-access-token` with the generated access token.

## Configuring GitHub Actions

1.  Navigate to your GitHub repository and create a new directory named `.github/workflows` if it does not exist.
    
2.  Inside the `.github/workflows` directory, create a new file, e.g., `sonarqube.yml`.
    
3.  Add the following code to `sonarqube.yml`:
```yaml
name: SonarQube Analysis

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  sonarqube:
    name: SonarQube Scanner
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v2

      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          java-version: '11'

      - name: Build with Maven
        run: mvn clean package

      - name: Run SonarQube Scanner
        run: mvn sonar:sonar
        env:
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
```

4.  Commit and push the changes to your repository.

## Final Steps

1.  Open your repository on GitHub and go to "Settings".
    
2.  In the left sidebar, click on "Secrets".
    
3.  Click on "New repository secret" and enter the following information:
    
    -   Name: `SONAR_TOKEN`
    -   Value: `<your-sonarqube-access-token>`
    
    Replace `<your-sonarqube-access-token>` with the access token you obtained from the SonarQube server.
    
4.  Save the secret.
    
5.  Now, whenever you push changes to the `main` branch or create a pull request targeting the `main` branch, GitHub Actions will automatically trigger the SonarQube analysis.
    
6.  The analysis results can be viewed on your SonarQube server by navigating to the project in the SonarQube web interface.