**Bienvenue dans le compte-rendu de projet / cours de programmation distribuée & web avancé réalisé par PELLERIN Samuel, VALDES Paul-Edgar, JALLON Cynthia.**

**Vous trouverez 2 versions, FR et EN.**

**Nous vous souhaitons une bonne lecture !**

--

**Welcome to the advanced distributed & web programming project / course report produced by PELLERIN Samuel, VALDES Paul-Edgar, JALLON Cynthia.**

**You will find 2 versions, FR and EN.**

**We hope you enjoy reading it !**

## FR version

### Programmation distribuée & Web avancé

Dans un premier temps, nous allons développer les bases que nous avons appris durant la 4ème année avant d'expliquer ce que nous avons réalisé pendant ce cours de web avancé en 5ème année avec Hans-Jörg SCHURR.

#### Pour commencer, qu'est-ce qu'une API ?
  
Une API est un ensemble de définitions et de protocoles qui facilite la création et l'intégration de logiciels d'applications. API est un acronyme anglais qui signifie « Application Programming Interface », que l'on traduit par interface de programmation d'application.

Les API permettent de communiquer avec d'autres produits / services sans connaître les détails de leur mise en œuvre. Elles simplifient le développement d'applications et vous font gagner du temps. Lorsque vous concevez de nouveaux outils et produits, les API vous offrent plus de flexibilité et simplifient la conception, l'administration et l'utilisation.

Les API doivent être documentés pour être utilisées correctement par les services externes pour lesquels elles sont déployées et développées.

