# EVALUACION 2 - Construccion-software-II-2026-Julian_Taborda

## Informacion general
- Estudiante(s): Julian Adolfo Taborda Marin
- Rama evaluada: N/A — no se encontraron ramas remotas develop ni main. Evaluado sobre codigo local disponible.
- Commit evaluado: N/A (sin rama remota verificable)
- Fecha: 2026-04-11

## Tabla de calificacion

| Criterio | Peso | Puntaje (1-5) | Aporte |
|---|---|---|---|
| 1. Modelado de dominio | 20% | 4 | 0.80 |
| 2. Modelado de puertos | 20% | 1 | 0.20 |
| 3. Modelado de servicios de dominio | 20% | 1 | 0.20 |
| 4. Enums y estados | 10% | 5 | 0.50 |
| 5. Reglas de negocio criticas | 10% | 2 | 0.20 |
| 6. Bitacora y trazabilidad | 5% | 4 | 0.20 |
| 7. Estructura interna de dominio | 10% | 4 | 0.40 |
| 8. Calidad tecnica base en domain | 5% | 4 | 0.20 |
| **SUBTOTAL** | | | **2.70** |

## Penalizaciones
- Ninguna detectada.

## Bonus
- Ninguno aplicable (sin puertos ni servicios).

## Nota final
**2.7 / 5.0**

> Nota: La evaluacion se realizo sobre el codigo local disponible. No se encontraron ramas `develop` ni `main` en el repositorio remoto. Se desconoce si el codigo enviado corresponde al estado final del estudiante.

---

## Hallazgos

### Positivos
- Estructura DDD correcta con carpetas `entities/` y `enums/` bien separadas.
- 8 entidades bien modeladas: `User` (abstracto), `NaturalClient`, `CompanyClient`, `BankAccount`, `Loan`, `Transfer`, `BankProduct`, `OperationLog`.
- 8 enums correctamente definidos con nombres en ingles: `AccountStatus`, `AccountType`, `Currency`, `LoanStatus` (incluye UNDER_REVIEW, APPROVED, REJECTED, DISBURSED), `LoanType`, `TransferStatus`, `UserRole`, `UserStatus`.
- `OperationLog` con `Map<String, Object> details` para trazabilidad flexible.
- Sin acoplamiento a Spring/JPA en la capa de dominio.
- `Transfer` incluye `createdByUser`, `approvedByUser`, `approvalDate` para rastrear aprobacion.
- `CompanyClient` incluye `legalRepresentative: NaturalClient`.

### Negativos
- **No existen puertos (interfaces de salida del dominio).** Sin contratos de persistencia.
- **No existen servicios de dominio.** Solo entidades y enums, sin implementacion de casos de uso.
- Las reglas de negocio (validacion de estados, aprobacion por rol, monto > 0) no estan implementadas en ningun servicio.
- No se pueden evaluar transiciones de estado ni enforcement de reglas al no haber servicios.

## Recomendaciones
1. Crear puertos por agregado: `ClientePort`, `CuentaBancariaPort`, `PrestamoPort`, `TransferenciaPort`, `OperationLogPort`.
2. Implementar servicios de dominio por caso de uso: `CreateLoanRequestService`, `ApproveLoanService`, `CreateTransferService`, `ApproveTransferService`, etc.
3. Establecer ramas `main` y `develop` en el repositorio remoto y hacer push del codigo.
