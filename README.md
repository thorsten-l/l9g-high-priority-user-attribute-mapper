# A high priority user attribute mapper for Keycloak

This provider gives you the possibility to create client scopes attributes that override standard scope attributes (e.g. profile::preferred_username).
Use "L9G User Attribute" in exactly the same way as "User Attribute". 
The only difference is the priority is set to 90 instead of 0.

## build
- run `mvn package` (Maven)

## Keycloak server
- copy the `l9g-high-priority-user-attribute-mapper.jar` into `keycloak/providers` directory.
- restart Keycloak

## My Repository #100
![Repository #100](100-512.png "Repository #100")
