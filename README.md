# GIT-OBLIG3
Jeg startet med å lage et nytt directory i oblig2 prosjektet som jeg ga navnet .github/workflows.
Her laget jeg en yaml fil som bestemmer "workflowen" og skal automatisk gjøre en rekke kommandoer når kode blir "pushed".
Jeg la til testLogging koden som vi fikk i oppgaven i build.gradle filen som sjekker at testene kjører i Github Actions også.
Deretter koblet jeg meg til min Github bruker fra intelliJ og delte prosjektet i et nytt repository.
Jeg fikk en feil på at "gradlew" ikke var executable og måtte fikse dette ved bruk av kommandoen "git update-index --chmod=+x gradlew".
Etter dette kjørte jeg noen tester og det virket som det skulle.
Det var en del testing og feiling før jeg gjorde det i denne rekkefølgen.