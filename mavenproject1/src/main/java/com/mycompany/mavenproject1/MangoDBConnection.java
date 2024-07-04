package com.mycompany.mavenproject1;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Indexes.descending;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class MangoDBConnection {
    
    @Autowired
    private JobOrderRepository jobOrderRepository;

    public void updateStatusByJobCode(String jobCode, String status) {
        jobOrderRepository.updateStatusByJobCode(jobCode, status);
        System.out.println("Status updated successfully for job code: " + jobCode);
    }
    
    public void insertData(JOVar att){
        String connectionString = "mongodb+srv://khadeem:lenin_JO@clusterleninjo.divpuaq.mongodb.net/?retryWrites=true&w=majority&appName=ClusterLeninJO";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {

            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("LeninJobOrder");
            MongoCollection<Document> gradesCollection = sampleTrainingDB.getCollection("solutionsClient");

            Document student = new Document("_id", new ObjectId());
            student.append("job_type", att.getJobOrderType())
                    .append("job_code", att.getJobCode())
                    .append("client_name", att.getClientName())
                    .append("address", att.getAddress())
                    .append("contact", att.getContact())
                    .append("concern", att.getConcern())
                    .append("leader", att.getLeader())
                    .append("transportation", att.getTranspo())
                    .append("date_issued", att.getDateIssued())
                    .append("date_due", att.getDateDue())
                    .append("status", att.getStatus());
                   
            gradesCollection.insertOne(student);
            
            
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
    
    
    public String jobCode(JOVar att) {
    String uri = "mongodb+srv://khadeem:lenin_JO@clusterleninjo.divpuaq.mongodb.net/?retryWrites=true&w=majority&appName=ClusterLeninJO";
    try (MongoClient mongoClient = MongoClients.create(uri)) {
        MongoDatabase database = mongoClient.getDatabase("LeninJobOrder");
        MongoCollection<Document> collection = database.getCollection("solutionsClient");

        // Query to find the latest job code for the given job order type
        List<Document> job = collection.find(eq("job_type", att.getJobOrderType()))
                .sort(descending("job_code"))
                .limit(1) // Limit to 1 document (the latest job code)
                .into(new ArrayList<>());

        if (!job.isEmpty()) {
            Document latestJob = job.get(0);
            String jobC = latestJob.getString("job_code");
            System.out.println("Latest Job Code: " + jobC);

            // Extract numeric part of the job code (assuming format "JO-PR-0001")
            String numericPart = jobC.substring(jobC.lastIndexOf("-") + 1);

            int jobCodeInt = Integer.parseInt(numericPart); // Parse numeric part as an integer

            // Increment the integer value
            jobCodeInt++;

            // Determine the prefix based on job order type
            String prefix;
            switch (att.getJobOrderType()) {
                case "OCCULAR":
                    prefix = "OC";
                    break;
                case "CM":
                    prefix = "CM";
                    break;
                case "PROJECT":
                    prefix = "PR";
                    break;
                default:
                    prefix = "XX"; // Default if job order type doesn't match expected cases
                    break;
            }

            // Construct the job code in the format JO-{prefix}-000X
            String newJobCode = "JO-" + prefix + "-" + String.format("%04d", jobCodeInt);
            System.out.println("New Job Code: " + newJobCode);
            return newJobCode;
        } else {
            // If no job code exists for the given type, start with "JO-{prefix}-0001"
            String prefix;
            switch (att.getJobOrderType()) {
                case "OCCULAR":
                    prefix = "OC";
                    break;
                case "CM":
                    prefix = "CM";
                    break;
                case "PROJECT":
                    prefix = "PR";
                    break;
                default:
                    prefix = "XX"; // Default if job order type doesn't match expected cases
                    break;
            }
            String newJobCode = "JO-" + prefix + "-0001";
            System.out.println("New Job Code: " + newJobCode);
            return newJobCode;
        }

    } catch (Exception e) {
        e.printStackTrace();
        return null; // Return null or handle appropriately if an error occurs
    }
}
//    public void updateStatusByJobCode(String jobCode, String status) {
//    // Implementation to update status in MongoDB based on job code
//    // Example:
//    Query query = new Query(Criteria.where("jobCode").is(jobCode));
//    Update update = Update.update("status", status);
//    mongoTemplate.updateFirst(query, update, SolutionsClient.class);
//}
//    
//    public void updateStatusByJobCode(String jobCode, String status) {
//        String connectionString = "mongodb+srv://khadeem:lenin_JO@clusterleninjo.divpuaq.mongodb.net/?retryWrites=true&w=majority&appName=ClusterLeninJO";
//
//        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
//            MongoDatabase database = mongoClient.getDatabase("LeninJobOrder");
//            MongoCollection<Document> collection = database.getCollection("solutionsClient");
//
//            collection.updateOne(eq("job_code", jobCode), new Document("$set", new Document("status", status)));
//            System.out.println("Status updated successfully for job code: " + jobCode);
//        } catch (MongoException e) {
//            e.printStackTrace();
//        }
//    }




}   

