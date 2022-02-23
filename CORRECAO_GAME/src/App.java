import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Raça, Vida, Ataque, Defesa, Premium
        Personagens elfo = new Personagens(
            "Elfo", 800, 500, 600, false
        );

        //Raça, Vida, Ataque, Defesa, Premium
        Personagens mago = new Personagens(
            "Mago", 1000, 600, 500, false
        );

        //Raça, Vida, Ataque, Defesa, Premium
        Personagens anao = new Personagens(
            "Anao", 1500, 300, 700, false
        );

        //Raça, Vida, Ataque, Defesa, Premium
        Personagens orc = new Personagens(
            "Orc", 1300, 400, 200, false
        );

        //Raça, Vida, Ataque, Defesa, Premium
        Personagens paladino = new Personagens(
            "Paladino", 1500, 900, 700, true
        );

        CampoBatalha campo = new CampoBatalha();

        if(campo.combate(elfo, mago) == true)
        {
            //foi pro saco
            JOptionPane.showMessageDialog(
                null, "Mago faleceu no combate!", 
                "Combate", JOptionPane.WARNING_MESSAGE);

        }
        else //tá vivo
        {
            JOptionPane.showMessageDialog(
                null, ("Mago resistiu ao ataque! com " + 
                      mago.vida + " pontos de vida!"), 
                "Combate", JOptionPane.WARNING_MESSAGE);
        }


        if(campo.combate(elfo, mago) == true)
        {
            //foi pro saco
            JOptionPane.showMessageDialog(
                null, "Mago faleceu no combate!", 
                "Combate", JOptionPane.WARNING_MESSAGE);

        }
        else //tá vivo
        {
            JOptionPane.showMessageDialog(
                null, ("Mago resistiu ao ataque! com " + 
                      mago.vida + " pontos de vida!"), 
                "Combate", JOptionPane.WARNING_MESSAGE);
        }

        if(campo.combate(elfo, mago) == true)
        {
            //foi pro saco
            JOptionPane.showMessageDialog(
                null, "Mago faleceu no combate!", 
                "Combate", JOptionPane.WARNING_MESSAGE);

        }
        else //tá vivo
        {
            JOptionPane.showMessageDialog(
                null, ("Mago resistiu ao ataque! com " + 
                      mago.vida + " pontos de vida!"), 
                "Combate", JOptionPane.WARNING_MESSAGE);
        }


        if(campo.combate(paladino, anao) == true)
        {
            //foi pro saco
            JOptionPane.showMessageDialog(
                null, "Anao faleceu no combate!", 
                "Combate", JOptionPane.WARNING_MESSAGE);

        }
        else //tá vivo
        {
            JOptionPane.showMessageDialog(
                null, ("Anao resistiu ao ataque! com " + 
                      anao.vida + " pontos de vida!"), 
                "Combate", JOptionPane.WARNING_MESSAGE);
        }

        if(campo.combate(anao, paladino) == true)
        {
            //foi pro saco
            JOptionPane.showMessageDialog(
                null, "Paladino faleceu no combate!", 
                "Combate", JOptionPane.WARNING_MESSAGE);

        }
        else //tá vivo
        {
            JOptionPane.showMessageDialog(
                null, ("Paladino resistiu ao ataque! com " + 
                      paladino.vida + " pontos de vida!"), 
                "Combate", JOptionPane.WARNING_MESSAGE);
        }



    }
}
