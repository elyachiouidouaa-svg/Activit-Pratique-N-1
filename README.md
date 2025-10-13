# Compte rendu de la première partie du TP : Gestion des dépendances
## Résultats de l’exécution :
### Partie 1 : Injection de dépendances par instanciation statique

#### Dans cette première partie du TP, nous avons étudié l’injection de dépendances en utilisant l’instanciation statique. L’idée est de comprendre comment une classe peut utiliser les services d’une autre classe en créant directement ses dépendances dans le code.
#### Explication : L’injection de dépendances permet de découpler les différentes parties d’une application. Ici, avec l’instanciation statique : Les objets nécessaires sont créés avec new et fournis aux classes qui en ont besoin. Cela fonctionne bien pour de petits projets ou pour apprendre le concept.

 #### Versions traitées : 
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
### 1-Version de la base de données:
<img width="959" height="473" alt="image" src="https://github.com/user-attachments/assets/f24370f7-ec6a-45f3-a74e-3548db4382b8" />

### 2-Version du service web:
<img width="959" height="472" alt="image" src="https://github.com/user-attachments/assets/12e15c94-7819-4f19-bed0-ebdc459dfa87" />








