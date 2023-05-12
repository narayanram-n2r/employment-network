The following steps will guide you on setting up a GitHub Actions workflow to automatically generate a JAR and WAR file whenever changes are pushed to the repository.

1.  Create a new file named `.github/workflows/generate-artifacts.yml` in the root directory of your repository.
    
2.  Add the following content to the `generate-artifacts.yml` file:

```yaml
name: Generate Artifacts

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout Repository
        uses: actions/checkout@v2

      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          java-version: '11'

      - name: Build with Maven
        run: mvn clean install

      - name: Archive JAR
        uses: actions/upload-artifact@v2
        with:
          name: my-application-jar
          path: target/*.jar

      - name: Archive WAR
        uses: actions/upload-artifact@v2
        with:
          name: my-application-war
          path: target/*.war

```
-  This workflow specifies that it should be triggered on every push to the `main` branch. It checks out the repository, sets up JDK 11, builds the project using Maven, and finally archives the generated JAR and WAR files as artifacts.
    
3.  Commit and push the changes to your repository:
```shell
git add .
git commit -m "Add GitHub Actions workflow for artifact generation"
git push origin main
```

4.  GitHub Actions will now automatically execute the workflow whenever changes are pushed to the `main` branch. You can monitor the progress and view the artifacts in the "Actions" tab of your repository on GitHub.
    

## Accessing Artifacts

Once the workflow has completed successfully, you can access the generated JAR and WAR files as artifacts.

1.  Navigate to the "Actions" tab of your repository on GitHub.
    
2.  Click on the workflow run for "Generate Artifacts".
    
3.  In the workflow run details, you will find the "Artifacts" section. Click on the artifact you want to download.
    
4.  Finally, click on the "Download" button to obtain the JAR or WAR file to your local machine.