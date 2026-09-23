# Projet: 

Développer un programme en Java permettant de générer automatiquement un mot de passe aléatoire à partir d’une longueur choisie par l’utilisateur, d'analyser le niveau de sécurité du mot de passe généré ou saisi, d'identifier ses éventuelles faiblesses et de proposer des améliorations afin de le rendre plus robuste et difficile à compromettre.



# Arborescence du projet: 

	password_generator_js/
	|___ PasswordGen.java
	|___ README.md



# Fonctionnalités:

Le programme permet de :

	- choisir la longueur du mot de passe; 
	- afficher un message d'erreur si la longeur < 8;
	- génération du mot de passe aléatoirement (miniscules, majuscules, caractères speciaux, chiffres); 
	- adaptation à la longueur demandée; 
	- mélange du mot de passe (changer l'odre initial).
	
	


# Fonctionnement du programme: 

## 1) Côté utilisateur : Affichage dans le terminal   

L'utilisateur indique la longueur souhaitée du mot de passe au clavier. Le programme vérifie ensuite que cette longueur est d'au moins 8 caractères, puis génère le mot de passe et propose une version dont l'ordre des caractères a été réarrangé.

## 2) Côté programme — Fonctionnement interne

Le programme est organisé autour de deux méthodes principales :

	. password_generator() : responsable de la création du mot de passe. Elle commence par créer un objet Random et un StringBuilder et ajoute ensuite 2 caractères majuscules, 2 miniscules, 2 caractères spétiaux et 2 chiffres.ce garantit la présence initiale de deux caractères provenant de chaque catégorie. Une boucle while complète par la suite le mot de passe lorsque la longueur demandée est supérieure à 8.

	. generateCharacter() : permet de sélectionner aléatoirement un ou plusieurs caractères dans une chaîne donnée. 




#  Déroulement général:


		      Début
  		  	│
  		  	v
	Demander la longueur du mot de passe
  			│
  			v
		Longueur < 8 ?
  			│
  			├── Oui --> Afficher un message d'erreur
  			│
 		        └── Non
       			     │
       			     v
		    Générer 2 majuscules
       			     │
			     v
		    Générer 2 minuscules
       			     │
	       		     v
		    Générer 2 caractères spéciaux
       			     │
	       		     v
		    Générer 2 chiffres
       			     │
	       		     v
		    Longueur atteinte ?
       			     │
       			     ├── Non --> Ajouter des caractères aléatoires
       			     │
       			     └── Oui
             			  │
				  v
      			 Réorganiser les caractères
             			  │
				  v
       			Afficher le mot de passe
             			  │
				  v
            			 Fin




# Classes : 

	- PasswordGen est la classe principale du programme qui contient :
		. main() : point d'entrée du programme ;
		. password_generator() : génération du mot de passe; 
		. generateCharacter() : sélection des caractères aléatoires.

	- Random : permet de générer aléatoirement les caractères du mot de passe.
	- Scanner : permet de récupérer la saisie de l’utilisateur depuis le terminal.
	- StringBuilder : permet de construire, modifier et réorganiser le mot de passe.
