package com.example.michalliberausr.databaseandlistview;

/**
 * Created by MichalLiberaUsr on 2016-12-13.
 */
//A bean class for DB input
public class Comment {
    private long id;
    private String comment;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getComment(){
        return this.comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    @Override
    public String toString(){
        return comment;
    }



}
