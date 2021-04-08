package hr.fer.zemris;

import mpi.MPI;

public class Philosopher {

    public static void main(String[] args) {
        MPI.Init(args);
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();

        System.out.println(rank + " " + size);

        MPI.Finalize();
    }
}