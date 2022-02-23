public class CampoBatalha {
    
   public boolean combate(Personagens atacante, 
                Personagens atacado){
        
        if (atacante.ataque > atacado.defesa)
        {
            //atacado.vida = (atacado.vida - atacante.ataque);
            atacado.vida -= atacante.ataque;
        }
        else
        {
            atacado.defesa -= (atacante.ataque / 2);
        }

        if(atacado.vida > 0)
        {
            return false;
        }
        else
        {
            return true;
        }

   }




}
