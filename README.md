## FR version
<br></br>
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

#### Cours du 15 septembre 2021 - Création du premier service

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

------------------------
*Samuel PELLERIN - Cynthia JALLON - Paul-Edgar VALDES*

<br></br>
<br></br>
<br></br>
<br></br>

## EN version


### Distributed Programming & Advanced Web


------------------------
*Samuel PELLERIN - Cynthia JALLON - Paul-Edgar VALDES*
