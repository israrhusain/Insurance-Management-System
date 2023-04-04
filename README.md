# Inurance-Management-System
## About Project
This is a spring boot application which handles the inurance infrastructure by using the functionalities of this application.In this project technologies used Maven,Jpa 
Hibernate,MYSQL DB, spring  framework ,java ,Data structure ,OOPs concept etc.

## Database Design(MYSQL):

There is three Entity class Insurancepolicy Entity,Claim Entity and Client Entity which makes relation betwwen them.
#### 1. Client To Insurancepolicy Relation Mapping
         There is One To Many Relation Many To One vice versa we use bidirectional relation.
#### 2. Insurancepolicy To Claim Realation Mapping
        There is One to Many mapping and Many To One vice versa we use bidirectional relation.
        
 #### DataBase Connectivity:
 ![database](https://user-images.githubusercontent.com/54683061/229723703-380b9f2c-969c-48df-905e-91cc1e557b65.JPG)
#### Schema Design
![image](https://user-images.githubusercontent.com/54683061/229725956-708d4d76-22a2-4653-ac96-2b919abce0b5.png)
### Functionalities:
There are different Api's in for each Entity
#### API'S Working for Client Entity:
##### 1.POST/api/clients:

   This api add the client in to database.Controller layer takes data from DTO ans send to service layer service layer send it to repository layer.
   ![image](https://user-images.githubusercontent.com/54683061/229731804-14bd2dc9-a869-4c04-acb2-dae90a3f4bcb.png)
   
#### 2. PUT/api/Clients/{id}

![image](https://user-images.githubusercontent.com/54683061/229733003-dbb34cf5-4e86-4419-813a-2e265a127299.png)

#### 3.GET/api/Client/{id}

![image](https://user-images.githubusercontent.com/54683061/229734766-63e7f0d0-6dc0-413a-b8ec-4477472d9cc6.png)

#### 4.GET/api/clients

![image](https://user-images.githubusercontent.com/54683061/229737462-bfb67e57-b7fd-4995-9693-61f914c65c7c.png)

#### DELETE/api/clients/{id}

![image](https://user-images.githubusercontent.com/54683061/229737940-89fc217a-015b-4d88-ad72-2beb486ec5b0.png)

### API'S Working with InsurancePolicy Entity:

#### 1.POST/api/policies

![image](https://user-images.githubusercontent.com/54683061/229744674-be1823bc-1448-46f5-8e43-a142557c0d3e.png)

#### 2.PUT/api/policies/{id}

![image](https://user-images.githubusercontent.com/54683061/229745078-05a99d92-f332-4bfb-a7e4-aa8018ec75db.png)

#### 3.GET/api/policies/{id}

![image](https://user-images.githubusercontent.com/54683061/229745933-802afaa9-75a8-44fe-a1ba-cb5212bb7682.png)

#### 4.GET/api/policies

![image](https://user-images.githubusercontent.com/54683061/229746163-b9e9a856-5c3b-41ca-ab67-c8d5b3da3ee1.png)

#### 5.DELETE/api/policies{id}

![image](https://user-images.githubusercontent.com/54683061/229746501-5594bbf9-8935-4c35-a6e8-a52e5098aa55.png)

### API'S Working with Claim Entity

#### 1.POST/api/claims

![image](https://user-images.githubusercontent.com/54683061/229747070-136bda73-7718-430d-87dc-be7b14ac8f5b.png)

#### 2.PUT/api/Claims/{id}

![image](https://user-images.githubusercontent.com/54683061/229747665-4f7e2e22-47eb-40f6-9cc6-83632fc3574d.png)

#### 3.GET/api/claims/{id}

![image](https://user-images.githubusercontent.com/54683061/229747920-655f9270-fe34-4864-80c7-234a7f519780.png)

#### 4.GET/api/claims

![image](https://user-images.githubusercontent.com/54683061/229748151-550d11b1-5766-47f7-8f98-57b308c06eb2.png)

#### 5. DELETE/api/claims/{id}

![image](https://user-images.githubusercontent.com/54683061/229748447-401afc20-f73a-4bbf-8051-0a0be8ad6403.png)






         
      
