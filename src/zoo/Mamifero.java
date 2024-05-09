package zoo;

public abstract class Mamifero extends Animal {

        private static int numMamiferos = 0;
        private int periodoLactancia;
        
        Mamifero () {
            super();
            numMamiferos++;
        }
        
        Mamifero (int periodoLactancia) {
            this();
            this.periodoLactancia = periodoLactancia;
        }
        
        Mamifero (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
            super(habitat, comida, longevidad);
            this.periodoLactancia = periodoLactancia;
            numMamiferos++;        
        }
        
        public static int getNumMamiferos ()  { return numMamiferos;  }
        
        public void setPeriodoLactancia ( int periodo ) { periodoLactancia = periodo;  }
        
        public int getPeriodoLactancia () { return periodoLactancia; }
        
        @Override
        protected void finalize () throws Throwable {
            numMamiferos--;
            super.finalize();
        }
   
}
