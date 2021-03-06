[![Build Status](https://travis-ci.org/EC-SEAL/edugain-idp.svg?branch=development)](https://travis-ci.org/EC-SEAL/edugain-idp)

Seal Edugain IDP
====================

Receives a query, generates and passes a standard authn request object to be handled by an edugain authority source, acting as a SAML SP to an external edugain IDP.

## Setup
In order to set up the server, the following steps needs to be taken: 

#### 1. Environmental variables

The following environmental variables need to be set prior to running the project:

|Environment       |
|------------------|
| ASYNC_SYGNATURE  |
| KEY_PASS         |
| STORE_PASS       |
| SIGNING_SECRET   |
| SESSION_MANAGER_URL| 
| KEY_STORE_PATH   |
| IDP_METADATA_URL |
| JWT_CERT_ALIAS   |
| KEYSTORE_PASS    |
| KEYSTORE_ID      |
| TESTING          |



#### 2. External dependencies

This project has two external hard dependencies which are **REQUIRED** in order to work consistently: 

* Session Manager: [SEAL Session Manager](https://github.com/ec-esmo/SessionMngr), injected via `SESSION_MANAGER_URL` env variable
* SAML2.0 IdP:  Injected via `IDP_METADATA_URL` variable


#### 3. Identity Provider Mock

In case a SAML identity provider doesn't exist, an it is needed for development purposes, a [KeyCloak](https://www.keycloak.org/) module can be set up, acting as an IDP. 

In that case,  `IDP_METADATA_URL` can be set by doing:

```bash
export IDP_METADATA_URL = KEYCLOACK_URI:KEYCLOAK_PORT/realms/auth/realms/REALM/protocol/saml/descriptor
``` 


## Run

After setting the environmental variables, just run: 

```mvn spring-bot:run ```