![API](https://github.com/Paul-Edgar/Microservice/blob/main/Img/API.png?raw=true)

Maintenant que nous avons expliqué clairement la notion d'API, nous allons pouvoir expliquer REST, ses principes de fonctionnement et son utilisation.

#### Pour commencer, qu'est-ce que REST ?
  
Representational State Transfer de son acronyme REST représente une architecture logicielle qui définit ensemble deux contraintes pour la création de services. Le client est la personne application frontale ou mobile qui utilise et consomme les ressources de l'API. Les ressources sont les données exposées par notre API. Sur une API Rest les requêtes s'effectuent sur l'URL d'une ressource, puis les ressources récupérées sous le format JSON, XML...

![API Rest](https://github.com/Paul-Edgar/Microservice/blob/main/Img/api-rest-architecture.png?raw=true)

**GET, POST, PUT, DELETE : le protocol HTTP**

Les API REST sont basées sur HTTP, qui signifie Hypertext Transfer Protocol. Les échanges sont basés sur les requêtes du client à l'API via des requêtes de différents types.

- GET : récupérer des données à partir d'une ressource
- POST : envoyer des données à traiter à une ressource spécifique
- PUT : mettre à jour une ressource spécifiée
- DELETE : supprimer une ressource spécifiée

<br></br>

#### Cours du 08 septembre 2021 - Création du premier service

Dans un premier temps, nous avons suivi une partie de cours qui nous a donné les premières notions indispensables pour comprendre qu'est-ce qu'un microservice et ses avantages et inconvénients.

Ensuite, nous allons créer notre projet et commencer le développement.

##### Qu'est-ce qu'un microservice ?

Un microservice permet la mise en place de services web qui seront utilisés par de nombreux utilisateurs comme nous l'avons expliqué précédemment dans notre introduction.

Les microservices sont devenus populaires aux alentours de 2014 et sont désormais intégrés dans tous les gros projets. 
Chaque composant est un service individuel et peut être déployé de manière indépendante pour plusieurs logiciels.


###### L'organisation et l'utilisation

Normalement, l'organisation traditionnelle est basée sur les capacités (base de données, UX, etc...) mais pour un microservice, l'organisation est par service logique.

Les microservices sont donc produits pour des équipes et des utilisateurs externes et la documentation est indispensable. Un outil permettant d'effectuer des tests peut aussi être mis en place.

Le services sont donc responsables de la gestion des données, on doit utiliser un service pour une base de données. 

###### Le déploiement

Les déploiements sont souvent automatisés et on utilise des outils de tests unitaires pour vérifier le bon fonctionnement. Les modifications entrent dans le principe de l'intégration continue.

###### Les inconvénients

Le coût de déploiement et la complexité de mise en place sont de réels inconvénients qui peuvent repousser les développeurs pour leurs projets. La séparation des services n'est pas facile à appréhender. 

<br></br>
##### Début du projet

L'objectif de ce projet est de réaliser 2 services indépendant qui pourront communiquer via des requêtes. Ces 2 services seront :
- UserProfil
- Authentification

![Projet schema](https://github.com/Paul-Edgar/Microservice/blob/main/Img/ProjetSchema.PNG?raw=true)

Pour débuter, en utilisant Spring Boot, nous générons un projet avec les dépendances nécessaires très rapidement.

![Spring boot](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img-1-12bfde9c5c280b1940d85dee3d81772d.png?raw=true)


Ensuite, nous avons crée notre répertoire GitHub sur lequel nous devrons commit notre code durant ce projet.

En exécutant notre premier service, nous obtenons le message de bienvenue qui nous permet de confirmer le bon fonctionnement du projet.

![Hello world](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img3-afa0a1fe446db8e3c8c7a8d9ca532d2.png?raw=true)

Nous pouvons ajouter `?name=polytech` pour tester que le paramètre est bien détecté.

![Hello polytech](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img4-afa0a1fe446db8e3c8c7a8d9ca532d23.png?raw=true)

<br></br>

#### Cours du 13 septembre 2021 - Création du premier service

Dans cette 2ème séance de cours, nous allons développer les notions autour de l'API REST et les appliquer dans notre projet.

Nous avons déjà présenté au début de notre docuement les APIs REST, mais nous devons détailler leurs contraintes.

##### Stateless c'est quoi ?

* Pas de session à maintenir et donc pas de problème de load balancing.
* Il est possible de paralléliser les requêtes.
* API intuitive et extensible.

##### Les contraintes de REST

* Les messages sont auto-décrits
* Les messages décrivent comment la ressource peut être manipulée
* Le type de ressource est identifié dans la demande

<br></br>
##### Suite du projet

En reprenant les bases du cours précédent, nous créons une classe d’utilisateur et une API pour travailler avec la classe. Ajoutez d’autres champs que vous trouvez utiles.

Nous devons mettre en place une classe User avec les propriétés suivantes :
- ID
- Prénom
- Nom
- Âge

Avec ces données, nous allons pouvoir mettre en place le contrôleur afin de créer un utilisateur avec des données, le modifier et le supprimer.

##### Messages d'erreur

De base, les messages d'erreur ne sont pas très utiles car ils ne sont pas détaillés. Nous allons ajouter un gestionnaire d'exception capable de détailler nos erreurs et les rendre utiles.

![UserNotFoundException](https://github.com/Paul-Edgar/Microservice/blob/main/Img/UserNotFoundException.PNG?raw=true)

Cette exception ci-dessus permet d'afficher que l'utilisateur avec l'identifiant saisi n'a pas été reconnu.


Pour effectuer cette partie, nous avons utilisé les ressources suivantes :
- https://spring.io/projects/spring-boot
- https://github.com/lcuoco/TPRest 

<br></br>

#### Cours du 15 septembre 2021 - Suite de notre service

Pour pousuivre le projet, nous allons tester notre API REST avec Postman.

##### Le testing

Un bon service doit être fiable et doit être testé. Avec autant de complexité, nous souhaitons un déploiement automatique ainsi que des tests autormatiques. 

Les mots-clés à connaître sont :
- Unit testing : test d’unités individuelles de code
- Integration test : tester l’intégration de plusieurs systèmes ensemble
- Regression test : veiller à ce que les anciennes erreurs ne réapparaissent pas

##### La documentation

Il est évident qu’une bonne documentation est importante pour les logiciels et services réutilisables.

La documentation comporte de nombreux éléments : commentaires de code, références, manuels, guides.

Nous nous concentrons sur la référence API : une documentation très précise des interfaces exposées aux clients.

Nous utilisons Swagger/OpenAPI. Il permet d'avoir un format lisible par machine (YAML) pour définir et documenter les API RESTful.


Pour effectuer cette partie, nous avons utilisé les ressources suivantes :
- https://swagger.io/docs/specification/basic-structure/
- https://spec.openapis.org/oas/v3.1.0#specification

<br></br>

#### Cours du 20 septembre 2021 - 2ème service

Dans cette séance de cours, nous avons testé avec le logiciel POSTMAN qui permet d'envoyer des requêtes à notre API.

Dans un premier temps, nous effectuons la création de plusieurs utilisateurs via des requêtes POST :

![POST 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/POST-1-userProfil.PNG?raw=true)

Ci-dessous, on retrouve notre liste d'utilisateurs via la requête GET et peut constater que l'utilisateur a été ajouté :

![GET 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/POST-2-userProfil.PNG?raw=true)

On peut supprimer un utilisateur avec la requête DELETE :

![DELETE 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/DELETE-1-userProfil.PNG?raw=true)

En effectuant un GET, on voit bien que l'utilisateur a été supprimé :

![DELETE 2](https://github.com/Paul-Edgar/Microservice/blob/main/Img/DELETE-2-userProfil.PNG?raw=true)

Pour conclure, on peut modifier les données d'un utilisateur via le PUT :

![PUT 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/PUT-1-userProfil.PNG?raw=true)

L'âge de l'utilisateur a bien été modifié comme on le voit ci-dessous :

![PUT 2](https://github.com/Paul-Edgar/Microservice/blob/main/Img/PUT-2-userProfil.PNG?raw=true)


Maintenant que ces tests sont effectués, on peut confirmer que le service fonctionne et générer un nouveau service Authentification.

<br></br>

#### Cours du 29 septembre 2021 - Authentification

Durant ce cours, nous allons continuer à développer le 2ème service d'authentification.

Dans un premier temps, ce service doit effectuer un appel POST `/users` au service User.

On doit effectuer une vérification avec un token pour effectuer un DELETE par exemple `/users/1`

Pour cela, on doit permettre la connexion avec un nom d'utilisateur et un mot de passe.

<br></br>

#### Cours du 04 octobre 2021 - Gateway

Pour ce dernier cours, l'objectif principal est de faire le maximum de tests pour vérifier le bon fonctionnement de nos services.

Les objectifs sont :
* Champs supplémentaires dans le profil de l’user
* API complète avec vérification des tokens
* Tests significatifs
* Code propre avec des commentaires si nécessaire

Notre projet de groupe étant en retard, nous n'avons pas le temps de mettre en place la gateway mais nous allons détailler le principe ci-dessous.

Une gateway permet une API uniforme, d'effectuer une authentification unique et d'effectuer des contrôles de sécurité. 

<br></br>
<br></br>

------------------------
*Samuel PELLERIN - Cynthia JALLON - Paul-Edgar VALDES*

<br></br>
<br></br>
<br></br>
<br></br>

## EN version

### Distributed Programming & Advanced Web

First, we will develop the basics we learned in the 4th year before explaining what we achieved during this advanced web course in 5th year with Hans-Jörg SCHURR.

#### To begin with, what is an API ?
  
An API is a set of definitions and protocols that facilitate the creation and integration of application software. API is an English acronym which stands for "Application Programming Interface", which is translated by application programming interface.

APIs make it possible to communicate with other products / services without knowing the details of their implementation. They simplify application development and save you time. When you design new tools and products, APIs give you more flexibility and simplify design, administration, and use.

APIs must be documented to be properly used by the external services for which they are deployed and developed.

![API](https://github.com/Paul-Edgar/Microservice/blob/main/Img/API.png?raw=true)

Now that we have clearly explained the notion of API, we will be able to explain REST, its operating principles and its use.

#### To begin with, what is REST ?
  
Representational State Transfer, by its acronym REST, represents a software architecture that together defines two constraints for the creation of services. The client is the front-end or mobile application person who uses and consumes API resources. Resources are the data exposed by our API. On a Rest API, requests are made to the URL of a resource, then the resources retrieved in JSON, XML, etc.

![API Rest](https://github.com/Paul-Edgar/Microservice/blob/main/Img/api-rest-architecture.png?raw=true)

**GET, POST, PUT, DELETE : the HTTP protocol**

REST APIs are based on HTTP, which stands for Hypertext Transfer Protocol. The exchanges are based on the client's requests to the API via requests of different types.

- GET : retrieve data from a resource
- POST : send data to be processed to a specific resource
- PUT : update a specified resource
- DELETE : delete a specified resource

<br></br>

#### Course of September 08, 2021 - Creation of the first service

First, we took part of the course which gave us the first essential notions to understand what a microservice is and its advantages and disadvantages.

Next, we'll create our project and start development.

##### What is a microservice?

A microservice allows the implementation of web services that will be used by many users as we explained previously in our introduction.

Microservices became popular around 2014 and are now built into all big projects.
Each component is an individual service and can be deployed independently for multiple software.


###### Organization and use

Normally, the traditional organization is capacity-based (database, UX, etc ...) but for a microservice, the organization is by logical service.

Microservices are therefore produced for teams and external users and documentation is essential. A tool for performing tests can also be implemented.

The services are therefore responsible for data management, we must use a service for a database.

###### The deployment

Deployments are often automated and unit testing tools are used to verify proper operation. The modifications enter into the principle of continuous integration.

###### The inconvenients

The cost of deployment and the complexity of setting up are real drawbacks that can push back developers for their projects. The separation of services is not easy to understand.

<br></br>

##### Beginning of the project

The objective of this project is to realize 2 independent services which will be able to communicate via requests. These 2 services will be:
- UserProfil
- Authentication

![Schema project](https://github.com/Paul-Edgar/Microservice/blob/main/Img/ProjetSchema.PNG?raw=true)

To get started, using Spring Boot, we generate a project with the necessary dependencies very quickly.

![Spring boot](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img-1-12bfde9c5c280b1940d85dee3d81772d.png?raw=true)


Then, we created our GitHub directory on which we will have to commit our code during this project.

By performing our first service, we get the welcome message that allows us to confirm the proper functioning of the project.

![Hello world](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img3-afa0a1fe446db8e3c8c7a8d9ca532d2.png?raw=true)

We can add `?Name=polytech` to test that the parameter is correctly detected.

![Hello polytech](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img4-afa0a1fe446db8e3c8c7a8d9ca532d23.png?raw=true)

<br></br>

#### Course of September 13, 2021 - Creation of the first service

In this 2nd lesson, we will develop the concepts around the REST API and apply them in our project.

We have already presented the REST APIs at the beginning of our document, but we must detail their constraints.

##### Stateless what is it?

* No session to maintain and therefore no load balancing problem.
* It is possible to parallelize the queries.
* Intuitive and extensible API.

##### REST constraints

* Messages are self-described
* Posts describe how the resource can be manipulated
* The type of resource is identified in the request

<br></br>

##### Continuation of the project

Taking the basics from the previous lesson, we create a user class and an API to work with the class. Add other fields that you find useful.

We need to set up a User class with the following properties:
- ID
- First name
- Name
- Age

With this data, we will be able to set up the controller in order to create a user with data, modify it and delete it.

##### Error messages

Basic error messages are not very useful because they are not detailed. We will add an exception handler able to detail our errors and make them useful.

![UserNotFoundException](https://github.com/Paul-Edgar/Microservice/blob/main/Img/UserNotFoundException.PNG?raw=true)

This exception above is used to display that the user with the username entered was not recognized.


To complete this part, we used the following resources:
- https://spring.io/projects/spring-boot
- https://github.com/lcuoco/TPRest

<br></br>

#### Course of September 20, 2021 - 2nd service

In this lesson, we tested with the POSTMAN software which allows you to send requests to our API.

First, we create several users via POST requests:

![POST 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/POST-1-userProfil.PNG?raw=true)

Below is our list of users via the GET request and can see that the user has been added:

![GET 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/POST-2-userProfil.PNG?raw=true)

You can delete a user with the DELETE request:

![DELETE 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/DELETE-1-userProfil.PNG?raw=true)

By performing a GET, we can see that the user has been deleted:

![DELETE 2](https://github.com/Paul-Edgar/Microservice/blob/main/Img/DELETE-2-userProfil.PNG?raw=true)

To conclude, we can modify a user's data via the PUT:

![PUT 1](https://github.com/Paul-Edgar/Microservice/blob/main/Img/PUT-1-userProfil.PNG?raw=true)

The user's age has been changed as seen below:

![PUT 2](https://github.com/Paul-Edgar/Microservice/blob/main/Img/PUT-2-userProfil.PNG?raw=true)


Now that these tests are carried out, we can confirm that the service is running and generates a new Authentication service.

<br></br>

#### Course of September 29, 2021 - Authentication

During this course, we will continue to develop the 2nd authentication service.

First, this service must make a POST `/users` call to the User service.

We must perform a check with a token to perform a DELETE for example `/users/1`

To do this, you must allow the connection with a username and password.


<br></br>
<br></br>

------------------------
*Samuel PELLERIN - Cynthia JALLON - Paul-Edgar VALDES*