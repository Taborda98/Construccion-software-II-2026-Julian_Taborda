# 🏦 Banking Management System (DDD)

## 📌 Project Information

**Student:** Julián Adolfo Taborda Marin
**Course:** Software Construction II
**Schedule:** Monday & Wednesday (20:00 - 22:00)

---

## 📖 Project Description

This project consists of the development of a **Bank Information Management System**, designed using **Domain-Driven Design (DDD)** principles.

The system manages:

* Clients (Natural and Company)
* Bank Accounts
* Loans
* Transfers
* Operation Logs (Audit)

It simulates a **core banking system**, enforcing business rules, validation logic, and role-based access control.

---

## 🧠 Architecture: Domain-Driven Design (DDD)

The project follows a layered architecture:

```
com.bank
│
├── domain
│   ├── entities
│   ├── enums
│
├── application
│   ├── ports
│   │   ├── input
│   │   └── output
│   ├── services
│
├── infrastructure (future implementation)
│
└── Main.java
```

---

## 🧩 Key Design Decisions

### ✔ Separation of User vs Client

* **User** → Handles authentication and roles (system access)
* **Client** → Represents the owner of bank products

This separation avoids mixing responsibilities and follows DDD best practices.

Hierarchy:

```
Client (abstract)
├── NaturalClient
└── CompanyClient

User → references Client (optional)
```

---

### ✔ Operation Log (Audit System)

* Uses flexible structure with `Map<String, Object>`
* Stores all relevant operations
* Designed for NoSQL-like behavior

Improvements:

* `OperationType` implemented as ENUM
* `UserRole` implemented as ENUM

---

### ✔ Business Rules Inside Entities

Entities now contain real business logic:

Examples:

* BankAccount:

  * Prevent negative balance
  * Validate withdrawals
* NaturalClient:

  * Must be over 18 years old
* Loan:

  * Validates approval amount

This ensures consistency and domain integrity.

---

## ⚙️ Features Implemented

* Account creation
* Money transfers
* Loan requests and approvals
* Balance validation
* Role-based operation restrictions
* Operation logging (audit trail)

---

## 🔐 Business Rules

* Unique identification for clients
* No operations on blocked accounts
* Transfers require sufficient balance
* Loan approval only by authorized roles
* High-value transfers require approval
* Transfer expiration after time limit

---

## 🗂️ Technologies Used

* Java (JDK 17+ recommended)
* VS Code
* Git & GitHub

---

## 🌿 Branching Strategy

The project follows a structured Git workflow:

* `main` → stable version
* `develop` → integration branch
* `feature/*` → new features

Example:

```
feature/transfer-service
feature/loan-approval
```

---

## 📝 Commit Convention

Commits follow a clear and consistent format:

* `ADD:` New feature
* `CHG:` Change or improvement
* `FIX:` Bug fix

Examples:

```
ADD: Transfer service implementation
CHG: Improved validation in BankAccount
FIX: Null pointer in User creation
```

---

## 🚀 How to Run

1. Open the project in VS Code
2. Ensure Java Extension Pack is installed
3. Run `Main.java`

---

## 🧪 Current Status

✔ Domain model completed
✔ DDD architecture applied
✔ Business rules partially implemented
✔ In-memory simulation working

---

## 🔮 Future Improvements

* Database integration (SQL + NoSQL)
* REST API (Spring Boot)
* Authentication system (JWT)
* Unit testing (JUnit)
* Role-based security enforcement

---

## 🏷️ Release Version

**v1.0 - Final Project Delivery**

---

## 📌 Notes

This project prioritizes **clean architecture, domain modeling, and business logic implementation**, rather than UI or persistence layers.

---
