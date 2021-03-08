package com.example.tp3_exercice4;

import androidx.lifecycle.ViewModel;

public class PlanningModel extends ViewModel {
    private String premier;
    private String deuxieme;
    private String troisieme;
    private String quatrieme;

    public String getPremier()
    {
        if (premier == null)
            createPremeier();
        return premier;
    }

    public String getDeuxieme()
    {
        if (deuxieme == null)
            createDeuxieme();
        return deuxieme;
    }

    public String getTroisieme() {
        if (troisieme == null)
            createTroiseme();
        return troisieme;
    }

    public String getQuatrieme() {
        if (quatrieme == null)
            createQuatrieme();
        return quatrieme;
    }
    private void createPremeier()
    {
        premier = "Rencontre client Dupont";
    }
    private void createDeuxieme()
    {
        deuxieme = "Travailler le dossier recrutement";
    }
    private void createTroiseme()
    {
        troisieme = "Réunion équipe";
    }
    private void createQuatrieme()
    {
        quatrieme = "Préparation dossier vente";
    }
}
