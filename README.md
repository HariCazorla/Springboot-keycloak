# Springboot-keycloak

(Keycloak)[https://hub.docker.com/r/jboss/keycloak/] is an open source Identity and Access Management solution which offers many useful features for Single-Sign-On (SSO), Identity Brokering and Social Login, User Federation, Client Adapters, an Admin Console, and an Account Management Console. In this project we have a Springboot application which provides a REST API and it will be secured using Keycloak. we'll use the Admin Console of Keycloak for setting up the realm, users and roles. Spring Boot Keycloak Starter dependency is requied. 

## Usage
The Springboot application is a random number generator, and the users confgiured with role 'user' in the Keycloak server can access the API.
