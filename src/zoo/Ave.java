package zoo;

public abstract class Ave extends Animal {

        private static int numAves = 0;
        private int periodoIncubacion;
        
        Ave () {
            super();
            numAves++;
        }
        
        Ave (int periodoIncubacion) {
            this();
            this.periodoIncubacion = periodoIncubacion;
        }
        
        Ave (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
            super(habitat, comida, longevidad);
            this.periodoIncubacion = periodoIncubacion;
            numAves++;        
        }
        
        public static int getNumAves ()  { return numAves;  }
        
        public void setPeriodoIncubacion ( int periodo ) { periodoIncubacion = periodo;  }
        
        public int getPeriodoIncubacion () { return periodoIncubacion; }
        
        @Override
        protected void finalize () throws Throwable {
            numAves--;
            super.finalize();
        }
   
}
