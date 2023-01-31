package com.project.quiz;

import com.project.quiz.entities.PlayerEntity;

import com.project.quiz.repositories.PlayerRepository;
import com.project.quiz.services.QuizDataService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    //private EntityManager entityManager;
    //private PlayerRepository playerRepository;
    private QuizDataService quizDataService;

    @Override
    //@Transactional
    public void run(String...args) throws Exception{

        log.info("Executing startup actions...");

        /*PlayerEntity player = new PlayerEntity("John");
        log.info("Created player: " + player);

        entityManager.persist(player);
        log.info("Same player after persist: " + player);*/

     /*   playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Harry"));
        playerRepository.save(new PlayerEntity("George"));*/

        //log.info("List of players from database: ");
       /* Query q = entityManager.createQuery("SELECT p FROM PLAYERS p");
        List<PlayerEntity> playersFromDb = (List<PlayerEntity>)q.getResultList();

        for(PlayerEntity playerFromDb : playersFromDb ) {
            log.info("Player from Db: " + playerFromDb);
        }*/

       /* List<PlayerEntity> playersFromDatabase = playerRepository.findAll();
        for (PlayerEntity player : playersFromDatabase) {
            log.info("Retrieved player: " + player);
        }
*/
        quizDataService.getQuizCategories();
        quizDataService.getQuizQuestions();

    }
}
