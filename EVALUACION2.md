# EVALUACION 2 - Construccion-software-II-2026-Julian_Taborda

## Informacion general
- Estudiante(s): Julian Adolfo Taborda Marin
- Rama evaluada: master
- Commit evaluado: 9b0b11475518402b77569f147bac3a36cc1dc054
- Fecha: 2026-04-11

## Tabla de calificacion

| Criterio | Peso | Puntaje (1-5) | Aporte |
|---|---|---|---|
| 1. Modelado de dominio | 20% | 3 | 0.60 |
| 2. Modelado de puertos | 20% | 3 | 0.60 |
| 3. Modelado de servicios de dominio | 20% | 2 | 0.40 |
| 4. Enums y estados | 10% | 5 | 0.50 |
| 5. Reglas de negocio criticas | 10% | 3 | 0.30 |
| 6. Bitacora y trazabilidad | 5% | 3 | 0.15 |
| 7. Estructura interna de dominio | 10% | 3 | 0.30 |
| 8. Calidad tecnica base en domain | 5% | 2 | 0.10 |
| **SUBTOTAL** | | | **2.95** |

## Penalizaciones
- **Nomenclatura mixta menor (-5%):** detalles puntuales de consistencia tecnica.

Calculo: 2.95 x 0.95 = **2.80**

## Bonus
- +0.1 por trazabilidad con `OperationLog` y cobertura de eventos de operacion.

Total bonus: +0.1

## Nota final
**3.0 / 5.0**

---

## Hallazgos

### Positivos
- Buen modelo base con `User`, `BankAccount`, `Loan`, `Client` (abstract), `Transfer`, `OperationLog`.
- **9 enums** completos y alineados al dominio (`UserStatus`, `UserRole`, `AccountStatus`, `AccountType`, `LoanStatus`, `LoanType`, `TransferStatus`, `OperationType`, `Currency`).
- Estructura de puertos en `application/ports` con interfaces de entrada y salida.
- `OperationLog` aporta trazabilidad del proceso de negocio.

### Negativos
- Implementacion de servicios aun parcial para todos los casos de uso.
- Presencia de `double` en partes del modelo/servicios financieros.
- Falta mayor profundidad de reglas de aprobacion/rechazo por rol en dominio puro.

## Recomendaciones
1. Completar servicios por cada caso de uso del enunciado.
2. Sustituir `double` por `BigDecimal` en montos y tasas.
3. Consolidar invariantes de estado dentro de servicios de dominio.
