# Lab 15 – Git Workflow + GitHub Actions CI/CD

**Оюутан:** Энхүүш • Өрөө #321

## Төслийн бүтэц

```
lab15-starter/
├── pom.xml
├── README.md
└── src/
    ├── main/java/lab/
    │   ├── Calculator.java
    │   └── StringUtils.java
    └── test/java/lab/
        ├── CalculatorTest.java
        └── StringUtilsTest.java
```

## Локал build ажиллуулах

```bash
mvn -B clean verify
```

Coverage report: `target/site/jacoco/index.html`

## CI/CD

GitHub Actions pipeline нь Java 17 болон 21 дээр matrix build ажиллуулдаг.
JaCoCo coverage gate: ≥ 70%
