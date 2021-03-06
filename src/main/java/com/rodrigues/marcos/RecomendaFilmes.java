package com.rodrigues.marcos;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendaFilmes {

    public static void main(String[] args) throws IOException, TasteException{
        DataModel filmes = new Recomendador().getModeloDeFilmes();
        Recommender recommender = new RecomendadorBuilder().buildRecommender(filmes);
        List<RecommendedItem> recommendations = recommender.recommend(8, 4);

        for (RecommendedItem recommendedItem : recommendations){
            System.out.println("Você pode gostar deste filme :");
            System.out.println(recommendedItem);
        }
    }
}
