# Job Application System - Spring Boot Microservices
# 🚀 Overview
This project is a Job Application System designed using Spring Boot Microservices architecture. It demonstrates a transition from a Monolithic to a Microservices model while incorporating multiple technologies such as H2, PostgreSQL, Docker, OpenFeign, and Eureka Server for service discovery.

# 🏗️ Tech Stack
* Spring Boot - Backend framework
* Spring Cloud OpenFeign - Inter-service communication
* Spring Cloud Netflix Eureka - Service discovery
* H2 Database (initially) → PostgreSQL (migrated) - Database
* Docker - Containerization
* Kubernetes (K8s) - Orchestration (optional for deployment)
# 📌 Microservices in the Project
The system is divided into three microservices, each handling a specific part of the job application workflow:

1️⃣ Review Microservice (reviewMS)
* Handles job application reviews and feedback
* Stores and retrieves reviews from the database
* Communicates with jobMS and companyMS
2️⃣ Job Microservice (jobMS)
* Manages job postings and listings
* Connects with companyMS for company details
* Provides job details to reviewMS
3️⃣ Company Microservice (companyMS)
* Manages company details and employer profiles
* Connects with jobMS for listing jobs
* Provides data to reviewMS for employer-related feedback
🔄 Architecture & Workflow
* Eureka Server registers all microservices.
* OpenFeign enables communication between jobMS, companyMS, and reviewMS.
* Initially, the services use H2 Database, later migrated to PostgreSQL.
* Microservices are containerized using Docker.
* Services can be deployed in a Kubernetes (K8s) cluster for scalability.
# ⚙️ Setup & Run
* Prerequisites
* Java 17+
* Maven
* Docker
* PostgreSQL (or use Docker for database)
* 

# 🎯 Future Enhancements
✅ Deploy on AWS (ECS, EKS)
✅ Implement API Gateway for unified access
✅ Add authentication & security (OAuth2, JWT)
✅ Use Kafka for event-driven communication
