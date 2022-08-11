package hu.progmatic.thymeleafpractice.service;

import hu.progmatic.thymeleafpractice.model.BlogEntry;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class TaskService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveBlogEntry(BlogEntry blogEntry) {
        /*
            ROLL BACK
         */
        entityManager.persist(blogEntry);
        // save
    }

    public List<BlogEntry> findAll() {
        // SELECT * FROM blog_entry;
        List<BlogEntry> blogs = entityManager.createQuery("SELECT blogEntry FROM BlogEntry blogEntry", BlogEntry.class)
            .getResultList();

        return blogs;
    }

}
