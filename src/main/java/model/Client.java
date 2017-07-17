package model;

public class Client
{
    // Attributs
    private String email;
    private int    id;
    private String nom;
    private String numeroTel;
    private String prenom;

    // Constructeur par défaut
    public Client()
    {

    }

    // Getters(accesseurs) et Setters(mutateurs)
    /**
     * retourne l'adresse e-mail du Client
     * 
     * @return String email
     */
    public String getEmail()
    {
        return this.email;
    }

    /**
     * retourne l'identifiant technique du Client
     * 
     * @return int idCli
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * retourne le nom du Client
     * 
     * @return String nom
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * retourne le numéro de téléphone du Client
     * 
     * @return String telephone
     */
    public String getNumeroTel()
    {
        return this.numeroTel;
    }

    /**
     * retourne le prénom du Client
     * 
     * @return String prenom
     */
    public String getPrenom()
    {
        return this.prenom;
    }

    /**
     * définit l'adresse e-mail du Client
     * 
     * @param email
     *            String
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * définit l'identifiant technique du Client utilisé par la base de données
     * 
     * @param id
     *            int (idCLi)
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * définit le nom du Client
     * 
     * @param nom
     *            String
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * définit le numéro de téléphone du Client
     * 
     * @param numeroTel
     *            String (telephone)
     */
    public void setNumeroTel(String numeroTel)
    {
        this.numeroTel = numeroTel;
    }

    /**
     * définit le prénom du Client
     * 
     * @param prenom
     *            String
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    @Override
    public String toString()
    {
        return "Client #" + id + " [" + prenom + " " + nom + ", email=" + email + ", Téléphone="
                + numeroTel + "]";
    }
}
