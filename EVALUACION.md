# 📋 EVALUACIÓN - Sistema Bancario
**Proyecto:** Construccion-software-II-2026-Julian_Taborda
**Estudiante:** Julián Adolfo Taborda Marín
**Fecha de evaluación:** 23/03/2026
**Nota final: 4.7 / 5.0**

---

## 📊 Tabla de Puntajes

| Criterio | Peso | Puntaje (1-5) | Contribución |
|----------|------|----------------|--------------|
| 1. Modelado de dominio | 25% | 4 | 1.00 |
| 2. Relaciones entre entidades | 15% | 4 | 0.60 |
| 3. Uso de enums | 15% | 5 | 0.75 |
| 4. Manejo de estados | 5% | 5 | 0.25 |
| 5. Tipos de datos | 5% | 5 | 0.25 |
| 6. Separación Usuario vs Cliente | 10% | 3 | 0.30 |
| 7. Bitácora | 5% | 4 | 0.20 |
| 8. Reglas básicas de negocio | 5% | 2 | 0.10 |
| 9. Estructura del proyecto | 10% | 5 | 0.50 |
| 10. Repositorio | 10% | 3 | 0.30 |
| **TOTAL BASE** | 100% | | **4.25** |

### Bonus Aplicados

| Bonus | Puntaje |
|-------|---------|
| Código limpio y legible | +0.20 |
| Nombres claros y consistentes en inglés | +0.10 |
| Herencia parcial (NaturalClient extends User) | +0.10 |
| **Total bonus** | **+0.40** |

### Penalizaciones Aplicadas
Ninguna.

**NOTA FINAL: 4.65 → 4.7 / 5.0**

---

## 🔍 Análisis Detallado por Criterio

### 1. Modelado de dominio → 4/5
El proyecto modela las siguientes entidades correctamente:
- ✅ `User` — con `UserRole` y `UserStatus`
- ✅ `NaturalClient` (extends User) — cliente persona natural
- ✅ `CompanyClient` — cliente empresa con representante legal
- ✅ `BankAccount` — cuenta bancaria completa
- ✅ `Loan` — préstamo con montos, tasa, plazo, estado
- ✅ `Transfer` — transferencia con cuenta origen/destino, usuario creador/aprobador
- ✅ `BankProduct` — catálogo de productos bancarios
- ✅ `OperationLog` — bitácora con estructura flexible

**Observación:** `CompanyClient` no extiende ninguna clase base de cliente. El diseño mezcla ligeramente los conceptos de Usuario y Cliente al hacer que `NaturalClient` extienda `User`.

### 2. Relaciones entre entidades → 4/5
- ✅ `BankAccount` referencia al cliente vía `ownerId`
- ✅ `Loan` referencia al cliente vía `clientId` y la cuenta destino vía `destinationAccount`
- ✅ `Transfer` tiene `createdByUser` y `approvedByUser`
- ✅ `CompanyClient` tiene `legalRepresentative` de tipo `NaturalClient`
- ✅ `OperationLog` tiene `userId` y `affectedProductId`

**Observación menor:** La mayoría de relaciones usan identificadores String/Long en lugar de referencias directas a objetos. Es un enfoque válido pero limita la navegabilidad del modelo.

### 3. Uso de enums → 5/5
Implementación completa y correcta de todos los enums requeridos:
- ✅ `UserRole` — todos los 7 roles del sistema
- ✅ `UserStatus` — ACTIVE, INACTIVE, BLOCKED
- ✅ `AccountType` — SAVINGS, CHECKING, PERSONAL, BUSINESS
- ✅ `AccountStatus` — ACTIVE, BLOCKED, CANCELLED
- ✅ `Currency` — COP, USD, EUR
- ✅ `LoanStatus` — UNDER_REVIEW, APPROVED, REJECTED, DISBURSED, IN_DEFAULT, CLOSED
- ✅ `LoanType` — CONSUMER, VEHICLE, MORTGAGE, BUSINESS
- ✅ `TransferStatus` — PENDING, WAITING_APPROVAL, APPROVED, EXECUTED, REJECTED, EXPIRED

**Excelente trabajo:** ningún estado usa tipo String.

### 4. Manejo de estados → 5/5
Todos los estados de préstamo, cuenta, transferencia y usuario están modelados correctamente con enums. Los flujos de estados son coherentes con el dominio bancario descrito.

### 5. Tipos de datos → 5/5
- ✅ `BigDecimal` para montos financieros (`requestedAmount`, `approvedAmount`, `balance`)
- ✅ `LocalDate` para fechas (`openDate`, `approvalDate`)
- ✅ `LocalDateTime` para fechas/horas de transferencia
- ✅ `Long` para identificadores numéricos
- ✅ `double` para la tasa de interés (aceptable)

### 6. Separación Usuario vs Cliente → 3/5
- ✅ Existe la clase `User` con credenciales y rol del sistema
- ⚠️ `NaturalClient extends User` — esto mezcla el concepto de cliente (titular de cuentas) con usuario del sistema (acceso con credenciales)
- ❌ `CompanyClient` no extiende ninguna clase base, siendo una entidad independiente

Para una separación más limpia, `Cliente` debería ser una jerarquía independiente, y `Usuario` debería tener una referencia opcional a un cliente.

### 7. Bitácora → 4/5
- ✅ `OperationLog` con `Map<String, Object> details` para datos flexibles
- ✅ Tiene `userId`, `affectedProductId`, `dateTime`
- ⚠️ `operationType` es de tipo `String` en lugar de un Enum — sería más robusto con un enum `OperationType`
- ⚠️ `userRole` también es `String`

### 8. Reglas básicas de negocio → 2/5
Las entidades son estructurales. No se implementaron validaciones dentro de los modelos. No hay constructores con validación, ni métodos de negocio (`validarSaldo`, `aprobar`, etc.).

### 9. Estructura del proyecto → 5/5
Organización excelente:
```
com.bank.domain.entities/   → Todas las entidades
com.bank.domain.enums/      → Todos los enums
```
Paquetes claramente separados por responsabilidad.

### 10. Repositorio → 3/5
- ✅ README incluye nombre del estudiante, materia, horario, tecnologías, descripción del proyecto
- ⚠️ No se menciona el uso de ramas (`develop`, `feature`)
- ⚠️ No se especifica formato de commits (`ADD:` / `CHG:`)
- ⚠️ No se menciona tag de entrega

---

## 🌟 Puntos Destacables

- Implementación completa de todos los enums sin uso de String para estados
- Excelente uso de `BigDecimal` para valores monetarios
- Uso de `Map<String, Object>` para datos flexibles de la bitácora
- Código limpio, legible y en inglés
- Separación bien definida de paquetes

## 💡 Áreas de Mejora

1. Crear una jerarquía de `Cliente` independiente de `Usuario`
2. Agregar validaciones en constructores o métodos de negocio
3. Convertir `operationType` de `OperationLog` a enum
4. Documentar en README el uso de ramas y formato de commits
