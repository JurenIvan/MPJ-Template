
Upute za postavljanje okoline za potrebe laboratorijskih vježbi paralelnog programiranja za Java  + Linux/OS-X

MPJ Express
---------------

### Dohvaćanje potrebne programske potpore

Sa stranice  [MPJ Express](http://mpj-express.org/index.html) potrebno je preuzeti [MPJ Express Software](http://sourceforge.net/projects/mpjexpress/files/releases/) (Version 0.44 - Updated: 18-04-2015)

Preuzetu arhivu potrebno je raspakirati. Predložak projekta može se preuzeti sa [Github repozitorija](https://github.com/JurenIvan/MPJ-Template)
Projekt importat u vaš omiljen IDE koji bi trebao prepoznati da se radi o gradle projektu (to će omogućiti autocomplete i syntax checking).

U korijenu projekta nalazi se i mpiJava-spec.pdf u kojem je specificiran API funkcija potrebnih za implementaciju

Na **Linuxu/OS-Xu** napisan kod pokreće se pomoću skripte runPhilosophers.sh koja se nalazi u korijenu predloška i prima dva ulazna parametra, ona automatski kompajlira i pokrece program.

Parametri su redom:
* Broj instanci u kojem će se kod pokrenuti
* Path do mape nastale raspakiravanjem arhive sa MPI implementacijom

naprimjer:
* cd MPJ-Template
* "./runPhilosophers.sh 4 /Users/ivanjuren/Library/mpj-v0_44"

Na Windowsu je priča slična, no nema gotove skripte, potrebno je nekako kompajlirat kod(recimo pomoću IDE-a ili pomocu javac naredbe navedene ispod) i pokrenuti ga.
U mapi raspakirane preuzete arhive unutar mape bin postoji datoteka mpjrun.bat koja će pokrenuti MPI.

* pozicionirati se u korijen predloška projekta
* javac -cp $MPJ_HOME/lib/mpj.jar DrunkPhilosophers/src/main/java/hr/fer/zemris/Philosopher.java -d DrunkPhilosophers/build/classes/java/main

* cd DrunkPhilosophers/build/classes/java/main
* $MPJ_HOME/bin/mpjrun.bat -np UMENTNI_BROJ_PROCESA hr.fer.zemris.Philosopher
