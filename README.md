# Compte rendu de la première partie du TP : Gestion des dépendances
## Résultats de l’exécution :
### Partie 1 : Injection de dépendances par instanciation statique

#### Dans cette première partie du TP, nous avons étudié l’injection de dépendances en utilisant l’instanciation statique. L’idée est de comprendre comment une classe peut utiliser les services d’une autre classe en créant directement ses dépendances dans le code.
#### L’injection de dépendances permet de découpler les différentes parties d’une application. Ici, avec l’instanciation statique : Les objets nécessaires sont créés avec new et fournis aux classes qui en ont besoin. 
#### Cela fonctionne bien pour de petits projets ou pour apprendre le concept.

 ### Versions traitées : 
 #### Dans ce TP, nous avons appliqué l’injection de dépendances à deux versions :
 ### 1-Version de la base de données: 
 #### Les dépendances liées à la gestion des données sont injectées directement dans les classes métiers.
<img width="959" height="463" alt="image" src="https://github.com/user-attachments/assets/df564d54-d794-4508-851f-cb235c38a2ae" />

### 2-Version du service web:
#### Les dépendances liées à l’accès au service web sont également injectées de manière statique.
<img width="959" height="478" alt="image" src="https://github.com/user-attachments/assets/edad93aa-1018-4f70-92a1-5704adc4450a" />

### Résultats obtenus
#### Version base de données : le programme affiche le résultat attendu de la méthode calcul() utilisant la base de données.
#### Version web service : le programme affiche le résultat attendu de la méthode calcul() utilisant le service web.
#### Ces résultats montrent que les dépendances ont été correctement injectées et que les classes fonctionnent comme prévu, que ce soit avec la base de données ou avec le web service.

### Partie 2 : Injection de dépendances par instanciation dynamique
#### Dans cette deuxième partie du TP, nous avons étudié l’injection de dépendances avec instanciation dynamique. Contrairement à l’instanciation statique, ici les objets nécessaires sont créés au moment de l’exécution grâce à des mécanismes de réflexion ou à un conteneur IoC.
#### L’instanciation dynamique permet de rendre le code plus flexible et moins dépendant des implémentations concrètes.
#### Les classes ne sont plus directement liées aux objets qu’elles utilisent. On peut modifier la dépendance utilisée à tout moment sans toucher au code des classes.Cela simplifie aussi les tests, car on peut facilement remplacer les dépendances par des versions simulées.

### Versions traitées : 
#### Nous avons appliqué cette méthode sur deux versions du TP :
### 1-Version de la base de données:
#### La classe métier reçoit une instance de DaoImpl créée dynamiquement selon la configuration définie dans le fichier config.txt.

<img width="959" height="473" alt="image" src="https://github.com/user-attachments/assets/f24370f7-ec6a-45f3-a74e-3548db4382b8" />

### 2-Version du service web:
#### La classe métier reçoit une instance de ext.DoaImpl2 créée dynamiquement, également déterminée par config.txt.
<img width="959" height="472" alt="image" src="https://github.com/user-attachments/assets/12e15c94-7819-4f19-bed0-ebdc459dfa87" />

### Résultats obtenus
#### Version base de données : le programme affiche correctement le résultat de calcul() en utilisant l’implémentation dynamique liée à la base de données.
#### Version web service : le programme affiche correctement le résultat de calcul() en utilisant l’implémentation dynamique du service web.
#### Ces tests confirment que l’injection dynamique fonctionne correctement et que le code est désormais plus modulable et facile à adapter, sans avoir à modifier les classes métiers.











