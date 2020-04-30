package edu.northeastern.cs5500.recipe;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class JavaMongoDBConnection {
    private static DB database;
    private static final String DATABASE_NAME = "giao";

    public static DB getDB() {
        if (database == null) {
            MongoClient mongoClient;
            mongoClient = new MongoClient("localhost", 27017);
            database = mongoClient.getDB(DATABASE_NAME);
        }
        return database;
    }
}
