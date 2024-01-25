/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author david
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (this.altura * this.base) / 2;
        super.setArea(area);
        return area;
    }

    @Override
    public void guardarBDD() {
        String connectionString = "mongodb+srv://fdtoro:WjykdQ47BQOqZoDm@cluster0.mgdhlmc.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("figurasBDD");

                MongoCollection<Document> collection = database.getCollection("Triangulos");

                Document document = new Document("base", this.base)
                        .append("altura", this.base);
                        

                collection.insertOne(document);

                mongoClient.close();
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void eliminarAreas() {
        String connectionString = "mongodb+srv://fdtoro:WjykdQ47BQOqZoDm@cluster0.mgdhlmc.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("figurasBDD");

                MongoCollection<Document> collection = database.getCollection("Triangulos");

                collection.deleteMany(new Document());

                mongoClient.close();
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }

    }

    public Triangulo[] consultarAreas() {

        List<Triangulo> lista = new ArrayList<Triangulo>();
        Triangulo[] array = null;

        String connectionString = "mongodb+srv://fdtoro:WjykdQ47BQOqZoDm@cluster0.mgdhlmc.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("figurasBDD");

                MongoCollection<Document> collection = database.getCollection("Triangulos");

                

                try (MongoCursor<Document> cursor = collection.find().iterator()) {
                    while (cursor.hasNext()) {
                        Document document = cursor.next();
                        Triangulo tri;
                        tri = new Triangulo(document.getDouble("base"),document.getDouble("altura"));
                        tri.calcularArea();
                        lista.add(tri);

                    }
                }

                array = lista.toArray(new Triangulo[0]);
                
                mongoClient.close();
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }

        return array;
    }

}
