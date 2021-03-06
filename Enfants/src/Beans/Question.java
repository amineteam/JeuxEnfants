package Beans;

/**
 *
 * @author Julien Modena
 */
public class Question {

    private Integer id;
    private String question;
    private String reponse;
    private Integer niveau;

    public Question(Integer id, String question, String reponse, Integer niveau) {
        this.id = id;
        this.question = question;
        this.reponse = reponse;
        this.niveau = niveau;
    }

    public Question(String question, String reponse, Integer niveau) {
        this.question = question;
        this.reponse = reponse;
        this.niveau = niveau;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "id=" + id + ", question=" + question + ", reponse=" + reponse + ", niveau=" + niveau;
    }
}
