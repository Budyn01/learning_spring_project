package pl.budyn.other.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hlibe on 21.12.2016.
 */
@Entity
public class Account {

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    public String password;
    public String username;

    public Set<Bookmark> getBookmarks(){
        return bookmarks;
    }

    public Long getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }

    public Account(String name, String password){
        this.username = name;
        this.password = password;
    }
    Account(){}
}
