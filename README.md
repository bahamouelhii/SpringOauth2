# SpringOauth2

## Description
SpringOauth2 est une API REST qui intègre l'authentification OAuth2 via Google. Elle utilise **Spring Security** pour sécuriser les endpoints et permettre aux utilisateurs de se connecter avec leur compte Google.

## Fonctionnalités
- Connexion via OAuth2 (Google).
- Sécurisation des endpoints à l'aide de Spring Security.
- Authentification des utilisateurs via un flux OAuth2.

## Installation
1. Clonez ce dépôt : `git clone https://github.com/bahamouelhii/springoauth2.git`
2. Construisez le projet avec `mvn clean install`.
3. Lancez l'application avec `mvn spring-boot:run`.

## Configuration OAuth2
Avant de pouvoir utiliser la fonctionnalité OAuth2, vous devez configurer votre application dans la [console Google Developer](https://console.developers.google.com/), obtenir un **Client ID** et un **Client Secret**, et les ajouter à la configuration de l'application dans `application.properties`.

Exemple dans `application.properties` :
```properties
spring.security.oauth2.client.registration.google.client-id=
spring.security.oauth2.client.registration.google.client-secret=
