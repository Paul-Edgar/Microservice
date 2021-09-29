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


**L'organisation et l'utilisation**

Normalement, l'organisation traditionnelle est basée sur les capacités (base de données, UX, etc...) mais pour un microservice, l'organisation est par service logique.

Les microservices sont donc produits pour des équipes et des utilisateurs externes et la documentation est indispensable. Un outil permettant d'effectuer des tests peut aussi être mis en place.

Le services sont donc responsables de la gestion des données, on doit utiliser un service pour une base de données. 

**Le déploiement**

Les déploiements sont souvent automatisés et on utilise des outils de tests unitaires pour vérifier le bon fonctionnement. Les modifications entrent dans le principe de l'intégration continue.

**Les inconvénients**

Le coût de déploiement et la complexité de mise en place sont de réels inconvénients qui peuvent repousser les développeurs pour leurs projets. La séparation des services n'est pas facile à appréhender. 

<br></br>
#### Notre projet

Dans un premier temps, en utilisant Spring Boot, nous générons un projet avec les dépendances nécessaires très rapidement.

![Spring boot](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img-1-12bfde9c5c280b1940d85dee3d81772d.png?raw=true)

Ensuite, nous avons crée notre répertoire GitHub sur lequel nous devrons commit notre code durant ce projet.

En exécutant notre premier service, nous obtenons le message de bienvenue qui nous permet de confirmer le bon fonctionnement du projet.

![Hello world](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img3-afa0a1fe446db8e3c8c7a8d9ca532d2.png?raw=true)

Nous pouvons ajouter `?name=polytech` pour tester que le paramètre est bien détecté.

![Hello polytech](https://github.com/Paul-Edgar/Microservice/blob/main/Img/quick-img4-afa0a1fe446db8e3c8c7a8d9ca532d23.png?raw=true)

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


------------------------
*Samuel PELLERIN - Cynthia JALLON - Paul-Edgar VALDES*
