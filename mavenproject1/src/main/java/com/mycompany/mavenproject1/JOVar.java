/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author khanny
 */

@Document(collection = "JOVar")
public class JOVar {
    
    @Id
    private String jobOrderType;
    private String jobCode;
    private String clientName;
    private String address;
    private String contact;
    private String concern;
    private String leader;
    private String transpo;
    private String dateIssued;
    private String dateDue;
    private String status;
    private String confirmationToken;
    
    public JOVar() {
        this.confirmationToken = ""; // Initialize token as empty string
    }

    // Getters and setters

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }
            
    
    public void setJobOrderType(String jobOrderType){
        this.jobOrderType = jobOrderType;
        
    }
    
    public void setJobCode(String jobCode){
        this.jobCode = jobCode;
        
    }
    
    public void setClientName(String clientName){
        this.clientName = clientName;
        
    }
    
    public void setAddress(String address){
        this.address = address;
        
    }
    
    public void setContact(String contact){
        this.contact = contact;
        
    }
    
    public void setConcern(String concern){
        this.concern = concern;
        
    }
    
    public void setLeader(String leader){
        this.leader = leader;
        
    }
    
    public void setTranspo(String transpo){
        this.transpo = transpo;
        
    }
    
    public void setDateIssued(String dateIssued){
        this.dateIssued = dateIssued;
        
    }
    
    public void setDateDue(String dateDue){
        this.dateDue = dateDue;
        
    }
    
    public void setStatus(String status){
        this.status = status;
        
    }
    
    
    /*-----------Getter-------------*/
    public String getJobOrderType(){
        return this.jobOrderType;
        
    }
    
    
    public String getJobCode(){
        return this.jobCode;
        
    }
    
    public String getClientName(){
        return this.clientName;
        
    }
    
    public String getAddress(){
        return this.address;
        
    }
    
    public String getContact(){
        return this.contact;
        
    }
    
    public String getConcern(){
        return this.concern;
        
    }
    
    public String getLeader(){
        return this.leader;
        
    }
    
    public String getTranspo(){
        return this.transpo;
        
    }
    
    public String getDateIssued(){
        return this.dateIssued;
        
    }

    public String getDateDue(){
        return this.dateDue;
        
    }
    
    public String getStatus(){
        return this.status;
        
    }
    
           
            
            
    
}
