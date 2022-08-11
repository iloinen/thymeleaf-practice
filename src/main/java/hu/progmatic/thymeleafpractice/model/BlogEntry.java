package hu.progmatic.thymeleafpractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;

@Entity
public class BlogEntry {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private String category;

    private int rating;

    private boolean published;

    private LocalDate created;

    @Transient
    private String stringDate;

    public BlogEntry() {
    }

    public BlogEntry(
            String title, String content, String category,
            int rating, boolean published, LocalDate created
    ) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.rating = rating;
        this.published = published;
        this.created = created;
    }

    public BlogEntry(
            Long id, String title, String content, String category,
            int rating, boolean published, LocalDate created
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.rating = rating;
        this.published = published;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        // 2022-01-14
        // String format = "yyyy-MM-dd";
        // LocalDate.parse(created);
        //this.created = LocalDate.parse(created, DateTimeFormatter.ofPattern(format));
        this.created = created;
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }

    @Override
    public String toString() {
        return "BlogEntry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", published=" + published +
                ", created=" + created +
                '}';
    }
}
