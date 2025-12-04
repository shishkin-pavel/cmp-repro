to verify:

build compose multiplatform locally (`9999.0.0-SNAPSHOT`)
```bash
cd libC
./gradlew publishToMavenLocal
cd ../libB
./gradlew publishToMavenLocal
```
then build ios app from ide