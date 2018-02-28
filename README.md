TP 2 - 4 BACK-END java
---
Conditions préalables et Installation pour le lancement du projet :
---

- Il faut un serveur local de base de données par exemple WAMP
- Lancer les 2 fichiers run-hsqldb-server.bat et show-hsqldb-server.bat
- Crée une base de données 
- Modifier la configuration du fichier Persistance.xml -> changer dans la classe ' le 'dev' par 'mysql' afin d'utiliser votre propre base de donnée mysql
- Configurer le fichier pom.xml
- Installer le plugin tomcat sur eclipse ou intelliJ
- JPA
- Hibernate
- Restful Webservice using JAX-RS
---
Partie REST
---
Utiliser l'URL http://localhost:8080/rest :
- /person renvoi toutes les personnes 
- /person/{id} renvoi la personne associé à l'id passé en paramètre
- /home renvoi toutes les résidences
- /home/{id} renvoi les résidences associé à l'id passé en paramètre

---
Construit avec 
---
Maven - Gestion des dépendances

Pour plus de détails
---
Veuillez lire DESIGN.md pour plus de détails sur la conception du projet.

Auteurs
---
REZK Mino et POINCE Alexis

