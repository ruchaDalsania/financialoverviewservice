# Financial Overview Service

[![BCH compliance](https://bettercodehub.com/edge/badge/BeyondBankingDays/financialoverviewservice?branch=master&token=dc474f0692cde4e8f907a3081acaabf5d3f66ad1)](https://bettercodehub.com/)

Returns the average monthly income, expense and savings of a customer

```bash
git clone https://github.com/arani87/financialoverviewservice.git
cd financialoverviewservice
mvnw.cmd clean install
docker build -t ssh/financialoverview .
docker run -p 8080:8080 -i ssh/financialoverview
```