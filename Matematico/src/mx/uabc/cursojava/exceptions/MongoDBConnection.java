package mx.uabc.cursojava.exceptions;

import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBConnection {
    public static void main(String[] args) {
        String ruta = "mongodb://localhost:27017";
        try {
            MongoClient mongoClient= MongoClients.create(ruta);
            MongoDatabase db = mongoClient.getDatabase("comercial");
            MongoCollection productos = db.getCollection("productos");

            Document producto = (Document) productos.find(eq("name", "Gato")).first();
            System.out.println(producto.toJson());
        }
        catch(NullPointerException ex) {
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }




    }
}
