# Serveur RMI en Java


Ce projet est un exemple simple d'un serveur RMI (Remote Method Invocation) en Java qui fournit un service de temps. Le serveur RMI expose un objet distant qui permet aux clients de récupérer l'heure actuelle à partir du serveur.

# Structure du projet


Le projet est organisé comme suit :

TimeService.java : Interface définissant le service de temps.
TimeServiceImpl.java : Implémentation du service de temps.
TimeServer.java : Classe principale du serveur RMI.
TimeClient.java : Classe principale du client RMI.

# Exécution du serveur RMI

Pour exécuter le serveur RMI, suivez les étapes suivantes :

Compilez toutes les classes avec javac :

    javac TimeService.java TimeServiceImpl.java TimeServer.java TimeClient.java


Démarrez le serveur en exécutant TimeServer :

    java TimeServer

# Utilisation du client RMI

Une fois que le serveur est en cours d'exécution, vous pouvez exécuter le client RMI pour récupérer l'heure actuelle à partir du serveur. Exécutez le client avec la commande suivante :

    java TimeClient

Le client établira une connexion avec le serveur RMI, récupérera l'heure actuelle à partir du service de temps et l'affichera.

# Vérifier s'il y a une génération de souches (stubs) ou non 
# Localiser le serveurs de noms utilisé avec RMI et sur quel port il tourne par défaut.

J'ai créé un registre RMI local sur le port 1099 à l'aide de LocateRegistry.createRegistry(1099).

J'ai lié un objet distant (service de temps) à un nom symbolique dans le registre RMI à l'aide de Naming.bind("TimeService", service).

Les souches nécessaires seront automatiquement téléchargées par le client à partir du serveur lorsque le client recherchera l'objet distant dans le registre RMI.

