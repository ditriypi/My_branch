# 7. Git. Maven

## 'List Users' Application

Please, continue develop Service Layer of ‘List Users’ Application should be able to:

    public List<String> getNodes(String row) - convert row to list nodes;  
    public User createFromRow(String row) - create instance of class User from row;  
    public List<User> readFromFile() - create list of users based on rows from file;  
    public int saveToDB(List<User> users) - save list to database;  
    public List<User> readAllFromDB() - read all users from database;  
    public List<User> readDevelopersFromDB() - read all developers from database;  
    public int removeDuplicateFromDB() - remove duplicate users from database;  
    public List<User> sortByCompanyAndFirstName(List<User> users) - sort list of users for firs by company name and next by username.  

Implement methods hashCode and equals for class User.

*You should to demonstrate the execution of the service level code.*
