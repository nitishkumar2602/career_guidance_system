package com.model;



public class CareerOption {
    private int id;
    private String name;
    private String description;
    private String requiredSkills;

    // Constructors
    public CareerOption() {}
    
    public CareerOption(int id, String name, String description, String requiredSkills) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requiredSkills = requiredSkills;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
}
