package com.rodrigues.marcos;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecomendaLivros {

    public static void main(String[] args) throws IOException, TasteException{
        DataModel produtos = new Recomendador().getModeloDeFilmes();
        Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);

        System.out.println("Usuario 1 :");
        List<RecommendedItem> recommendations = recommender.recommend(1, 4);
        for (RecommendedItem recommendedItem : recommendations){
            System.out.println("Usuario 1 você pode se interessar por este livro :");
            System.out.println(recommendedItem);
        }

        System.out.println("Usuario 2 :");
        List<RecommendedItem> recommendations2 = recommender.recommend(1, 4);
        for (RecommendedItem recommendedItem : recommendations2){
            System.out.println("Usuario 2 você pode se interessar por este livro :");
            System.out.println(recommendedItem);
        }
    }
}
