# did-common-java

## Information

This is an implementation of the DID Core specification:

 - [Decentralized Identifiers v1.0](https://w3c.github.io/did-core/)

## Maven

Build:

	mvn clean install

Dependency:

	<repositories>
		<repository>
			<id>danubetech-maven-public</id>
			<url>https://repo.danubetech.com/repository/maven-public/</url>
		</repository>
	</repositories>

	<dependency>
		<groupId>decentralized-identity</groupId>
		<artifactId>did-common-java</artifactId>
		<version>1.0.0</version>
	</dependency>

## Example

Example code:

    URI did = URI.create("did:ex:1234");

    Service service = Service.builder()
            .type("ServiceEndpointProxyService")
            .serviceEndpoint("https://myservice.com/myendpoint")
            .build();

    VerificationMethod verificationMethod = VerificationMethod.builder()
            .id(URI.create(did + "#key-1"))
            .type("Ed25519VerificationKey2018")
            .publicKeyBase58("FyfKP2HvTKqDZQzvyL38yXH7bExmwofxHf2NR5BrcGf1")
            .build();

    DIDDocument diddoc = DIDDocument.builder()
            .id(did)
            .service(service)
            .verificationMethod(verificationMethod)
            .build();

    System.out.println(diddoc.toJson(true));

Example DID document:

    {
      "@context" : "https://www.w3.org/ns/did/v1",
      "id" : "did:ex:1234",
      "verificationMethod" : {
        "type" : "Ed25519VerificationKey2018",
        "id" : "did:ex:1234#key-1",
        "publicKeyBase58" : "FyfKP2HvTKqDZQzvyL38yXH7bExmwofxHf2NR5BrcGf1"
      },
      "service" : {
        "type" : "ServiceEndpointProxyService",
        "serviceEndpoint" : "https://myservice.com/myendpoint"
      }
    }

## About

<img align="left" src="https://raw.githubusercontent.com/decentralized-identity/did-common-java/main/docs/logo-dif.png" width="115">

Decentralized Identity Foundation - https://identity.foundation/

<br clear="left" />

<img align="left" src="https://raw.githubusercontent.com/decentralized-identity/did-common-java/main/docs/logo-ngi-essiflab.png" width="115">

Supported by [ESSIF-Lab](https://essif-lab.eu/), which is made possible with financial support from the European Commission's [Next Generation Internet](https://ngi.eu/) programme.
