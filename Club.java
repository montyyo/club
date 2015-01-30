import java.util.ArrayList; //libreria de creacion de arrayslist

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> socio;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        socio = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socio.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socio.size();
    }
    
    /** 
   * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
       * no valido se muestra por pantalla el error.
         * @param month El mes en el que estamos interesados
           * @return El numero de socios que se dieron de alta dicho mes
             */
     public int joinedMonth(int month)
     {
         int sociosMes = 0;
         
         if( month < 1 ||  month > 12)
         {
             System.out.println(" ERROR --> introduce un numero entre 1 y 12 ambos incluidos");
         }
         else
         {
             for(Membership socios : socio)
             {
                 if(socios.getMonth() == month)
                 {
                     sociosMes++;
                 }
             }
         }
         return sociosMes;
     }
     
     
     /** 
   * Todos los socios que se han dado de alta un determinado mes de un determinado año se
   * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
   * por pantalla el error.
   * @param month El mes en el que estamos interesados
   * @param year El año en el que estamos interesados
   * @return Una coleccion con los socios que se han dado de baja del club
   */
  
  public ArrayList<Membership> purge(int month , int year)
  {
      ArrayList<Membership> bajas = new ArrayList<Membership>();
      
     
         
         if( month < 1 ||  month > 12)
         {
             System.out.println(" ERROR --> introduce un numero entre 1 y 12 ambos incluidos");
         }
         else
         {
             for(Membership socios : socio)
             {
                 if(socios.getMonth() == month && socios.getYear() == year )
                 {
                     bajas.add(socios);
                     socio.remove(socios);
                     
                 }
             }
         }
     return bajas;
  }
}
