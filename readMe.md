
Upute za postavljanje okoline za potrebe laboratorijskih vježbi paralelnog programiranja za Java  + Linux/OS-X

MPJ Express
---------------

### Dohvaćanje potrebne programske potpore

Sa stranice  [MPJ Express](http://mpj-express.org/index.html) potrebno je preuzeti [MPJ Express Software](http://sourceforge.net/projects/mpjexpress/files/releases/) (Version 0.44 - Updated: 18-04-2015)

Preuzetu arhivu potrebno je raspakirati. Predložak projekta može se preuzeti sa [Github repozitorija](https://github.com/JurenIvan/MPJ-Template)
Projekt importat u vaš omiljen IDE koji bi trebao prepoznati da se radi o gradle projektu (to će omogućiti autocomplete i syntax checking).
Napisan kod pokreće se pomoću skripte runPhilosophers.sh koja se nalazi u korijenu predloška i prima dva ulazna parametra.

Parametri su redom:
* Broj instanci u kojem će se kod pokrenuti
* Path do mape nastale raspakiravanjem arhive sa MPI implementacijom

naprimjer:
* cd MPJ-Template
* "./runPhilosophers.sh 4 /Users/ivanjuren/Library/mpj-v0_44"

U korijenu projekta nalazi se i mpiJava-spec.pdf u kojem je specificiran API funkcija potrebnih za implementaciju